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

    public static boolean findEmail(String email) {
        //////
        boolean findGen = false, findVIP = false, findAdmin = false;
        //////
        /////

        for (int i = 0; i < SingletonUsers.genericList.size(); i++) {
            if (SingletonUsers.genericList.get(i).getEmail().equals(email))
                findGen = true;
        }// end_for
        for (int i = 0; i < SingletonUsers.VIPList.size(); i++) {
            if (SingletonUsers.VIPList.get(i).getEmail().equals(email))
                findVIP = true;
        }// end_for
        for (int i = 0; i < SingletonUsers.adminList.size(); i++) {
            if (SingletonUsers.adminList.get(i).getEmail().equals(email))
                findAdmin = true;
        }// end_for
        //////
        if (findGen || findVIP || findAdmin)
            return true;
        else
            return false;
    }// end_findEmail
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
    }// end_checkLogIn
    //////
    /////

    public static Users selectUser(int typeUser) {
        //////
        Users user = null;
        int selectUser = 0;
        //////
        /////

        if (typeUser == 0) {
            selectUser = searchUsers.filterUsers(typeUser);
            if (selectUser >= 0)
                user = SingletonUsers.genericList.get(selectUser);
        }else if (typeUser == 1) {
            selectUser = searchUsers.filterUsers(typeUser);
            if (selectUser >= 0)
                user = SingletonUsers.VIPList.get(selectUser);
        }else if (typeUser == 2) {
            selectUser = searchUsers.filterUsers(typeUser);
            if (selectUser >= 0)
                user = SingletonUsers.adminList.get(selectUser);
        }
        return user;
    }// end_selectUSer

    public static int selectUserPos(int typeUser) {
        //////
        int selectUser = 0;
        //////
        /////
        
        if (typeUser == 0) {
            selectUser = searchUsers.filterUsers(typeUser);
            if (selectUser >= 0)
                return selectUser;
        }else if (typeUser == 1) {
            selectUser = searchUsers.filterUsers(typeUser);
            if (selectUser >= 0)
                return selectUser;
        }else if (typeUser == 2) {
            selectUser = searchUsers.filterUsers(typeUser);
            if (selectUser >= 0)
                return selectUser;
        }
        return -1;
    }
}// end_functionsUsers