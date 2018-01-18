package studio8;

import java.util.LinkedList;

public class Calender {
	private LinkedList<Appointment> list;
	public Calender(LinkedList<Appointment> list) {
		this.list = list;
	}
	public void drop(Appointment a) {
		this.list.remove(a);
	}
	public void add(Appointment a) {
		this.list.add(a);
	}
	@Override
	public String toString() {
		return "Calender [list=" + list + "]";
	}
	

}
