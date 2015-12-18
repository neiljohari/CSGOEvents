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
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HttpEventHandler implements HttpHandler {
    private int bombStateDebounce = -1;
    private Gson gson;

    public HttpEventHandler() {
        gson = new Gson();
    }

    public void handle(HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod();

        InputStream in = exchange.getRequestBody();

        String string = IOUtils.toString(in, "utf-8");

        Game game = gson.fromJson(string, Game.class);
        parseBombState(game);

        Headers responseHeaders = exchange.getResponseHeaders();
        responseHeaders.set("Content-Type", "text/plain");
        OutputStream responseBody = exchange.getResponseBody();
        responseBody.write(0);
        responseBody.flush();
        exchange.sendResponseHeaders(200, 0);

        responseBody.close();
    }

    private void parseBombState(Game game) {
        Round round = game.getRound();
        String bombState = round.getBomb();

        if (bombState.equals("exploded") && bombStateDebounce != 1) {
            bombStateDebounce = 1;
            Event.callEvent(new BombExplodeEvent(game));
        }

        if (bombState.equals("planted") && bombStateDebounce != 2) {
            bombStateDebounce = 2;
            Event.callEvent(new BombPlantEvent(game));
        }

        if (bombState.equals("defused") && bombStateDebounce != 3) {
            bombStateDebounce = 3;
            Event.callEvent(new BombDefuseEvent(game));
        }
    }
}
