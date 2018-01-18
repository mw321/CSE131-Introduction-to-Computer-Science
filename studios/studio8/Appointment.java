package studio8;

public class Appointment {
	private Date date;
	private Time time;
	private String location;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
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
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	public Appointment(Date date, Time time, String location) {
		this.date = date;
		this.time = time;
		this.location = location;
	}
	public static void main(String[]args) {
		Date d = new Date(11, 2, 2017, false);
		Time t = new Time(12, 12, true);
		Appointment a = new Appointment(d, t, "WashU");
		System.out.println(a);
	}
	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + ", location=" + location + "]";
	}
	
}
