package infrastructure.DAO;

import model.SellHistory.SellHistory;
import use_case.SellHistories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellHistoriesDAO implements SellHistories {

    List<SellHistory> sellHistoryList;

    public SellHistoriesDAO() {
        this.sellHistoryList = new ArrayList<>();
    }

    public List<SellHistory> findByUserId(String idUtilisateur){
        return sellHistoryList.stream().filter(sellHistory -> sellHistory.equals(idUtilisateur)).collect(Collectors.toList());
    }

    public void saveSell(SellHistory sellHistory){
        this.sellHistoryList.add(sellHistory);
    }
}
