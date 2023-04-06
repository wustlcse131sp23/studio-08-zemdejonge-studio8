package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

//instance
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
//constructor
	public Date(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year= year;
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


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean isHoliday() {
		return holiday;
	}


	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}


public String toString()
  {
	  return month + "/" + day + "/" + year;
  }

  


	@Override
public int hashCode() {
	return Objects.hash(day, month, year);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && month == other.month && year == other.year;
}


	public static void main(String[] args) {

		Date d1 = new Date(4, 6, 2023);
		Date d2 = new Date(2,3,2002);
		Date d3 = new Date(4,6,2023);
		Date d4 = new Date(1,2,3);
		d4 = d1;
		Date d5 = new Date(12, 3, 1939);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		d1.equals(d2);
		System.out.println(d1.equals(d2));
		d1.equals(d3);
		System.out.println(d1.equals(d3));
		System.out.println(d3==d1);
		
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d4);
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d5);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		set.add(d1);
		set.add(d3);
		System.out.println(set);
		
		
		
    }

}
