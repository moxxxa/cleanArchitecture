package use_case.CallProductAnonymously;

public class CallProductAnonymously {
    private Produits produits;

    private Utilisateurs utilisateurs;

    public CallProductAnonymously(Produits produits, Utilisateurs utilisateurs) {
        this.produits = produits;
        this.utilisateurs = utilisateurs;
    }

    public callProduct(String idProduit, String idUtilisateur) {
        Utilisateur utilisateur = utilisateurs.trouverParId(idUtilisateur);
        Produit produit = produits.trouverParId(idProduit); //  déclenche une exception si ça ne fonctionne pas





    }
}
