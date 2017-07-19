package me.skreem.game.events.round;

import me.skreem.game.Game;
import me.skreem.game.events.GameStateChangeEvent;

public class RoundFreezetimeEvent extends GameStateChangeEvent {
    public RoundFreezetimeEvent(Game game) {
        super(game);
    }
}
