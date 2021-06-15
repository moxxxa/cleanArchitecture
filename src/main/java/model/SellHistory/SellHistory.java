package model.SellHistory;

import model.user.Utilisateurs;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SellHistory {
    private String idUtilisateur;
    //  we can more then 1 product in a sell history, example user bought 3 items as one time
    private List<String> idProduits;
    private Date date;

    public SellHistory(String idUtilisateur, List<String> idProduits, Date date) {
        this.idUtilisateur = idUtilisateur;
        this.idProduits = idProduits;
        this.date = date;
    }

    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public void setIdProduits(List<String> idProduits) {
        this.idProduits = idProduits;
    }

    public List<String> getIdProduits() {
        return this.idProduits;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static short discountIncount(List<SellHistory> sellHistoryList, String idProduitToBuy) {
        short totalPercentage = 0;
        if (checkDiscount(sellHistoryList)) {
            totalPercentage += -10;
        }
        if (checkIncount(sellHistoryList, idProduitToBuy)) {
            totalPercentage += -5;
        }
        return totalPercentage;
    }

    // -10% if the user bought 3 or more other products during the last 6 months
    public static boolean checkDiscount(List<SellHistory> sellHistoryList) {
        int cpt = 0;
        for (SellHistory sell: sellHistoryList) {
            Date beforeSixMonths = getDateBeforeSixMonths();
            if (sell.getDate().compareTo(beforeSixMonths) > 0) {
                cpt += (sell.getIdProduits() != null) ? sell.getIdProduits().size() : 0;
            }
            if (cpt >= 3) {
                return true;
            }
        }
        return false;
    }

    // +5% if the user bought the exact same product more than 5 times in the last year
    public static boolean checkIncount(List<SellHistory> sellHistoryList, String idProduitToBuy) {
        int cpt = 0;
        for (SellHistory sell: sellHistoryList) {
            if (sell.getIdProduits() != null) {
                for (String id: sell.getIdProduits()) {
                    if (id.equals(idProduitToBuy)) {
                        cpt ++;
                    }
                }
            }
            if (cpt > 5) {
                return true;
            }
        }
        return false;
    }

    public static Date getDateBeforeSixMonths() {
        Date referenceDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(referenceDate);
        c.add(Calendar.MONTH, -6);
        c.getTime();
        return c.getTime();
    }


}
