package me.skreem.game.events.round;

import me.skreem.game.Game;
import me.skreem.game.events.GameStateChangeEvent;

public class RoundStartEvent extends GameStateChangeEvent {
    public RoundStartEvent(Game game) {
        super(game);
    }
}
