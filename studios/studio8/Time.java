package studio8;

import java.util.LinkedList;

public class Time implements Working{

	final private int hour, minute;
	final private boolean format; //true if it's 24 hour format

	public Time(int hour, int minute, boolean format) {
		this.hour = hour;
		this.minute = minute;
		this.format = format;
	}

	@Override
	public String toString() {
		if (this.format == false) {
			return "Time [hour=" + this.hour % 12 + ", minute=" + minute + ", format=" + format + "]";
		}
		else {
			return "Time [hour=" + hour + ", minute=" + minute + ", format=" + format + "]";
		}
	}
	public boolean isEarlierThan(Time other) {
		if (this.hour < other.hour) {
			return true;
		}
		else if (this.hour == other.hour){
			if (this.minute < other.minute) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Time t = new Time(13, 53, false);
		//System.out.println(t);
		Time t1 = new Time(23, 53, false);
		//System.out.println(t.equals(t1));
		System.out.println(t.isEarlierThan(t1));
		LinkedList<Time> work = new LinkedList<Time>();
		work.add(t);
		work.add(t1);
		int count = 0;
		for (Time t3 : work) {
			if (t3.amWorking()) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	@Override
	public boolean amWorking() {
		if (this.hour > 9 && this.hour < 17) {
			return true;
		}
		return false;
	}

}
