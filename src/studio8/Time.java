package studio8;

import java.util.Objects;

public class Time {

private int hour;
private int minute;
private boolean militaryTime;

public Time(int hour, int minute)
{
	this.hour= hour;
	this.minute=minute;
	
}



public int getHour() {
	return hour;
}



public void setHour(int hour) {
	this.hour = hour;
}



public int getMinute() {
	return minute;
}



public void setMinute(int minute) {
	this.minute = minute;
}



public boolean isMilitaryTime() {
	return militaryTime;
}



public void setMilitaryTime(boolean militaryTime) {
	this.militaryTime = militaryTime;
}



public String toString()
{
	if (militaryTime)
	{
		return hour + ":" + minute;
	}
	else
	{
		if(hour>12)
		{
			return hour-12 + ":" + minute + " PM";
		}
		else
			return hour + ":" + minute + " AM";
	}
}





	@Override
public int hashCode() {
	return Objects.hash(hour, minute);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Time other = (Time) obj;
	return hour == other.hour && minute == other.minute;
}

	public static void main(String[] args) {
 
		Time t1 = new Time(11, 12);
		Time t2 = new Time(23,30);
		t1.militaryTime = true;
		t2.militaryTime = false;
		System.out.println(t1.toString());
		System.out.println(t2.toString());

    	
    }

}