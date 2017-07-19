package me.skreem.game.events.bomb;

import me.skreem.game.Game;
import me.skreem.game.events.GameStateChangeEvent;

public class BombPlantEvent extends GameStateChangeEvent {
    public BombPlantEvent(Game game) {
        super(game);
    }
}
