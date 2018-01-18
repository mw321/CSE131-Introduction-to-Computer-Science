package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date implements Working{

	final private int month, day, year;
	final private boolean holiday;

	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}

	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + "]";
	}
	public boolean isEarlierThan(Date other) {
		if (this.year < other.year) {
			return true;
		}
		else if (this.year == other.year) {
			if (this.month < other.month) {
				return true;
			}
			else if (this.month == other.month) {
				if (this.day < other.day) {
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
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Date d = new Date(11, 2, 2017, false);
		//System.out.println(d);
		Date d2 = new Date(11,2, 2017, false);
		//System.out.println(d.equals(d2));
		Date d3 = new Date(11, 1, 2017, false);
		Date d4 = new Date(12, 25, 2017, true);
		Date d5 = new Date(11, 23, 2017, true);
//		LinkedList<Date> list = new LinkedList<Date>();
//		list.add(d);
//		list.add(d2);
//		list.add(d3);
//		System.out.println(list);
//		HashSet<Date> set = new HashSet<Date>();
//		set.add(d);
//		set.add(d2);
//		set.add(d3);
//		System.out.println(set);
		System.out.println(d.isEarlierThan(d3));
		
		LinkedList<Date> work = new LinkedList<Date>();
		work.add(d);
		work.add(d3);
		int count = 0;
		for (Date d6 : work) {
			if (d6.amWorking()) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public boolean amWorking() {
		if (this.day % 2 == 0) {
			return true;
		}
		return false;
	}

}
