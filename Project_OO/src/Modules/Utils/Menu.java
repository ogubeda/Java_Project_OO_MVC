package Modules.Utils;

import java.util.ArrayList;


import Modules.Cars.Classes.*;
import Modules.Cars.Classes.Singleton;
import Modules.Cars.Utils.*;
import Modules.Users.Utils.functionsLogIn;
import Modules.Users.Classes.*;


public class Menu {
	//////
	public static void run() {
		String[] options = {"Electric", "Hybrid", "Combustion","Log In", "Register","Exit"};
		int selection = 0;
		boolean stop = false, modeDum = false;
		//////
		/////

		do {
			selection = functionsMenu.buttonMenu(options, "Choose a type of car.", "Pick an option");
			switch (selection) {
				case 0:
					MenuSecond.menuSecondary(0, modeDum);
					break;
					//////
				case 1:
					MenuSecond.menuSecondary(1, modeDum);
					break;
					//////
				case 2:
					MenuSecond.menuSecondary(2, modeDum);
					break;
					//////
				case 3:
					functionsLogIn.LogIn();
					break;
					//////
				case 4:
					functionsLogIn.Register(0, false);
					break;
					//////
				default:
					stop = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
					break;
					//////
			}// end_switch
		}while (stop == false);
	}// end_main
	//////
	/////
	
	public static void main(String[] args) {
		Singleton.electricList = new ArrayList<Electric>();
		Singleton.hybridList = new ArrayList<Hybrid>();
		Singleton.combustionList = new ArrayList<Combustion>();
		SingletonUsers.genericList = new ArrayList<Generic>();
		SingletonUsers.VIPList = new ArrayList<VIP>();
		SingletonUsers.adminList = new ArrayList<Admin>();
		Admin test = new Admin("oscar","1111", "kkk");
		SingletonUsers.adminList.add(test);
		run();
	}// end_main
}// end_Menu
