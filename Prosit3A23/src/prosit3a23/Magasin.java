/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit3a23;

/**
 *
 * @author Mohamed
 */
public class Magasin {
    private int id ;
    private String adresse ;
    private int capacite; 
    private Produit[] produits;
    
public  Magasin(){
      this.produits= new Produit[50];
   
}    
public Magasin (int id ,String adresse){
    this.id=id;
    this.adresse= adresse ;
    this.capacite=0;
     this.produits= new Produit[50];
}
public void ajouterProduit (Produit p){
    if (this.capacite<50){
    
    //tab[i]=2;    
    produits[this.capacite]=p;
    this.capacite++;
    }else 
    {
        System.out.println("Tableau plient .....");
    }
}


public String toString (){
    String str ="";
    for (int i =0 ; i<this.capacite;i++){
        //str=str+"7ajja"
        str+="\n nom  "+produits[i].getLibelle()+"  Prix"+produits[i].getPrix();
    }
    
    
    return "le maginsin  id :"+this.id+"\nadresse "+this.adresse+"\n Produit "+str;
}
}
