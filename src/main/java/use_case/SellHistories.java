package use_case;

import model.SellHistory.SellHistory;

import java.util.List;

public interface SellHistories {
    List<SellHistory> findByUserId(String idUtilisateur);

    void saveSell(SellHistory sellHistory);
}
