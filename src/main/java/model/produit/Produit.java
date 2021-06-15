package model.produit;

import java.math.BigDecimal;

public class Produit {
    private String name;
    private String description;
    private Prix prix;
    private long stock;
    private IdProduit idProduit;

    public Produit(final String name, final String description, final Prix prix, final IdProduit idProduit, final long stock) {
        this.name = name;
        this.description = description;
        this.prix = prix;
        this.idProduit = idProduit;
        this.stock = stock;
    }

    public boolean disponible() throws StockEpuiserException {
        if(stock > 0){
            return true;
        }
        throw  new StockEpuiserException(MessagesModel.STOCK_EPUISER);
    }

    public void diminuerStockDeUn() throws StockEpuiserException {
        if (stock > 0) {
            stock -= 1;
            return ;
        }
        throw new StockEpuiserException(MessagesModel.STOCK_EPUISER);
    }

    public void incrementStock() { stock += 1;}

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
        return idProduit.getId();
    }
}
