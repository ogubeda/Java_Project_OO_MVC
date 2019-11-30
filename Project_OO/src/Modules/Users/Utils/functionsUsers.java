package Modules.Users.Utils;

import Modules.Users.Classes.*;

public class functionsUsers {
    //////
    public static boolean findUser(String username) {
        //////
        boolean findGen = false, findVIP = false, findAdmin = false;
        //////
        /////

        for (int i = 0; i < SingletonUsers.genericList.size(); i++) {
            if (SingletonUsers.genericList.get(i).getUsername().equals(username))
                findGen = true;
        }// end_for
        for (int i = 0; i < SingletonUsers.VIPList.size(); i++) {
            if (SingletonUsers.VIPList.get(i).getUsername().equals(username))
                findVIP = true;
        }// end_for
        for (int i = 0; i < SingletonUsers.adminList.size(); i++) {
            if (SingletonUsers.adminList.get(i).getUsername().equals(username))
                findAdmin = true;
        }// end_for
        //////
        if (findGen || findVIP || findAdmin)
            return true;
        else
            return false;
    }// end_findUser
    //////
    /////

    public static Users checkLogIn (String username, String password) {
        //////
        Users user = null;
        //////
        /////

        for (int i = 0; i < SingletonUsers.genericList.size(); i++) {
            if ((SingletonUsers.genericList.get(i).getUsername().equals(username)) && (SingletonUsers.genericList.get(i).getPassword().equals(password)))
                user = SingletonUsers.genericList.get(i);
        }// end_for
        for (int i = 0; i < SingletonUsers.VIPList.size(); i++) {
            if ((SingletonUsers.VIPList.get(i).getUsername().equals(username)) && (SingletonUsers.VIPList.get(i).getPassword().equals(password)))
                user = SingletonUsers.VIPList.get(i);
        }// end_for
        for (int i = 0; i < SingletonUsers.adminList.size(); i++) {
            if ((SingletonUsers.adminList).get(i).getUsername().equals(username) && (SingletonUsers.adminList.get(i).getPassword().equals(password)))
                user = SingletonUsers.adminList.get(i);
        }// end_for
        //////
        return user;
    }// end_checkPassword
}// end_functionsUsers