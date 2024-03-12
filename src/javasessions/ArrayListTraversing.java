package javasessions;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> markList = new ArrayList<>(); 
		markList.add(100);
		markList.add(200);
		markList.add(300);
		markList.add(400);
		markList.add(500);
		
		System.out.println(markList);
		System.out.println(markList.get(2));
		
		//print the AL with loop: for loop
		//1. index based:
		System.out.println("====================");
		for(int i=0;i<markList.size();i++) {
			System.out.println(markList.get(i));
				if(markList.get(i)==300) {
					System.out.println("hiiii");
					break;
				}
		}
		System.out.println("==========================");
		//2. for each loop
		
		for(Integer e:markList) {
			System.out.println(e);
		}
		System.out.println("===========");
		for(int e:markList) {
			System.out.println(e);
		}
		
		ArrayList<String> monthsList=new ArrayList<String>();//vc=10, pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		monthsList.add("DEC");
		
		for(String e:monthsList) {
			System.out.println(e);
		}
		
		System.out.println("======================");
		
		ArrayList<Object> empdataList=new ArrayList<Object>();
		empdataList.add("Manisha");
		empdataList.add(25);
		empdataList.add(34.55);
		empdataList.add('f');
		empdataList.add(true);
		
		for(Object e:empdataList) {
			System.out.println(e);
			if(e.equals(25)) {
				System.out.println("age is greater than 20");
			}
		}
	}
	

}
