package me.skreem.game.events.bomb;

import me.skreem.game.Game;
import me.skreem.game.events.GameStateChangeEvent;

public class BombExplodeEvent extends GameStateChangeEvent {
    public BombExplodeEvent(Game game) {
        super(game);
    }
}
