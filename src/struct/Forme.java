package struct;
import struct.*;
import ihm.*;

public abstract class Forme
{
  // ATTRIBUTS PRIVES
  private int X;
  private int Y;
  private int hauteur;
  private int largeur;
  private double orientation;
  private Couleur couleur;
  private Pong p;
  
  // CONSTRUCTEUR PUBLIC
  public Forme(int x, int y, int h, int l, double o) // constructeur sans couleur (r,v,b)
  {
  
    setX(x);
    setY(y);
    setHauteur(h);
    setLargeur(l);
    setOrientation(o);
  }


   public Forme(int x, int y, int h, int l, double o, int r, int v, int b) // constr. avec couleur
   //Forme(int,int,Couleur,int,int,double)
  {
    setX(x);
    setY(y);
    setHauteur(h);
    setLargeur(l);
    setOrientation(o);
    addCouleur(r,v,b);
  }
  

  // METHODES PUBLIC
  public void addCouleur(int r, int v, int b) // ajouter une couleur à la forme
  {
    Couleur c = new Couleur(r,v,b,this);
    this.couleur=c;
  }
  
  public abstract void dessine();
   
  
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
