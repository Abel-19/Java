import java.lang.Math;
public class Rectangle extends Figure{

   public Rectangle (){
   }

    public Rectangle (double longueur){
       this.longueur=longueur;
   }
    public Rectangle (double longueur){
       this.largeur=largeur;
   }

 
   public double demiPerimetre() {
      return this.longueur+this.largeur;
   }   

 
   public double demiPerimetre() {
      return (this.longueur+this.largeur)*2;
   }   

  
   public double surface() {
     return this.longueur*this.largeur;
} 


  
   public double diagonale(){
     return Math.sqrt(Math.pow(this.longueur,2)+Math.pow(this.largeur,2));
     
   }   

}