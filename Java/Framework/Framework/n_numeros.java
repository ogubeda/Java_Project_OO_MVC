package Framework;
import funciones.functions;

public class n_numeros {
	public static void main (String[] args) {
		int nRange = 0, num = 0;
		
		nRange = functions.ver_int("Give me the range.", "Range");
		for (int i = 0; i < nRange; i++) {
			num = functions.ver_int("Give me a number.", "Input");
			System.out.println(num);
		}
	}// end_main
	//////
	/////

}// end_n_numeros
