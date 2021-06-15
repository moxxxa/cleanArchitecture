package infrastructure.DAO;

import model.produit.Produit;
import use_case.Produits;

import java.util.ArrayList;
import java.util.List;

public class ProduitsDAO implements Produits {

    List<Produit> produitList;

    public ProduitsDAO(){
        this.produitList = new ArrayList<>();
    }

    public Produit trouverParId(String idProduit){
        return produitList.stream().filter(produit->produit.getIdProduit().equals(idProduit)).findFirst().orElse(null);
    }

    public void sauvegarderProduit(Produit produit){
        this.produitList.add(produit);
    }
}
