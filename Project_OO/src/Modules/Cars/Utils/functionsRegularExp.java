package Modules.Cars.Utils;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class functionsRegularExp {
	private static final String patternData = "^\\d{4}/\\d{2}/\\d{2}$";
	private static final String patternName = "^[a-zA-Z\\s]*$";
	private static final String patterNameNum = "^[A-Za-z0-9-\\s]*$";
	private static final String patternID = "^([A-Z]{1})([0-9]{4})$";
	private static final String patternCP = "^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
	private static final String patternTLF = "^[0-9]{2,3}-? ?[0-9]{6,7}$";
	private static final String patternDNI = "([0-9]{8})([A-Z])";
	private static final String patternEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String patternCarPlate = "^([0-9]{4})([A-Z]{3})$";
	//////
	public static boolean verRegExData(String data) {
		//////
		Pattern pattern = Pattern.compile(patternData);
		Matcher matcher = pattern.matcher(data);
		//////
		if (matcher.matches())
			return true;
		else
			return false;
	}//end verRegExData
	//////
	/////
	
	public static boolean verRegExName(String data) {
		//////
		Pattern pattern = Pattern.compile(patternName);
		Matcher matcher = pattern.matcher(data);
		//////
		if (matcher.matches())
			return true;
		else
			return false;
	}// end_verRegExName
	//////
	/////
	
	public static boolean verRegExNameNum(String data) {
		//////
		Pattern pattern = Pattern.compile(patterNameNum);
		Matcher matcher = pattern.matcher(data);
		//////
		if (matcher.matches())
			return true;
		else
			return false;
	}// end_verRegExNameNum
	//////
	/////
	
	public static boolean verRegExID(String data) {
		//////
		Pattern pattern = Pattern.compile(patternID);
		Matcher matcher = pattern.matcher(data);
		//////
		if (matcher.matches())
			return true;
		else
			return false;
		//////
	}// end_verRegExID
	//////
	/////
	
	public static boolean verRegExCP(String data) {
		//////
		Pattern pattern = Pattern.compile(patternCP);
		Matcher matcher = pattern.matcher(data);
		//////
		if (matcher.matches())
			return true;
		else
			return false;
		//////
	}// end_verRegExCP
	//////
	/////
	
	public static boolean verRegExTLF(String data) {
		//////
		Pattern pattern = Pattern.compile(patternTLF);
		Matcher matcher = pattern.matcher(data);
		//////
		if (matcher.matches())
			return true;
		else
			return false;
		//////
	}// end_verRegExTLF
	//////
	/////
	
	public static boolean verRegExDNI(String data) {
		//////
		Pattern pattern = Pattern.compile(patternDNI);
		Matcher matcher = pattern.matcher(data);
		//////
		if (matcher.matches())
			return true;
		else
			return false;
		//////
	}// end_verRegExDNI
	//////
	/////
	
	public static boolean verRegExEmail(String data) {
		//////
		Pattern pattern = Pattern.compile(patternEmail);
		Matcher matcher = pattern.matcher(data);
		//////
		if(matcher.matches())
			return true;
		else
			return false;
		//////
	}// end_verRegExMail
	//////
	/////

	public static boolean verRegExCarPlate(String data) {
		//////
		Pattern pattern = Pattern.compile(patternCarPlate);
		Matcher matcher = pattern.matcher(data);
		//////
		if (matcher.matches())
			return true;
		else
			return false;
		//////
	}// end_verRexExCarPlate
	//////
	/////
	
}// end_functionsRegularExp
