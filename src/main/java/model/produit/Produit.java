package model.produit;


import model.Exception.NotValidePriceException;

import java.math.BigDecimal;
import java.util.Map;

public class Produit {
    private String idProduit;

    private String name;

    private String description;

    private Price price;

    private String category;

    private Map<String, String> details;

    public Produit(String idProduit, String name, String description, Price price, String category, Map<String, String> details) {
        this.idProduit = idProduit;
        this.name = name;
        this.description = description;
        this.price = price;
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
        return price.getPrice();
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

    public Price getPrix() {
        return price;
    }

    public void setPrix(Price price) {
        this.price = price;
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

    public void setDiscountOrIncount(short discount) throws NotValidePriceException {
        if (discount != 0) {
            Price newprice = new Price(this.price.getPrice().add((this.price.getPrice().multiply(new BigDecimal(discount) ).divide(new BigDecimal(100)))));
            this.price = newprice;
        }
    }
}
