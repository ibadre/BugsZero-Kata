package com.adaptionsoft.games.model;

/**
 * model de joueur
 */
public class Player {

    public Player(String playerName) {
        this.name = playerName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
