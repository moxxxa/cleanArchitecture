package infrastructure.DAO;

import model.Exception.NotValidePriceException;
import model.produit.Price;
import model.produit.Produit;
import use_case.Produits;

import java.math.BigDecimal;
import java.util.*;

public class FakeProduitsDAO implements Produits {

    List<Produit> produitList;

    public FakeProduitsDAO() throws NotValidePriceException {
        produitList = new ArrayList<>();
        produitList.add(new Produit("123", "Ecouteurs", "Ecouteurs bluetooth", 5, "Son",         Map.of(
                "Puissance", "5 kwh",
                "Autonomie", "10 kwh"
        )));
        produitList.add(new Produit("124", "Ecouteurs", "Ecouteurs bluetooth", 5, "Son",         Map.of(
                "Puissance", "5 kwh",
                "Autonomie", "10 kwh"
        )));
        produitList.add(new Produit("125", "Ecouteurs", "Ecouteurs bluetooth", 5, "Son",         Map.of(
                "Puissance", "5 kwh",
                "Autonomie", "10 kwh"
        )));
    }

    public Produit trouverParId(String idProduit){
        return produitList.stream().filter(produit->produit.getIdProduit().equals(idProduit)).findFirst().orElse(null);
    }

    public void sauvegarderProduit(Produit produit){
        this.produitList.add(produit);
    }
}
