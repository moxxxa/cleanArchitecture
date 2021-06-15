package infrastructure.DAO;

import model.user.Utilisateur;
import use_case.Utilisateurs;

import java.util.ArrayList;
import java.util.List;

public class FakeUtilisateursDAO implements Utilisateurs {

    List<Utilisateur> utilisateursList;

    public FakeUtilisateursDAO(){
        this.utilisateursList = new ArrayList<>();
        utilisateursList.add(new Utilisateur("1", "Paul", "PaulTheKiller"));
        utilisateursList.add(new Utilisateur("2"));
    }

    public Utilisateur trouverParId(String idUtilisateur){
        return utilisateursList.stream().filter(utilisateur -> utilisateur.getId().equals(idUtilisateur)).findFirst().orElse(null);
    }

    public void sauvegarderUtilisateur(Utilisateur utilisateur){
        this.utilisateursList.add(utilisateur);
    }
}