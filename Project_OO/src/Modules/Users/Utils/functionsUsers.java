package Modules.Users.Utils;

import Modules.Users.Classes.*;

public class functionsUsers {
    //////
    public static boolean findUser(String username) {
        //////
        boolean findGen = false, findVIP = false, findAdmin = false;
        //////
        /////

        for (int i = 0; i < Singleton.genericList.size(); i++) {
            if (Singleton.genericList.get(i).getUsername().equals(username))
                findGen = true;
        }// end_for
        for (int i = 0; i < Singleton.VIPList.size(); i++) {
            if (Singleton.VIPList.get(i).getUsername().equals(username))
                findVIP = true;
        }// end_for
        for (int i = 0; i < Singleton.adminList.size(); i++) {
            if (Singleton.adminList.get(i).getUsername().equals(username))
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
}// end_functionsUsers