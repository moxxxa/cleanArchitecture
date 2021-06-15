package model.achat;

import java.util.List;

public interface SellHistories {
    List<SellHistory> trouverParIdUtilisateur(String idUtilisateur);

    SellHistory trouverParProduit(String idProduit);



    void sauvegarderAchat(SellHistory sellHistory);
}
