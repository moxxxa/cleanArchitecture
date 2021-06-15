package use_case;

import model.user.Utilisateur;

public interface Utilisateurs {
    Utilisateur trouverParId(String idUtilisateur);

    void sauvegarderUtilisateur(Utilisateur utilisateur);
}