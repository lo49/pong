package main;

import ihm.Window;
import struct.*;

public class Appli {

	public static void main(String[] args) {

		Window window = new Window("Pong", 700,500);
		
		Pong pong = new Pong(window,1,1,1);
		
		//window.paint();
		//TODO: créer 3 objets de type Rectangle et les ajouter à la fenêtre

	}
}
