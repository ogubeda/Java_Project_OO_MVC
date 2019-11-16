package funciones;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import javax.swing.JOptionPane;

public class functionsMaths {
	/**
	 * Clase contenedora de métodos utilzados para realizar operaciones
	 * numéricas o que impliquen dígitos.
	 * 
	 * @author Óscar Gandía
	 */
	
	public static float funcOperations (String title, char mathsym) {
		float num1 = 0, num2 = 0, result = 0;
		boolean badNum = false;
		//////
		/////
		
		num1 = functions.ver_float("Give me the first number.", title);
		num2 = functions.ver_float("Give me the second number.", title);
		//////
		if (mathsym == '+')
			result = num1 + num2;
		//////
		if (mathsym == '-')
			result = num1 - num2;
		//////
		if (mathsym == '*')
			result = num1 * num2;
		//////
		if (mathsym == '/') {
			do {
				if (num2 == 0) {
					JOptionPane.showMessageDialog(null, "You can't divide by 0.", "Error", JOptionPane.ERROR_MESSAGE);
					num2 = functions.ver_float("Give me the second number again.", title);
					badNum = true;
				}else
					badNum = false;
			}while (badNum == true);
			result = num1 / num2;
		}// end_if
		//////
		return result;
	}//end_funcOperations
	//////
	/////
	
	public static ArrayList<Integer> funcDigit(int num) {
		int digSol = 0;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		//////
		/////
		if (num < 0)
			num = Math.abs(num);
		while (num > 0) {
			digSol = num % 10;
			digits.add(digSol);
			num = num / 10;
		}// end_while
		Collections.reverse(digits);
		return digits;
	}// end_funcDigit
	//////
	/////
	
	public static int[] funcMaxMenRepeat(int[] numbers) {
		int[] returnedValues = new int[3];
		int max = 0, men = 0, cont = 0;
		boolean rep = false;
		//////
		/////
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < max)
				rep = false;
			if (numbers[i] > max) {
				max = numbers[i];
				cont = 0;
				rep = false;
			}// end_if
			if (numbers[i] < men) {
				men = numbers[i];
			}// end_if
			if (rep == true)
				cont++;
			if (numbers[i] == max)
				rep = true;
		}// end_for
		returnedValues[0] = cont;
		returnedValues[1] = max;
		returnedValues[2] = men;
		//////
		return returnedValues;
	} //end_funcMaxRepeat
	//////
	/////
	
	public static ArrayList<Integer> funcDivisor(int num) {
		ArrayList<Integer> returnedValues = new ArrayList<Integer>();
		//////
		/////
		if (num < 0)
			num = Math.abs(num);
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0)
				returnedValues.add(i);
		}// end_j
		//////
		return returnedValues;
	}// end_funcDivisor
	//////
	/////
	
	public static String[] yearGenerator(int limit, int min_year) {
		String[] years = new String[limit];
		int age = 0;
		age = Calendar.getInstance().get(Calendar.YEAR) - min_year;
		for (int i = 0; i < limit; i++) {
			years[i] = Integer.toString(age);
			age--;
		}// end_for
		//////
		return years;
	}// end_yearGenerator
	//////
	/////
	
	public static String[] dayGenerator (String month) {
		String[] months31 = {"January", "March", "May", "July", "August", "October", "December"};
		String[] months30 = {"April", "June", "September", "November"};
		ArrayList<String> days = new ArrayList<String>();
		String day_select = "";
		for (int i = 0; i < 7; i++) {
			if (months31[i] == month) {
				for (int j = 0; j < 31; j++) {
					day_select = Integer.toString((j+1));
					days.add(day_select);
				}// end_for_j
			}// end_if
		}// end_for
		for (int i = 0; i < 4; i++) {
			if (months30[i] == month) {
				for (int j = 0; j < 30; j++) {
					day_select = Integer.toString((j+1));
					days.add(day_select);
				}// end_for_j
			}// end_if
		}// end_for
		if (month == "February") {
			for (int j = 0; j < 28; j++) {
				day_select = Integer.toString((j+1));
				days.add(day_select);
			}// end_for_j
		}// end_if
		String[] days2 = days.toArray(new String[0]);
		return days2;
	}// end_dayGenserator
	//////
	/////
	
}// end_functionsMaths
