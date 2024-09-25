package in.cdac.date;

import java.util.Calendar;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		Calendar c = Calendar.getInstance();
		this.day = c.get(Calendar.DAY_OF_MONTH);
		this.month=c.get(Calendar.MONTH);
		this.year=c.get(Calendar.YEAR);
	}
	
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	
	public void setDate(int day) {
		this.day=day;
	}
	
	public void setMonth(int month) {
		this.month=month;
	}
	
	public void setyear(int year) {
		this.year=year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth(int month) {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return day+" / "+month+" / "+year;
	}
	
	
}
