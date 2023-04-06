package studio8;

import java.util.Objects;

public class Appointment {

	private Date appDate;
	private Time appTime;
	
	public Appointment(Date theAppDate, Time appTime) {
		appDate = theAppDate;
		this.appTime = appTime;
	}
	
	
	public Date getAppDate() {
		return appDate;
	}


	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}


	public Time getAppTime() {
		return appTime;
	}


	public void setAppTime(Time appTime) {
		this.appTime = appTime;
	}


	@Override
	public int hashCode() {
		return Objects.hash(appDate, appTime);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(appDate, other.appDate) && Objects.equals(appTime, other.appTime);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(12,12,12);
		Time t1 = new Time(4, 05);
		Appointment a1 = new Appointment(d1, t1);
		Date d2 = new Date(12,12,12);
		Time t2 = new Time(4, 05);
		Appointment a2 = new Appointment(d2, t2);
		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);
		
		
	}

}
