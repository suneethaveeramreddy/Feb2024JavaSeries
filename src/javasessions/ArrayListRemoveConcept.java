package javasessions;

import java.util.ArrayList;

public class ArrayListRemoveConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> empList = new ArrayList<String>();
		//System.out.println(empList.get(0)); IOB
		
		System.out.println(empList);
		
		empList.add("Karishma");//0
		empList.add("Tom");//1
		empList.add("Rina");//2
		empList.add("Ravi");//3
		empList.add("Azmoon");//4
		empList.add(null);
		
		System.out.println(empList);
		
		empList.remove(2);
		
		System.out.println(empList);
		
		empList.add("Naveen");//5
		/*
		 * empList.add(1,"peter"); 
		 * System.out.println(empList);
		 * empList.remove(3); 
		 * System.out.println(empList);
		 * System.out.println(empList.get(3));
		 * empList.add(0, "Testing"); 
		 * System.out.println(empList);
		 */
		
		//empList.add(8, "cypress");
		System.out.println(empList);
		// IOB we cannot skip the index it can be added only at the end of the array list
		
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Manisha");
		empDataList.add(2);
		empDataList.add(1);
		empDataList.add(34.55);
		empDataList.add('f');
		empDataList.add(true);
		
		empDataList.remove(1);
		/* preference will be given to index based list */
		
		System.out.println(empDataList);
	}

}
