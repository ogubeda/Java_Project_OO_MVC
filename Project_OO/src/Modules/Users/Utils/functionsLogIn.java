package Modules.Users.Utils;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import Modules.Cars.Utils.*;
import Modules.Users.Classes.*;
import Modules.Utils.Menus.Admin.menuAdmin;
import Modules.Utils.Menus.Generic.menuGeneric;
import Modules.Utils.Menus.VIP.menuVIP;

public class functionsLogIn {
    //////
    public static void LogIn() {
        //////
        JTextArea username = new JTextArea();
        JPasswordField password = new JPasswordField();
        Object[] bodyPane = {"Introduce your username:", username, "Introduce your password", password};
        String[] options = {"Log In", "Back"};
        int select = 0;
        Users user = null;
        //////
        /////
        
        select = JOptionPane.showOptionDialog(null, bodyPane, "Log In", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (select == 0) {
            user = functionsUsers.checkLogIn(username.getText(), String.valueOf(password.getPassword()));
              if (user == null)
                JOptionPane.showMessageDialog(null, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
             else{
                if (user instanceof Generic)
                    menuGeneric.menu((Generic)user);
                if (user instanceof VIP)
                    menuVIP.menu((VIP)user);
                if (user instanceof Admin)
                    menuAdmin.menu((Admin)user);
             }// end_else
        }// end_if
    }// end_LogIn
    //////
    /////

    public static void Register(int typeUser, boolean admin) {
        //////
        JTextArea username = new JTextArea();
        JTextArea email = new JTextArea();
        JPasswordField password = new JPasswordField();
        Object[] bodyPane = {"Introduce an username", username, "Introduce an email", email, "Introduce a password", password};
        String[] options = {"Register", "Back"};
        int select = 0;
        boolean resume = false;
        Users user = null;
        //////
        /////

        do {
            select = JOptionPane.showOptionDialog(null, bodyPane, "Register", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (select == 0) {
                //////
                if ((functionsRegularExp.verRegExUsername(username.getText())) && (functionsRegularExp.verRegExPassword(String.valueOf(password.getPassword())) && (functionsRegularExp.verRegExEmail(email.getText())))) {
                    //////
                    if ((functionsUsers.findUser(username.getText()) == false) && (functionsUsers.findEmail(email.getText()) == false)) {
                        //////
                        if (typeUser == 0) {
                            user = new Generic(username.getText(), String.valueOf(password.getPassword()), email.getText());
                            SingletonUsers.genericList.add((Generic)user);
                            if (admin == false)
                                menuGeneric.menu((Generic)user);
                        }else if (typeUser == 1) {
                            user = new VIP(username.getText(), String.valueOf(password.getPassword()), email.getText());
                            SingletonUsers.VIPList.add((VIP)user);
                            if (admin == false)
                                menuVIP.menu((VIP)user);
                        }else if (typeUser == 2) {
                            user = new Admin(username.getText(), String.valueOf(password.getPassword()), email.getText());
                            SingletonUsers.adminList.add((Admin)user);
                            if (admin == false)
                                menuAdmin.menu((Admin)user);
                        }// end_if
                        resume = true;
                    }else if (functionsUsers.findUser(username.getText()))
                        JOptionPane.showMessageDialog(null, "The username is already in use.", "Error", JOptionPane.ERROR_MESSAGE);
                    else if (functionsUsers.findEmail(email.getText()))
                        JOptionPane.showMessageDialog(null, "The email is already in use.", "Error", JOptionPane.ERROR_MESSAGE);
                }else
                    JOptionPane.showMessageDialog(null, "Invalid format for username, password, or email", "Error", JOptionPane.ERROR_MESSAGE);
            }else
                resume = true;
        }while (resume == false);
        //////
    }// end_Register
    //////
    /////

    public static String createUsername() {
        //////
        String username = "";
        boolean resume = false;
        //////
        /////

        do {
            username = functions.verString("Introduce an username.", "Username");
            if (functionsRegularExp.verRegExUsername(username)) {
                if (functionsUsers.findUser(username) == false)
                    resume = true;
            }
        }while (resume == false);
        //////
        return username;
    }// end_createUsername
    //////
    /////

    public static String createPassword() {
        //////
        String password = "";
        //////
        /////

        do {
            password = functions.verString("Introduce a password.", "Password");
        }while (functionsRegularExp.verRegExPassword(password) == false);
        //////
        return password;
    }// end_createPassword
    //////
    /////

    public static String createEmail() {
        //////
        String email = "";
        boolean resume = false;
        //////
        /////

        do {
            email = functions.verString("Introduce an email.", "Email");
            if (functionsRegularExp.verRegExEmail(email)) {
                if (functionsUsers.findEmail(email) == false)
                    resume = true;
            }
        }while (resume == false);
        //////
        return email;
    }// end_createEmail
    //////
    /////

    public static int changeUser(Users user) {
        //////
        if (user instanceof Admin)
            return changeAdmin(user);
        if (user instanceof VIP)
            return changeVIP(user);
        if (user instanceof Generic)
            return changeGeneric(user);
        return -1;

    }// end_changeUser
    //////
    /////

    private static int changeAdmin(Users user) {
        //////
        String[] options = {"VIP", "Generic", "Back"};
        int select = 0;
        //////
        /////
        select = functionsMenu.buttonMenu(options, "Choose the type to change", "Change Type Admin");
        if (select == 0) {
            SingletonUsers.adminList.remove(functionsUsers.sendPos(user));
            SingletonUsers.VIPList.add(new VIP(user.getUsername(), user.getPassword(), user.getEmail()));
        }else if (select == 1) {
            SingletonUsers.adminList.remove(user);
            SingletonUsers.genericList.add(new Generic(user.getUsername(), user.getPassword(), user.getEmail()));
        }
        return -1;
    }//
    //////
    /////

    private static int changeVIP(Users user) {
        //////
        String[] options = {"Admin", "Generic", "Back"};
        int select = 0;
        //////
        /////
        select = functionsMenu.buttonMenu(options, "Choose the type to change", "Change Type Admin");
        if (select == 0) {
            SingletonUsers.VIPList.remove(functionsUsers.sendPos(user));
            SingletonUsers.adminList.add((new Admin(user.getUsername(), user.getPassword(), user.getEmail())));
        }else if (select == 1) {
            SingletonUsers.VIPList.remove(user);
            SingletonUsers.genericList.add(new Generic(user.getUsername(), user.getPassword(), user.getEmail()));
        }
        return -1;
    }//
    //////
    /////

    private static int changeGeneric(Users user) {
        //////
        String[] options = {"Admin", "VIP", "Back"};
        int select = 0;
        //////
        /////
        select = functionsMenu.buttonMenu(options, "Choose the type to change", "Change Type Admin");
        if (select == 0) {
            SingletonUsers.genericList.remove(functionsUsers.sendPos(user));
            SingletonUsers.adminList.add(new Admin(user.getUsername(), user.getPassword(), user.getEmail()));
        }else if (select == 1) {
            SingletonUsers.genericList.remove(user);
            SingletonUsers.VIPList.add(new VIP(user.getUsername(), user.getPassword(), user.getEmail()));
        }
        return -1;
    }//
    //////
    /////

}// end_functionsLogIn
//////