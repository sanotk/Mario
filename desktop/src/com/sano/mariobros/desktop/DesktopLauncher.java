package com.sano.mariobros.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sano.mariobros.MarioBros;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Mario Bros Game";
        config.width = 1200;
        config.height = 624;
		new LwjglApplication(new MarioBros(), config);
	}
}
