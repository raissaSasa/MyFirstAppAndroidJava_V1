package com.example.myapplication;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Créer deux objets personnes avec un nom, prénom, date de naissance et adresse.
 * La première personne est de sexe masculin et l'autre de sexe féminin.
 * L'homme au départ avait une adresse à 255 rue agodékè à la création mais a effectué un déménagement à 002
 * Totsi. effectuez ce changement avec un ligne de code.
 * A la création de l'objet personne de sexe féminin, donnez lui comme date de naissance le 31/12/1998 et pour l'homme une date que vous même allez inventer.
 * ensuite écrivez une ligne de code de façon à affecter la date de naissance de la femme à l'homme et l'adresse de l'homme actuelle à la femme.
 * NB: le nom le prenom la date de naissance et l'adresse sont des chaines de caractères.
 * Ecrivez une méthode qui permet de retourner l'âge de chacun.
 **/


// Pers1:  "KANTE", "Abalo", "12/12/1994","255 rue agodékè",'M' -> locate:"002 Totsi"
// Pers2:  "ETSE", "Afi", "31/12/1998","", 'F'
public class Person {
    private String name;
    private String firstname;
    private int age;
    private String birthday;
    private String locate;

    private char gender;
    private String email;

    public Person(String name, String firstname, int age, String birthday, String locate,char gender, String email){
        this.name = name;
        this.firstname = firstname;
        this.age = age;
        this.birthday = birthday;
        this.locate = locate;
        this.gender = gender;
        this.email = email;
    }

    public Person(String name, String firstname, String birthday, String locate,char gender, String email){
        this.name = name;
        this.firstname = firstname;
        this.birthday = birthday;
        this.locate = locate;
        this.gender = gender;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getFirstname(){
        return firstname;
    }
    public int getAge(){
        return age;
    }

    public String getBirthday(){
        return birthday;
    }

    public String getLocate(){
        return locate;
    }

    public char getGender(){
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAge(int yourAge){
        this.age = yourAge;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public void setLocate(String locate){
        this.locate = locate;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void myInfo(){
        System.out.println("I am :"+this.name+" "+this.firstname+", I am live in "+this.locate+" and my birthday is :"+this.birthday+"; My gender is :"+this.gender);
    }

    public void calculateAge(String birthdayYearString){
        int birthdayYearInt = Integer.parseInt(birthdayYearString.substring(6, 10));
        Calendar c = Calendar.getInstance();

        if (birthdayYearInt < 2023 ) {
            System.out.println(this.name+" "+this.firstname+" has :"+(2023-birthdayYearInt)+" years old");
        }
    }

}


