package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList class -- default
		//dynamic array
		
		//Create the object of ArrayList class using new keyword
		//index based/order based array:
		ArrayList ar=new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		ar.add(600);
		ar.add(700);
		System.out.println(ar.size());
		
		ar.add("Naveen");
		ar.add(12.33);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(8));
		System.out.println(ar.get(9));//IOB 

	}

}
