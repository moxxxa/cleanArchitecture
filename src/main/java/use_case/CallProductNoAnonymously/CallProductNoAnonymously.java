package use_case.CallProductNoAnonymously;

import model.Exception.UserIsNotPublicException;
import model.Exception.UserIsPublicException;
import model.produit.Produit;
import model.produit.Produits;
import model.user.Utilisateur;
import model.user.Utilisateurs;

public class CallProductNoAnonymously {
    private Produits produits;

    private Utilisateurs utilisateurs;

    private SellHistories sellHistories;

    public CallProductNoAnonymously(Produits produits, Utilisateurs utilisateurs, SellHistories sellHistories) {
        this.produits = produits;
        this.utilisateurs = utilisateurs;
        this.sellHistories = sellHistories;
    }

    public Produit callProduct(String idProduit, String idUtilisateur) throws UserIsNotPublicException {
        Utilisateur utilisateur = utilisateurs.trouverParId(idUtilisateur);
        utilisateur.isNotPublic();
        Produit produit = produits.trouverParId(idProduit);
        List<SellHistory> sellHistoryList = sellHistories.findByUserId(utilisateur.getId(), produit.idProduit());

        return produit.setDiscountOrIncount(SellHistory.checkIsEligbleToDiscount(sellHistoryList));;
    }
}
