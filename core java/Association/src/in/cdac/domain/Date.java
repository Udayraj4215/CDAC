package in.cdac.domain;

public class Date {
	private int date;
	private int month;
	private int year;
	
	public Date(){
		this(0,0,0);
	}
	
	public Date(int date, int month, int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	public void setdate(int date) {
		this.date=date;
	}
	
	public void setmonth(int month) {
		this.month=month;
	}
	
	public void setyear(int year) {
		this.year=year;
	}
	
	public int getdate() {
		return date;
	}
	
	public int getmonth() {
		return month;
	}
	
	public int getyear() {
		return year;
	}
	
	public String toString() {
		return date+" / "+month+" / "+year;
	}
	
}
