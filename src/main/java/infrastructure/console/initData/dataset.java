package infrastructure.console.initData;

import model.Exception.NotValidePriceException;
import model.produit.Price;
import model.produit.Produit;
import model.user.Utilisateur;

import java.math.BigDecimal;
import java.util.Map;

public class dataset {

    public Produit produit() throws NotValidePriceException {
        return new Produit("123", "Ecouteurs", "Ecouteurs bluetooth", new Price(new BigDecimal(5)), "Son",         Map.of(
                "Puissance", "5 kwh",
                "Autonomie", "10 kwh"
        ));
    }

    public void givenPublicUser(){
        Utilisateur utilisateur = new Utilisateur();

    }
}
