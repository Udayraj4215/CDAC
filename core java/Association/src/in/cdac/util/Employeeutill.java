package in.cdac.util;

import java.util.Scanner;

import in.cdac.domain.Date;

public class Employeeutill {
	private static Date Date;
	private String name;
	private int empid;
	private float salary;
	
	private Date joindate =new Date();

	public Employeeutill() {
		this("null",0,0.0f,Date);
	}
	
	public Employeeutill(String name, int empid, float salary, Date joindate) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.joindate = joindate;
	}

	public static Date getDate() {
		return Date;
	}

	public static void setDate(Date date) {
		Date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	public void getRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a employee name");
		sc.nextLine();
		this.setName(sc.nextLine());
		System.out.println("Enter a empid");
		this.setEmpid(sc.nextInt());
		System.out.println("Enter a salary");
		this.setSalary(sc.nextInt());
		
		
	}
	

}
