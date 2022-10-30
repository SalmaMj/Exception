package prosit3a23;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Prosit3A23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "lait", "delice");
        Produit p3 = new Produit(2510, "Yaourt", "vitalait");
        Produit p4 = new Produit(3250, "tomate", "sicam", 1.2f);

        p2.prix = 0.7f;
//        
//        
//        
////        p1.afficher();
////        
////        System.out.println("*************");
////        
////        p2.afficher();
////        System.out.println("*************");
////      
////        p3.afficher();
////          System.out.println("*************");
////      
////        p4.afficher();
//          System.out.println("*************");
//        System.out.println( p1.toString());
//    
//    
        Magasin aziza = new Magasin(1, "ESPRIT ");

        aziza.ajouterProduit(p4);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(new Produit(2, "tomate", "tomate"));

        System.out.println(aziza.toString());

    }

}
