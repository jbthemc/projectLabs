package org.fasttrackit.lab5Magazin;

import java.util.ArrayList;
import java.util.List;

public class CatalogDeProduse {

    private List<Produs> produse = new ArrayList<Produs>();

    public void addProduct (Produs produsToAdd) {

//        for(Produs p: produse){
//            if(p.getName().equals(produsToAdd.getName())){
//                p.setStock(p.getStock() +1);
//                break;
//            } else {
//                produse.add(produsToAdd);
//            }
//        }
//
//        produse.add(produsToAdd);
//    }


        // aceasta metoda foloseste functii de la Arrays, exact ca si cea de sus
        if (produse.contains(produsToAdd)) {
            int index = produse.indexOf(produsToAdd);
            Produs alreadyExistingProduct = produse.get(index);
            alreadyExistingProduct.setStock(alreadyExistingProduct.getStock() + 1);
        } else {
            produse.add(produsToAdd);
        }
    }
    public int getNrOfProduct(){
        return produse.size();
    }
}
