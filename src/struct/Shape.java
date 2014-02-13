package struct;
import java.awt.Graphics;

public abstract class Shape {
  protected int x; 
  protected int y;
  protected Color color;
  public void move(int dx,int dy){
    x += dx;
    y += dy;
  }
  public abstract void dessine(Graphics g);
  public Shape(int x,int y,Color c){
	    color = c;
	    this.x=x;
	    this.y=y;
  }
}