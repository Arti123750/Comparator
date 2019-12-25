package com.abc.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CamparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(10);
		a1.add(98);
		a1.add(97);
		a1.add(12);
		a1.add(73);
		a1.add(4);
		a1.add(78);
		a1.add(421);
		a1.add(412);
		a1.add(98);
		
		System.out.println("Original list: "+a1);
		
		Comparator<Integer>com=Collections.reverseOrder();
		Collections.sort(a1, com);
		System.out.println("List in Desending Order: "+a1);
	}

}
