package model.achat;

import model.user.Utilisateurs;

import java.util.Date;

public class SellHistory {
    private String idUtilisateur;
    private String idProduit;
    private Date date;

    public SellHistory(String idUtilisateur, String idProduit, Date date) {
        this.idUtilisateur = idUtilisateur;
        this.idProduit = idProduit;
        this.date = date;
    }

    public void discount(){

    }

    public void discount(){

    }

    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
