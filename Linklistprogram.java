package Linklist;

import java.util.LinkedList;

public class Linklistprogram {

	public static void main(String[] args){

	    
	    LinkedList<String> phones = new LinkedList<>();

	    // phones added
	    phones.add("Nokia");
	    phones.add("Samsung");
	    phones.add("Iphone");
	    phones.add("Oneplus");
	    System.out.println("LinkedList is :-> " + phones);
	  
	    // Element added
	    phones.add(1, "vivo");
	    System.out.println("Updated LinkedList: " + phones);
	}
}


