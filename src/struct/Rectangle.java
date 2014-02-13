package struct;
import java.awt.Graphics;
//import color;

public class Rectangle extends Shape {
      
// 	private int x;
// 	private int y;
	private int width;
	private int height;
// 	//TODO: implémenter la relation entre Rectangle et Color
// 	private Color color;
      
	public Rectangle(int x,int y,int width, int height,Color color){
	    super(x,y,color);
	    //this.color=color;
// 	    this.x=x;
// 	    this.y=y;
	    this.width=width;
	    this.height=height;

	}

	//TODO: implémenter la méthode move
// 	public void move(int dx, int dy)
// 	{
// 	  x+=dx;
// 	  y+=dy;
// 	}
// 	
	public void draw(Graphics g) {
		// la ligne suivante marchera seulement si la relation entre Rectangle et Color est bien faite
		g.setColor(new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue()));
		g.fillRect(x, y, width, height);
	}
}
