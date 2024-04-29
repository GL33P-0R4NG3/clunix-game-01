package entity;

import main.Directions;
import main.LoadSave;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import static main.LoadSave.GetSpriteAtlas;
import static main.LoadSave.PLAYER_ATLAS;

public class Player extends Entity {
    private int speed = 5;
    public BufferedImage[][] animations;
    private Directions dir;

    public Player(float x, float y, int width, int height, int lives) {
        super(x, y, width, height, GetSpriteAtlas("player_sprites.png")[1][2]);
        this.dir = Directions.LEFT;
    }
    public void loadAni(){
        BufferedImage img = LoadSave.GetSpriteAtlas("play_sprites.png");
        animations = new BufferedImage[1][5];
    }

    public void update() {
    }
    public void render(Graphics g) {
    }

    public void ateProduct(Products products) {
    }
}
