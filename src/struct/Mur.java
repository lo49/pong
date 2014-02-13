package struct;
import java.awt.Graphics;

import struct.*;
import ihm.*;

public class Mur extends Forme {

	private double coefficient;

	public Mur(int x,int y,Couleur color, int h, int l, double orientation, double coef){
		super(x,y,color,h,l,orientation);
		//Forme(int x, int y, int h, int l, double o, int r, int v, int b) 		
		this.coefficient=coef;
	}

	
	public void dessine(Graphics g) {
		g.setColor(new java.awt.Color(couleur.getRouge(), couleur.getVert(), couleur.getBleu()));
		g.fillRect(X, Y, largeur, hauteur);
	}
}
