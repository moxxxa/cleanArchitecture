package infrastructure.console;

import infrastructure.DAO.FakeProduitsDAO;
import infrastructure.DAO.FakeSellHistoriesDAO;
import infrastructure.DAO.FakeUtilisateursDAO;
import model.Exception.NotValidePriceException;
import model.Exception.UserIsNotPublicException;
import model.Exception.UserIsPublicException;
import model.produit.Produit;
import use_case.CallProductAnonymously;
import use_case.CallProductNoAnonymously;

public class Main {

    public static void executeUseCases() throws NotValidePriceException, UserIsPublicException, UserIsNotPublicException {

        CallProductAnonymously callProductAnonymously = new CallProductAnonymously(new FakeProduitsDAO(), new FakeUtilisateursDAO());
        Produit produit = callProductAnonymously.callProduct("123", "2");
        System.out.println("As public user (not logged) : ");
        System.out.println(produit.toString());

        CallProductNoAnonymously callProductNoAnonymously = new CallProductNoAnonymously(new FakeProduitsDAO(), new FakeUtilisateursDAO(), new FakeSellHistoriesDAO());
        Produit produitPaul = callProductNoAnonymously.callProduct("123", "1");
        System.out.println("As user Paul : ");
        System.out.println(produitPaul.toString());
    }
}
