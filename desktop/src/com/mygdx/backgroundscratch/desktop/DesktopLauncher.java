package com.mygdx.backgroundscratch.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.backgroundscratch.BackgroundScratch;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = BackgroundScratch.WIDTH;
		config.height = BackgroundScratch.HEIGHT;
		config.title = BackgroundScratch.TITLE;
		new LwjglApplication(new BackgroundScratch(), config);
	}
}
