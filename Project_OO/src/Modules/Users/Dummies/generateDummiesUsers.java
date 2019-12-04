package Modules.Users.Dummies;

import java.util.Random;

import Modules.Users.Classes.*;
import Modules.Users.Classes.SingletonUsers;
import Modules.Users.Utils.functionsUsers;

public class generateDummiesUsers {
    //////
    private static Random rUsers = new Random();
    private static String[] username1 = {"Sr_", "Sra_",};
    private static String[] username2 = {"benito", "benita", "josefa", "chemari"};
    private static String[] email2 = {"@gmail", "@hotmail", "@yahoo", "@outlook"};
    private static String[] email3 = {".com", ".es", ".net", ".cat"};
    //////
    public static int generate(int typeUser) {
        //////
        Users user = null;
        String username = "";
        String email = "";
        String password = "";
        //////
        /////
        
        username = generateUsername();
        email = generateEmail(username);
        password = generatePassword(username);

        if (typeUser == -1)
            typeUser = rUsers.nextInt(3);
        //////
        if (typeUser == 0) {
            user = new Generic(username, password, email);
            SingletonUsers.genericList.add((Generic)user);
            return 1;
        }else if (typeUser == 1) {
            user = new VIP(username, password, email);
            SingletonUsers.VIPList.add((VIP)user);
            return 1;
        }else if (typeUser == 2) {
            user = new Admin(username, password, email);
            SingletonUsers.adminList.add((Admin)user);
            return 1;
        }
        return 0;
    }// end_generate
    //////
    /////

    public static String generateUsername() {
        //////
        String username = "";
        //////
        /////
        
        do {
            username = username1[rUsers.nextInt(username1.length)] + username2[rUsers.nextInt(username2.length)] + rUsers.nextInt((1000 - 1) + 1);
        }while (functionsUsers.findUser(username));
        //////
        return username;

    }// end_genUsername
    //////
    /////

    public static String generateEmail(String username) {
        //////
        return username + email2[rUsers.nextInt(email2.length)] + email3[rUsers.nextInt(email3.length)];
    }// end_generateEmail
    //////
    /////

    public static String generatePassword(String username) {
        //////
        return username;
    }
}// end_generateDummiesUsers