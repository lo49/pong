package struct;
import java.awt.Graphics;
//import color;

public class Circle extends Shape{
// 	private int x;
// 	private int y;
	private int rayon;
// 	private int height;
// 	private Color color;

	public Circle(int x,int y,int rayon,Color c){
	super(x,y,c);
// 	    color=new Color(200,50,0);
// 	    this.x=x;
// 	    this.y=y;
	    this.rayon=rayon;
	    //this.height=rayon;

	}
	//TODO: implémenter la méthode move
// 	public void move(int dx, int dy)
// 	{
// 	  x+=dx;
// 	  y+=dy;
// 	}
  public void move(int dx,int dy){
    x += 2*dx;
    y += 2*dy;
  }
	
	public void draw(Graphics g) {
		// la ligne suivante marchera seulement si la relation entre Rectangle et Color est bien faite
		g.setColor(new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue()));
		g.fillOval(x, y, rayon, rayon);
	}
}
