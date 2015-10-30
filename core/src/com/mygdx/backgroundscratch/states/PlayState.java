package com.mygdx.backgroundscratch.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.backgroundscratch.BackgroundScratch;

/**
 * Created by Matthew on 10/29/2015.
 */
public class PlayState extends State {

    public PlayState(GameStateManager gsm) {
        super(gsm);
        camView.setToOrtho(false, BackgroundScratch.WIDTH / 2, BackgroundScratch.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float fDeltaTime) {
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camView.combined);
        sb.begin();
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
