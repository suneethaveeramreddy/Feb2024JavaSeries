package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList class -- default
		//dynamic array
		
		//Create the object of ArrayList class using new keyword
		//index based/order based array:
		//when we initialize an array the VC=10 & PC=0
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());//pc=0
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//pc=3 & vc=7
		
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
		//System.out.println(ar.get(9));//IOB 
		
		ar.add(1100);
		
		//restrict the arraylist: generics in AL
		
		//integer data : AL :
		
		ArrayList<Integer> marksList= new ArrayList<Integer>();//vc=10 , pc=0
		marksList.add(100);
		marksList.add(1200);
		
		ArrayList<Double> bmiList=new ArrayList<Double>();
		bmiList.add(12.33);
		bmiList.add(100.0);
		
		//int --> Integer
		//double --> Double 
		
		//diff types of data in AL:
		ArrayList<Object> empDataList=new ArrayList<Object>();//vc=10,pc=0
		empDataList.add("Manisha");
		empDataList.add(25);
		empDataList.add(34.55);
		empDataList.add('f');
		empDataList.add(true);
		
		ArrayList<String> monthsList=new ArrayList<String>();//vc=10, pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		monthsList.add("MAR");
		
		
		
		
		
		

	}

}
