package javasessions;

import java.util.ArrayList;

public class ArrayListRemoveConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Karishma");
		empList.add("Tom");
		empList.add("Rina");
		empList.add("Ravi");
		empList.add("Azmoon");
		
		System.out.println(empList);
		
		empList.add("Naveen");
		empList.add(1,"peter");
		System.out.println(empList);
	}

}
