package Classes;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fecha {
	//////
	private String date;
	private int year;
	private int month;
	private int day;
	//////
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	public Fecha (String sendedDate) {
		//////
		String[] splitDate = null;
		splitDate = sendedDate.split("/");
		this.date = sendedDate;
		this.year = Integer.parseInt(splitDate[0]);
		this.month = Integer.parseInt(splitDate[1]);
		this.day = Integer.parseInt(splitDate[2]);
	}// end_Date
	//////
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public boolean detectLeapYear() {
		if (this.year % 4 != 0)
			return false;
		else if (this.year % 400 == 0)
			return true;
		else if (this.year % 100 == 0)
			return false;
		else
			return true;
	}// end_detectLeapYear
	//////
	/////
	
	public String dateToString() {
		//////
		return Integer.toString(getYear()) + "/" + Integer.toString(getMonth()) + "/" + Integer.toString(getDay());
	}// end_dateToString
	//////
	/////
	
	
	public int subtractDates(Fecha sendedDate) {
		//////
		long diff = 0;
		int days = 0;
		try {
			Date date1 = dateFormat.parse(this.date);
			Date date2 = dateFormat.parse(sendedDate.dateToString());
			diff = date1.getTime() - date2.getTime();
			days = Math.toIntExact(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		}catch (ParseException e) {
			System.out.println(e);
		}
		return days;
	}// end_subtractDates
	//////
	/////
	
	public boolean verSysDate() {
		//////
		Calendar cal = Calendar.getInstance();
		if (this.year > cal.get(Calendar.YEAR))
			return true;
		else if (this.year == cal.get(Calendar.YEAR)) {
			if (this.month > (cal.get(Calendar.MONTH) + 1))
				return true;
			else if (this.month == (cal.get(Calendar.MONTH) + 1)) {
				if (this.day >= cal.get(Calendar.DAY_OF_MONTH))
					return true;
				else
					return false;
			}else
				return false;
				
		}else
			return false;
	}// end_verSysDate
	
	public boolean verDate() {
		//////
		boolean validDate = false;
		Calendar dateCurrent = Calendar.getInstance();
		//////
		/////
		
		if (this.year >= (dateCurrent.get(Calendar.YEAR) - 100)) {
			if ((this.month >= 1) && (this.month <= 12)) {
				switch(this.month) {
					case 1:
						if (this.day <= 31)
							validDate = true;
						break;
						//////
					case 2:
						if ((detectLeapYear() == true) && (this.day <= 29) || (detectLeapYear() == false) && (this.day <= 28))
							validDate = true;
						break;
						//////
					case 3:
						if (this.day <= 31)
							validDate = true;
						break;
						//////
					case 4:
						if (this.day <= 30)
							validDate = true;
						break;
						//////
					case 5:
						if (this.day <= 31)
							validDate = true;
						break;
						//////
					case 6:
						if (this.day <= 30)
							validDate = true;
						break;
						//////
					case 7:
						if (this.day <= 31)
							validDate = true;
						break;
						//////
					case 8:
						if (this.day <= 31)
							validDate = true;
						break;
						//////
						
					case 9:
						if (this.day <= 30)
							validDate = true;
						break;
						//////
					case 10:
						if (this.day <= 31)
							validDate = true;
						break;
						//////
					case 11:
						if (this.day <= 30)
							validDate = true;
						break;
						//////
					case 12:
						if (this.day <= 31)
							validDate = true;
						break;
						//////
				}// end_switch
			}
		}
		return validDate;
		
	}// end_verDate
}// end_Date
