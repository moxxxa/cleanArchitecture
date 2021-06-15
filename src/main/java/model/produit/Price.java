package model.produit;

import java.math.BigDecimal;

import model.Exception.NotValidePriceException;
import model.messageErreur.MessagesModel;

public class Price {
    private final BigDecimal price;

    public Price(BigDecimal price) throws NotValidePriceException {
        if (price.compareTo(BigDecimal.ZERO) == 0) {
            throw new NotValidePriceException(MessagesModel.PRIX_NON_VALIDE);
        }
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
