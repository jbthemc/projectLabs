package org.fasttrackit.lab5Magazin;

import java.util.List;

public class Produs {
    private String name;
    private int pret;
    private int stock;
    private String descriere;

    private List<CategorieProdus> categorii;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public List<CategorieProdus> getCategorii() {
        return categorii;
    }

    public void setCategorii(List<CategorieProdus> categorii) {
        this.categorii = categorii;
    }

    @Override
    public boolean equals (Object obj){
        if (obj instanceof Produs){
            if(this.getName()==null){
                return false;
            }
            else{
                return this.getName().equals(((Produs) obj).getName()); //-casting
            }
        }
        else {
            return false;
        }
    }

}
