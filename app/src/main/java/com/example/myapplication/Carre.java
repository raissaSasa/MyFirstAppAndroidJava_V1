package com.example.myapplication;

class Carre {
    private int cote;

    public Carre(int cote){
        this.cote = cote;
    }

    public int getCote(){
        return cote;
    }

    public void setCote(int value_cote){
        this.cote = value_cote;
    }

    public int perimeter(){
        return cote*4;
    }

    public int surface(){
        return cote*cote;
    }



}
