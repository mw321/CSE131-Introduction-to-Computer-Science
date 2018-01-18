package exercises8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingList {

	public static void main(String[] args) {
		//
		// Your code goes here:
		//
		List<String> eat = new ArrayList<String>();
		eat.add("open mouth");
		eat.add("insert food");
		eat.add("chew");
		eat.add("chew");
		eat.add("swallow");
		//System.out.println(eat);
		eat.add("open mouth again");
		//System.out.println(eat);
		eat.remove(3);
		System.out.println(eat);

	}

}
