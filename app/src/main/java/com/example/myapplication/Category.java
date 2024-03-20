package com.example.myapplication;

/**
 * Un étagère comporte des biscuits. les biscuits sont classés par catégorie. Une catégorie a plusieurs biscuits et un biscuit appartient à une seule catégorie.
 * Pour un biscuit on a un nom, un identifiant, un poids, une saveur, et un prix. pour une catégorie, on a un nom et un identifiant.
 * écrivez une méthode qui retourne la liste des noms des biscuits d'une catégorie, le prix total des des biscuits pour une catégorie donnée.
 * Choisissez un biscuit au hasard affichez ses informations et affichez sa catégorie.
 */

public class Category {
    private Integer idCategory;
    private String label;

    public Integer getIdCategory(){
        return idCategory;
    }
    public String getLabel(){
        return label;
    }

    public  Category(Integer idCategory, String label){
        this.idCategory = idCategory;
        this.label = label;
    }
}
