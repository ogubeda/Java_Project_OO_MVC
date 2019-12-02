package Modules.Users.Utils;

import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Modules.Users.Classes.SingletonUsers;
import Modules.Users.Classes.Users;
import java.awt.event.KeyEvent;

public class searchUsers {
    //////
    private static ArrayList<Integer> posList = new ArrayList<Integer>();
    private static ArrayList<String> typeList = new ArrayList<String>();
    //////
    public static int filterUsers(int typeUser) {
        //////
        int select = 0, returnedValue = 0;
        String[] options = {"Continue", "Back"};
        JTextField text = new JTextField();
        ArrayList<Users> usersList = new ArrayList<Users>();
        //////
        /////

        if (typeUser == 0)
            usersList.addAll(SingletonUsers.genericList);
        if (typeUser == 1)
            usersList.addAll(SingletonUsers.VIPList);
        if (typeUser == 2)
            usersList.addAll(SingletonUsers.adminList); 
        for (int i = 0; i < usersList.size(); i++) {
            typeList.add(usersList.get(i).getUsername());
            posList.add(i);
        }// end_for
        JComboBox<String> typeBox = new JComboBox<String>(typeList.toArray(new String[0]));
        Object[] bodyPane = {"Introduce the word for searching:", text, typeBox};
        text.addKeyListener(
            new KeyListener() {
                public void keyTyped(KeyEvent e) {
                }
                public void keyPressed(KeyEvent e) {
                }
                public void keyReleased(KeyEvent e) {
                    typeBox.removeAllItems();
                    posList.clear();
                    for (int i = 0; i < usersList.size(); i++) {
                        if (compareData(text.getText(), usersList.get(i))) {
                            typeBox.addItem(usersList.get(i).getUsername());
                            posList.add(i);
                        }
                    }// end_for
                    if (text.getText().equals("")) {
                        for (int i = 0; i < usersList.size(); i++) {
                                typeBox.addItem(usersList.get(i).getUsername());
                                posList.add(i);
                        }// end_for
                    }
                    if (typeBox.getItemCount() == 0)
                        typeBox.addItem("No Matches");
                }
            });
        select = JOptionPane.showOptionDialog(null, bodyPane, "Search Users", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if ((select == 0) && (typeBox.getSelectedItem().equals("No Matches")))
            returnedValue = -2;
        else if (select == 0)
            returnedValue = posList.get(typeBox.getSelectedIndex());
        else
            returnedValue = -1;
        //////
        posList.clear();
        typeList.clear();
        return returnedValue;
    }// end_filterUsers
    //////
    /////

    public static boolean compareData(String sendedText, Users sendedUsers) {
        //////
        String cutUsername = "";
        //////
        /////

        if (sendedText.length() <= sendedUsers.getUsername().length()) {
            for (int i = 0; i < sendedText.length(); i++) {
                cutUsername = cutUsername + sendedUsers.getUsername().charAt(i);
            }// end_for
        }// end_if
        if (sendedText.equals(cutUsername))
            return true;
        else
            return false;
    }// end_compareData
}// end_searchUsers