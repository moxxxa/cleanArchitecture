package infrastructure.DAO;

import model.user.Utilisateur;
import use_case.Utilisateurs;

import java.util.ArrayList;
import java.util.List;

public class UtilisateursDAO implements Utilisateurs {

    List<Utilisateur> utilisateursList;

    public UtilisateursDAO(){
        this.utilisateursList = new ArrayList<>();
    }

    public Utilisateur trouverParId(String idUtilisateur){
        return utilisateursList.stream().filter(utilisateur -> utilisateur.getId().equals(idUtilisateur)).findFirst().orElse(null);
    }

    public void sauvegarderUtilisateur(Utilisateur utilisateur){
        this.utilisateursList.add(utilisateur);
    }
}