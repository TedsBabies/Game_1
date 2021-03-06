/*
 * Buildable.java
 *
 * Created on 23-Dec-2012
 * @Author Harry
 *
 * Copyright(c) 2012  Harry Torry.  All Rights Reserved.
 * This software is the proprietary information of Harry Torry.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted under the terms of the BSD License,
 *  with the following additional (non-free) restrictions:
 *  
 *  1.)  No portion of this notice shall be removed.
 *  2.)  Credit shall not be taken for the creation of this source.
 *  3.)  This code is not to be traded, sold, or used for gain or profit.
 *
 *
 */
package building;

import game.ResourceManager;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Buildable {

    float x, y;
    int w, h, cost;
    Image baseImage;
    public static final int BUILDING_BARRACKS = 1;

    Buildable(int type, int x, int y) {
        this.x = x;
        this.y = y;

        switch (type) {
            case BUILDING_BARRACKS:
                baseImage = ResourceManager.getInstance().getImage("ingame_building_barrack");
                break;

        }



    }

    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        // Create new unit
    }

    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        baseImage.draw(x, y);
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(int c) {
        this.cost = c;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
}
