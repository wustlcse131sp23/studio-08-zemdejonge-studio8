package studio8;

import java.util.LinkedList;

public class Calendar {

	private LinkedList<Appointment> calendar;
	
	public Calendar()
	{
		LinkedList<Appointment> list = new LinkedList<Appointment>();
		this.calendar = list;
	}
	public Calendar(LinkedList<Appointment> calendar) {
		this.calendar = calendar;
	}
	
	public void addAppointment(Appointment a1) {
		this.calendar.add(a1);
	}
	
	public boolean appToday(Date d1) {
		boolean k = false;
		for (int i = 0; i < this.calendar.size(); i++)
		{
			Appointment a1 = this.calendar.get(i);
			if (a1.getAppDate().equals(d1)) {
				k = true;
			}
		}
		
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(1,2,3);
		Date d2 = new Date(2,3,4);
		Date d3 = new Date(3,4,5);
		Time t1 = new Time(1,2);
		Time t2 = new Time(2,3);
		Appointment a1 = new Appointment(d1, t1);
		Appointment a2 = new Appointment(d2, t2);
		Calendar c1 = new Calendar();
		
		c1.addAppointment(a1);
		c1.addAppointment(a2);
		System.out.println(c1.appToday(d3));
		System.out.println(c1);

		System.out.println(d1.toString());
	}

}
