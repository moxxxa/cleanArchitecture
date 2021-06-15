package model.produit;


import java.math.BigDecimal;
import java.util.Map;

public class Produit {
    private String idProduit;

    private String name;

    private String description;

    private Prix prix;

    private String category;

    private Map<String, String> details;

    public Produit(String idProduit, String name, String description, Prix prix, String category, Map<String, String> details) {
        this.idProduit = idProduit;
        this.name = name;
        this.description = description;
        this.prix = prix;
        this.category = category;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return prix.getPrix();
    }

    public String getId() {
        return idProduit;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Prix getPrix() {
        return prix;
    }

    public void setPrix(Prix prix) {
        this.prix = prix;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }

    public Produit setDiscountOrIncount(short discount) {
        if (discount != 0) {
            this.prix = this.prix + ((prix * discount) / 100);
        }
        return this;
    }
}
