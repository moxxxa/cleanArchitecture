package use_case;

import model.Exception.NotValidePriceException;
import model.Exception.UserIsNotPublicException;
import use_case.SellHistories;
import model.SellHistory.SellHistory;
import model.produit.Produit;
import use_case.Produits;
import model.user.Utilisateur;
import use_case.Utilisateurs;

public class CallProductNoAnonymously {
    private Produits produits;

    private Utilisateurs utilisateurs;

    private SellHistories sellHistories;

    public CallProductNoAnonymously(Produits produits, Utilisateurs utilisateurs, SellHistories sellHistories) {
        this.produits = produits;
        this.utilisateurs = utilisateurs;
        this.sellHistories = sellHistories;
    }

    public Produit callProduct(String idProduit, String idUtilisateur) throws UserIsNotPublicException, NotValidePriceException {
        Utilisateur utilisateur = utilisateurs.trouverParId(idUtilisateur);
        utilisateur.isNotPublic();
        Produit produit = produits.trouverParId(idProduit);

        produit.setDiscountOrIncount(SellHistory.discountIncount(sellHistories.findByUserId(utilisateur.getId()), produit.getIdProduit()));

        return produit;
    }
}
