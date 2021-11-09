package model;
public class Date{

	private int day;
	private int month;
	private int year;
	
	
	//metodo para dar informacion
	public int getDay(){
		return day;
	}	
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	//metodo constructor
	public Date (int pDay, int pMonth, int pYear){
		day=pDay;
		month=pMonth;
		year=pYear;	
	}
	//metodo modificar
	public void setDay(int pDay){
		day=pDay;
	}
	public void setMonth(int pMonth){
		month=pMonth;
	}
	public void setYear(int pYear){
		year=pYear;
	}
	//String toString
	public String toString(){
		return day + "/" + month+"/"+year;
	}
}