package funciones;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class functionsMenu {
	public static boolean exitConf_win(String message, String title) {
		int question = 0;
		boolean select = false;
		//////
		/////

		question = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
		if (question == JOptionPane.YES_OPTION)
			System.exit(0);
		else
			select = false;
		return select;
	}// end_exitConf_win
		//////
		/////

	public static boolean contWin(String message, String title) {
		boolean stop = false, resume = false;
		int select = 0;
		//////
		/////
		do {
			select = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
			if (select == JOptionPane.YES_OPTION) {
				resume = true;
				stop = true;
			}else if (select == JOptionPane.NO_OPTION) {
				resume = false;
				stop = true;
			}else
				stop = false;
		}while (stop == false);
		//////
		return resume;
	}// end_contWin
		//////
		/////

	public static int buttonMenu(String[] options, String message, String title) {
		int selectOpt = 0;
		//////
		/////
		
		selectOpt = JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		return selectOpt;
	}// end_buttonMenu
		//////
		/////
	
	public static boolean buttonMenuSec(Object[] options, String message, String title) {
		boolean replay = false;
		int selectOpt = 0;
		//////
		/////
		
		selectOpt = JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,  options, options[0]);
		switch(selectOpt) {
			case 0:
				replay = true;
				break;
			case 1:
				replay = false;
				break;
			default:
				exitConf_win("Do you want to exit?", "Exit");
				break;
		}// end_switch
		return replay;
	}// end_buttonMenuSec
	//////
	/////
	
	public static int comboBoxMenu(String[] comboBody, String message, String title, String[] options) {
		//////
		JComboBox<String> modelsBox = new JComboBox<String>(comboBody);
		Object[] miau = {message, modelsBox};
		int select = 0, returnValueInt = 0;
		boolean exit = false;
		//////
		/////
		
		do {
			select = JOptionPane.showOptionDialog(null, miau, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if (select == 0) {
				returnValueInt = modelsBox.getSelectedIndex();
				exit = true;
			}if (select == 1) {
				returnValueInt = -2;
				exit = true;
			}if (select == JOptionPane.CLOSED_OPTION) {
				exit = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
			}
		}while (exit == false);
		//////
		return returnValueInt;
	}// end_comboBoxMenu
	//////
	/////
}
