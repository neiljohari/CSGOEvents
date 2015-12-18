package me.skreem.game.events.bomb;

import me.skreem.game.Game;
import me.skreem.game.events.GameStateChangeEvent;

public class BombDefuseEvent extends GameStateChangeEvent {
    public BombDefuseEvent(Game game) {
        super(game);
    }
}
