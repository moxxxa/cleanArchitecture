package use_case;

import model.produit.Produit;

public interface Produits {
    Produit trouverParId(String idProduit);

    void sauvegarderProduit(Produit produit);
}
