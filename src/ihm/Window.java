package ihm;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import struct.*;


public class Window extends JFrame implements KeyListener {

        private String name;
        private int width;
        private int height;
	/*try{
	private Vector <Triangle> tris=new Vector <Triangle>();
	}catch{*/
	private Vector <Rectangle> rects=new Vector <Rectangle>();
	//}
	private Vector <Circle> circs=new Vector <Circle>();
	//TODO : implémenter la relation entre Window et Rectangle (puis entre Window et Circle)

	public Window(String name, int width, int height) {
		
		super("Frame");
                this.name = name;
                this.width = width;
                this.height = height;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(name);
		setPreferredSize(new Dimension(this.width, this.height));
		
		// show the frame 
		pack();
		setVisible(true);
		// add the Listener
		addKeyListener(this);
	}


	/**Déplace tous les éléments graphiques
	 * @param dx déplacement suivant l'axe des abscisses
	 * @param dy déplacement suivant l'axe des ordonnées
	 * */
	public void moveAll(int dx, int dy) {
		//TODO: déplacer les éléments graphiques de la Window
		for(int i=0;i<rects.size();i++)
		{
			rects.elementAt(i).move(dx,dy);
		}
		for(int i=0;i<circs.size();i++)
		{
			circs.elementAt(i).move(dx,dy);
		}
	}

	/**Dessine tous les éléments graphiques
	 * @param g contexte graphique qui fourni les fonctionnalités de dessin
	 * */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//TODO: appeler la draw des éléments graphiques de la Window
		for(int i=0;i<rects.size();i++)
		{
			rects.elementAt(i).draw(g);
		}
		for(int i=0;i<circs.size();i++)
		{
			circs.elementAt(i).draw(g);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();

		if (keyCode == KeyEvent.VK_RIGHT) {//flèche ->
			System.out.println("Bouton, (fleche ->)");
			moveAll(1, 0);
		}

		else if(keyCode == KeyEvent.VK_LEFT) {//flèche <-
			System.out.println("Bouton, (fleche <-)");
			moveAll(-1, 0);
		}

		else if(keyCode == KeyEvent.VK_UP) {//flèche du haut
			System.out.println("Bouton, (fleche du haut)");
			moveAll(0, -1); //-1 (et non +1) car le repère est inversé sur l'axe des y (origine = point haut à gauche)
		}

		else if(keyCode == KeyEvent.VK_DOWN) {//flèche du bas
			System.out.println("Bouton, (fleche du bas)");
			moveAll(0, 1);
		}

		repaint(); //rafraichit le canvas (en appelant paintComponent())
	}

	@Override
	public void keyReleased(KeyEvent e) {	
	}

	public void addRectangle(Rectangle r) {
		rects.addElement(r);
	}


	public void addCircle(Circle c) {
		circs.addElement(c);
	}
	
	public int getHeigth(){
	return height;
	}
	public int getWidth(){
	return width;
	}

}
