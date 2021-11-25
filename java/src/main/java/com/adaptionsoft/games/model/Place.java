package com.adaptionsoft.games.model;

/**
 * Place dans le plateau
 */
public class Place {
    public int getPlaceNum() {
        return placeNum;
    }

    public void setPlaceNum(int placeNum) {
        this.placeNum = placeNum;
    }

    int placeNum;

    public Place(int placeNum) {
        this.placeNum = placeNum;
    }
}
