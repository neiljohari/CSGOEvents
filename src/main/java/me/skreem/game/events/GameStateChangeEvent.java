package me.skreem.game.events;

import me.skreem.game.Game;

public abstract class GameStateChangeEvent extends NotifyEvent {
    protected Game game;

    public GameStateChangeEvent(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
