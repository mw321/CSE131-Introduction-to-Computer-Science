package exercises8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		//
		// Your code goes here:
		//    (most of what you want can be 
		//      copied and pasted from 
		//      your solution to UsingList)
		//
		Set<String> eat = new HashSet<String>();
		eat.add("open mouth");
		eat.add("insert food");
		eat.add("chew");
		eat.add("chew");
		eat.add("swallow");
		System.out.println(eat);
		eat.add("open mouth again");
		System.out.println(eat);
		eat.clear();
		eat.add("just eat");
		System.out.println(eat);
	}

}
