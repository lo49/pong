package struct;
public class Couleur
{
  // ATTRIBUTS PRIVES
  private int rouge;
  private int vert;
  private int bleu;
  private Forme forme;
  
 
  // CONSTRUCTEUR
  public Couleur(int r, int v, int b, Forme f)
  {
    setRouge(r);
    setVert(v);
    setBleu(b);
    setForme(f);    
  }
  
  // CONSTRUCTEUR
  public Couleur(int r, int v, int b)
  {
    setRouge(r);
    setVert(v);
    setBleu(b);
   }

  // ACCESSEURS PUBLICS
  public int getRouge()
  {
    return this.rouge;
  }
  public int getVert()
  {
    return this.vert;
  }
  public int getBleu()
  {
    return this.bleu;
  }
  public Forme getForme()
  {
    return this.forme;
  }
  
  // MUTATEURS PUBLICS
  public void setRVB(int r, int v, int b)
  {
    setRouge(r);
    setVert(v);
    setBleu(b);
  }
  public void setRouge(int r)
  {
    if (r<0 && r>255)
      {this.rouge=r;}
    else 
      {System.out.println("error : rouge doit etre compris entre 0 et 255");}
  }
  public void setVert(int v)
  {
    if (v<0 && v>255)
      {this.vert=v;}
    else 
      {System.out.println("error : vert doit etre compris entre 0 et 255");}
  }
  public void setBleu(int b)
  {
    if (b<0 && b>255)
      {this.bleu=b;}
    else 
      {System.out.println("error : bleu doit etre compris entre 0 et 255");}
  }
  public void setForme(Forme f)
  {
    this.forme=f;
  }
}