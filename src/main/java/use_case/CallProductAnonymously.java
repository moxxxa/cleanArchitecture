package use_case;

import model.Exception.UserIsPublicException;
import model.produit.Produit;
import use_case.Produits;
import model.user.Utilisateur;
import use_case.Utilisateurs;

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
