package model.user;

public interface Utilisateurs {
    Utilisateur trouverParId(String idUtilisateur);

    void sauvegarderUtilisateur(Utilisateur utilisateur);
}