package use_case.CallProductAnonymously;

import model.Exception.UserIsNotPublicException;
import model.Exception.UserIsPublicException;
import model.produit.Produit;
import model.produit.Produits;
import model.user.Utilisateur;
import model.user.Utilisateurs;

public class CallProductAnonymously {
    private Produits produits;

    private Utilisateurs utilisateurs;

    public CallProductAnonymously(Produits produits, Utilisateurs utilisateurs) {
        this.produits = produits;
        this.utilisateurs = utilisateurs;
    }

    public Produit callProduct(String idProduit, String idUtilisateur) throws UserIsPublicException {
        Utilisateur utilisateur = utilisateurs.trouverParId(idUtilisateur);
        utilisateur.isPublic();
        return produits.trouverParId(idProduit);
    }
}
