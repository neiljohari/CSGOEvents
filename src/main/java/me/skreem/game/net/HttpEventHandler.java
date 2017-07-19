package me.skreem.game.net;

import com.google.gson.Gson;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import me.skreem.event.Event;
import me.skreem.game.events.bomb.BombDefuseEvent;
import me.skreem.game.events.bomb.BombExplodeEvent;
import me.skreem.game.events.bomb.BombPlantEvent;
import me.skreem.game.Game;
import me.skreem.game.Round;
import me.skreem.game.events.bomb.BombState;
import me.skreem.game.events.round.RoundEndEvent;
import me.skreem.game.events.round.RoundFreezetimeEvent;
import me.skreem.game.events.round.RoundStartEvent;
import me.skreem.game.events.round.RoundState;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HttpEventHandler implements HttpHandler {
    private BombState bombState = null;
    private RoundState roundState = null;
    private Gson gson;

    public HttpEventHandler() {
        gson = new Gson();
    }

    public void handle(HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod();

        InputStream in = exchange.getRequestBody();

        String string = IOUtils.toString(in, "utf-8");

        Game game = gson.fromJson(string, Game.class);
        parseRoundPhase(game);
        parseBombState(game);


        Headers responseHeaders = exchange.getResponseHeaders();
        responseHeaders.set("Content-Type", "text/plain");
        OutputStream responseBody = exchange.getResponseBody();
        responseBody.write(0);
        responseBody.flush();
        exchange.sendResponseHeaders(200, 0);

        responseBody.close();
    }

    private void parseRoundPhase(Game game){
        Round round = game.getRound();
        RoundState state = RoundState.valueOf(round.getPhase().toUpperCase());

        if (state == RoundState.FREEZETIME && roundState != RoundState.FREEZETIME) {
            roundState = RoundState.FREEZETIME;
            Event.callEvent(new RoundFreezetimeEvent(game));
        }

        if (state == RoundState.LIVE && roundState != RoundState.LIVE) {
            roundState = RoundState.LIVE;
            Event.callEvent(new RoundStartEvent(game));
        }

        if (state == RoundState.OVER && roundState != RoundState.OVER) {
            roundState = RoundState.OVER;
            Event.callEvent(new RoundEndEvent(game));
        }
    }

    private void parseBombState(Game game) {
        Round round = game.getRound();
        BombState state = BombState.valueOf(round.getBomb().toUpperCase());

        if (state == BombState.EXPLODED && bombState != BombState.EXPLODED) {
            bombState = BombState.EXPLODED;
            Event.callEvent(new BombExplodeEvent(game));
        }

        if (state == BombState.PLANTED && bombState != BombState.PLANTED) {
            bombState = BombState.PLANTED;
            Event.callEvent(new BombPlantEvent(game));
        }

        if (state == BombState.DEFUSED && bombState != BombState.DEFUSED) {
            bombState = BombState.DEFUSED;
            Event.callEvent(new BombDefuseEvent(game));
        }
    }
}
