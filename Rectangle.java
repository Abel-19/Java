class Ractangle {
   public static void main (String[] args)
   {
     System.out.print("Entrez la longueur du rectangle: ");
     double longueur = nextDouble();
     
     System.out.print("Entrez la largeur du rectangle: ");
     double largeur = nextDouble();
     double surface = longueur * largeur;
     
     System.out.println("La surface du rectangle est : "+surface);
   }

private static double nextDouble() {
	return 0;
}
}