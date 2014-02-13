package struct;
import java.awt.Graphics;

import struct.*;
import ihm.*;

public abstract class Forme
{
  // ATTRIBUTS PRIVES
  protected int X;
  protected int Y;
  protected int hauteur;
  protected int largeur;
  protected double orientation;
  protected Couleur couleur;
  protected Pong p;
  
  // CONSTRUCTEUR PUBLIC
  // constructeur sans couleur (r,v,b)
  public Forme(int x, int y, int h, int l, double o) 
    {
  
    setX(x);
    setY(y);
    setHauteur(h);
    setLargeur(l);
    setOrientation(o);
  }

  // constr. avec couleur
   //Forme(int,int,Couleur,int,int,double)
   public Forme(int x, int y,Couleur color, int h, int l, double o) 
  {
    setX(x);
    setY(y);
    setHauteur(h);
    setLargeur(l);
    setOrientation(o);
    addCouleur(color);
  }
  

  // METHODES PUBLIC
  // ajouter une couleur à la forme
  public void addCouleur(Couleur c)
  {
    this.couleur=c;
  }
  
  abstract void dessine(Graphics g);
   
  
  // MUTATEURS PUBLIC
  public void setX(int x)
  {
    this.X=x;
  }
  public void setY(int y)
  {
    this.Y=y;
  }
  public void setHauteur(int h)
  {
    this.hauteur=h;
  }
  public void setLargeur(int l)
  {
    this.largeur=l;
  }
  public void setOrientation(double o)
  {
    this.orientation=o;
  }
  public void setCouleur(int r, int v, int b)
  {
    getCouleur().setRVB(r,v,b);
  }
  
  //ACCESSEURS PUBLIC
  public int getX()
  {
    return this.X;
  }
  public int getY()
  {
    return this.Y;
  }
  public int getHauteur()
  {
    return this.hauteur;
  }
  public int getLargeur()
  {
    return this.largeur;
  }
  public double getOrientation()
  {
    return this.orientation;
  }
  public Couleur getCouleur()
  {
    return this.couleur;
  }
  }
