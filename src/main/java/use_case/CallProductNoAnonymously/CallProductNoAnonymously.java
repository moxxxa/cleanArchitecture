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

    public CallProductNoAnonymously(Produits produits, Utilisateurs utilisateurs) {
        this.produits = produits;
        this.utilisateurs = utilisateurs;
    }

    public Produit callProduct(String idProduit, String idUtilisateur) throws UserIsNotPublicException {
        Utilisateur utilisateur = utilisateurs.trouverParId(idUtilisateur);
        utilisateur.isNotPublic();
        return produits.trouverParId(idProduit);
    }
}
