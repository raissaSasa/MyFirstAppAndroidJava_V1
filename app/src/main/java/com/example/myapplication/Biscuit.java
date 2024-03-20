package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Un étagère comporte des biscuits. les biscuits sont classés par catégorie. Une catégorie a plusieurs biscuits et un biscuit appartient à une seule catégorie.
 * Pour un biscuit on a un nom, un identifiant, un poids, une saveur, et un prix. pour une catégorie, on a un nom et un identifiant.
 * écrivez une méthode qui retourne la liste des noms des biscuits d'une catégorie, le prix total des des biscuits pour une catégorie donnée.
 * Choisissez un biscuit au hasard affichez ses informations et affichez sa catégorie.
 */

public class Biscuit {
    private Integer idBiscuit;
    private String label;
    private String flavour;
    private float price;
    private Category category;

    public Biscuit(){

    }
    public Biscuit(Integer idBiscuit, String label, float price, Category category){
        this.idBiscuit = idBiscuit;
        this.label = label;
        this.price = price;
        this.category = category;
    }
    public Integer getIdBiscuit(){
        return idBiscuit;
    }
    public String getLabel(){
        return label;
    }
    public  float getPrice(){
        return price;
    }

    public void setIdBiscuit(Integer idBiscuit){
        this.idBiscuit = idBiscuit;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void listBiscuit(Integer idCategory, ArrayList<Biscuit> myListOfBiscuit){
        float sum = 0;
        int i = 0;
        for (Biscuit b : myListOfBiscuit) {
            if (idCategory.equals(b.category.getIdCategory())){
                sum += b.price;
                System.out.println("BISCUIT N°" + (++i) + ": Name="+b.getLabel());
            }
            //ArrayList<Biscuit> myListOfBiscuit = new ArrayList<Biscuit>();
        }
        if (sum>0){
            System.out.println("Total amount is :"+sum);
        }

    }
}
