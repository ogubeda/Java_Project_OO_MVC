package Utils;

import Modules.Cars.Utils.*;

public class test {

	public static void main(String[] args) {
		
	////// Test de mayor y cuantas veces se repite
	//testmax();
		testDate();
	}// end_main
	//////
	/////
	
	public static void testmax() {
		int num = 0;
		int[] maxrepeat = new int[3];
		int[] numbers = new int[5];
		//////
		/////
		for (int i = 0; i < 5; i++) {
			num = functions.ver_int("Give me a number.", "Test Max");
			numbers[i] = num;
		}// end_for
		maxrepeat = functionsMaths.funcMaxMenRepeat(numbers);
		System.out.println(maxrepeat[0] + " " + maxrepeat[1] + " " + maxrepeat[2]);
	}// end_testmax
	//////
	/////
	
	public static void testDate() {
		//functionsDate_crud.createSDate("Hola", "Hola", "Hola", "hola");
		//testDate.verDate();
	}// end_testDate
//test
}// end_test
