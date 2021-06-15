package infrastructure.DAO;

import model.SellHistory.SellHistory;
import use_case.SellHistories;

import java.util.*;
import java.util.stream.Collectors;

public class FakeSellHistoriesDAO implements SellHistories {

    List<SellHistory> sellHistoryList;

    public FakeSellHistoriesDAO() {
        this.sellHistoryList = new ArrayList<>();
        this.sellHistoryList.add(new SellHistory("1", Collections.singletonList("123"), new Date()));
        this.sellHistoryList.add(new SellHistory("1", Collections.singletonList("123"), new Date()));
        this.sellHistoryList.add(new SellHistory("1", Collections.singletonList("123"), new Date()));
        this.sellHistoryList.add(new SellHistory("1", Collections.singletonList("123"), new Date()));
        this.sellHistoryList.add(new SellHistory("1", Collections.singletonList("123"), new Date()));
        this.sellHistoryList.add(new SellHistory("1", Collections.singletonList("124"), new Date()));
        this.sellHistoryList.add(new SellHistory("1", Collections.singletonList("125"), new Date()));
    }

    public List<SellHistory> findByUserId(String idUtilisateur){
        return sellHistoryList.stream().filter(sellHistory -> sellHistory.getIdUtilisateur().equals(idUtilisateur)).collect(Collectors.toList());
    }

    public void saveSell(SellHistory sellHistory){
        this.sellHistoryList.add(sellHistory);
    }
}
