package Modules.Users.Utils;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Modules.Users.Classes.*;
import Utils.Menus.menuAdmin;
import Utils.Menus.menuGeneric;

public class functionsLogIn {
    //////
    public static void LogIn() {
        //////
        JTextArea username = new JTextArea();
        JTextArea password = new JTextArea();
        Object[] bodyPane = {"Introduce your username:", username, "Introduce your password", password};
        String[] options = {"Log In", "Back"};
        int select = 0;
        Users user = null;
        //////
        /////
        
        select = JOptionPane.showOptionDialog(null, bodyPane, "Log In", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (select == 0) {
            user = functionsUsers.checkLogIn(username.getText(), password.getText());
              if (user == null)
                JOptionPane.showMessageDialog(null, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
             else{
                if (user instanceof Generic)
                    menuGeneric.menu();
                if (user instanceof Admin)
                    menuAdmin.menu();
             }
        }
    }// end_LogIn
}// end_functionsLogIn
//////