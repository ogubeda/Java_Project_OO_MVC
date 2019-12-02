package Modules.Utils;

import javax.swing.JOptionPane;

import Modules.Cars.Classes.Singleton;
import Modules.Users.Classes.SingletonUsers;

public class checker {
    //////
    public static boolean checkCars(int engine) {
        if (((Singleton.electricList.isEmpty()) && (engine == 0)) || ((Singleton.hybridList.isEmpty()) && (engine == 1)) || ((Singleton.combustionList.isEmpty()) && (engine == 2))) {
			JOptionPane.showMessageDialog(null, "There's not created cars.", "Error", JOptionPane.ERROR_MESSAGE);
			return true;
		}// end_if
		return false;
    }// end_checkCars
    //////
    /////

    public static boolean checkUsers(int typeUser) {
        //////
        if ((SingletonUsers.genericList.isEmpty() && typeUser == 0) || (SingletonUsers.VIPList.isEmpty() && typeUser == 1) || (SingletonUsers.adminList.isEmpty() && typeUser == 2)) {
            JOptionPane.showMessageDialog(null, "There's not created users.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }else
            return false;
    }// end_checkUsers
    //////
    /////
}// end_checker