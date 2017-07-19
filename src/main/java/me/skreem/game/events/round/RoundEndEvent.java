package me.skreem.game.events.round;

import me.skreem.game.Game;
import me.skreem.game.events.GameStateChangeEvent;

public class RoundEndEvent extends GameStateChangeEvent {
    public RoundEndEvent(Game game) {
        super(game);
    }
}
