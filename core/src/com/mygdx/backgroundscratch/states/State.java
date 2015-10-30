package com.mygdx.backgroundscratch.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Matthew on 10/29/2015.
 */
public abstract class State {
    protected OrthographicCamera camView;
    protected Vector3 v3Mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        camView = new OrthographicCamera();
        v3Mouse = new Vector3();
    }

    protected abstract void handleInput();
    public abstract void update(float fDeltaTime);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
}
