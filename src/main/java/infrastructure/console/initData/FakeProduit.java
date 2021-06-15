package infrastructure.console.initData;

import infrastructure.DAO.ProduitsDAO;
import model.Exception.NotValidePriceException;
import model.produit.Price;
import model.produit.Produit;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FakeProduit extends ProduitsDAO {
    Map<String, Produit> produits;

    public FakeProduit() throws NotValidePriceException {
        produits = new HashMap<>();
        Produit chaussure_nike = new Produit("123", "Ecouteurs", "Ecouteurs bluetooth", new Price(new BigDecimal(5)), "Son",         Map.of(
                "Puissance", "5 kwh",
                "Autonomie", "10 kwh"
        ));

        produits.put("Ecouteurs", chaussure_nike);
    }

    @Override
    public Produit trouverParId(String idProduit) {
        return produits.get(idProduit);
    }

    @Override
    public void sauvegarderProduit(Produit produit) {
        if(produit != null){
            produits.put(produit.getId(), produit);
        }
    }
}
