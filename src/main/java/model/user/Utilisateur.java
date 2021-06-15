package model.user;


import model.Exception.PrixNonValideException;
import model.Exception.UserIsNotPublicException;
import model.Exception.UserIsPublicException;
import model.messageErreur.MessagesModel;

import java.sql.Date;
import java.util.List;

public class Utilisateur {

    private String id;
    private String name;
    private String login;

    public Utilisateur() {

    }


    public Utilisateur(String id, String name, String login) {
        this.id = id;
        this.name = name;
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void isPublic() throws UserIsPublicException {
        if(login == null || name == null){
            throw new UserIsPublicException(MessagesModel.USER_IS_PUBLIC_EXCEPTION);
        }
    }

    public void isNotPublic() throws UserIsNotPublicException {
        if(login != null && name != null){
            throw new UserIsNotPublicException(MessagesModel.USER_IS_NOT_PUBLIC_EXCEPTION);
        }
    }


}

