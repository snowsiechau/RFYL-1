package game.items;

import game.Utils;
import game.bases.GameObject;
import game.bases.renderer.ImageRenderer;

/**
 * Created by Nttung PC on 8/4/2017.
 */
public class Heart extends GameObject{
    public Heart() {
        this.renderer = new ImageRenderer(Utils.loadImage("assets/images/items/heart.png"));
    }
}
