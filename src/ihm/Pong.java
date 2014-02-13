package ihm;

import struct.*;
import ihm.Window;
import java.util.Vector;

/**Classe gérant l'éxécution et la collision.
	 * @param  
	 * */
public class Pong {
    private int nb_triangle;
    private int nb_cercle;
    private int nb_mur_centre;
    private int nb_mur_verticale;
    private int nb_mur_horizontale;
    
    private int heigth_window;
    private int width_window;
    
    private Window  window;
    private Vector<Mobile> mobile = new Vector <Mobile>();
    private Vector<Mur> mur = new Vector <Mur>();
 
    /** fonction d'exécution.
	  *@param Aucun.
	  **/
    public Pong(Window window,int nb_triangle, int nb_cercle,int nb_mur_centre){
      this.window = window;
      heigth_window = window.getHeigth();
      width_window = window.getWidth();
      this.nb_cercle = nb_cercle;
      this.nb_triangle = nb_triangle;
      this.nb_mur_centre = nb_mur_centre;
      
      init();
    
    }
    /** Fonction gérant l'initialisation du jeu
      
	*@param Aucun.
	
	**/
    private void init(){
	// Calcul du nombre de Mur à la vertical.
	// 20 -> hauteur du mur
	// 10 -> largeur du mur
	nb_mur_verticale = heigth_window/20;
	nb_mur_horizontale = (width_window-2*10)/20;
	Couleur col1 = new Couleur(2,155,5);
	int coordonne_x = 0;
	int coordonne_y = 0;
	// Mur vertical
	for(int i =0;i<nb_mur_verticale;i++){
	  //System.out.println("x = 0; y= "+i*20);
	  coordonne_x = 0;
	  coordonne_y = i*20;
	  Mur r1= new Mur(coordonne_x,i*20,col1,10,20,1.,1.);
	  //Mur(int x,int y,Couleur color, int h, int l, double orientation, double coef)
	  
	  //Mur r1=new Mur(5,i*20,10,20,col1);
	  window.addMur(r1);
	  coordonne_x = width_window - 20;
	  Mur r2=new Mur(coordonne_x,coordonne_y,col1,10,20,1.,1.);
	  window.addMur(r2);
	}
	
	
	
    }
    public void execute(){
      
    }
        
    /** Fonction gérant les collisions
      
	*@param Aucun.
	
	**/
    public void collision(){
    
    }
    
    public void addMur(Mur m){
	mur.addElement(m);
    }
}