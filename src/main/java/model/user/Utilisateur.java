package model.user;


import java.sql.Date;

public class Utilisateur {

    private IdUtilisateur id;
    private String nom;
    private String prenom;
    private Date dateAnniversaire;
    private String email;
    private String adresse;

    public Utilisateur(IdUtilisateur id, String name, String prenom, Date dateAnniversaire, String email, String adresse) {
        this.id = id;
        this.nom = name;
        this.prenom = prenom;
        this.dateAnniversaire = dateAnniversaire;
        this.email = email;
        this.adresse = adresse;
    }

    public Utilisateur() {

    }

    public String getId() {
        return id.getId();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }


}
