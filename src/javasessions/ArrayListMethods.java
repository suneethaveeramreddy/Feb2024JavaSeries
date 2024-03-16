package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>(5);
		//vc=5, pc=0
		//5/2 = 2
		
		ArrayList<Integer> marksList=new ArrayList<Integer>();
		marksList.add(1);//0
		marksList.add(2);//1
		marksList.add(3);//2
		marksList.add(4);//3
		
		marksList.remove((Object)2);
		System.out.println(marksList);
		
		//ArrayList Literals:
		ArrayList<String> browserList=new ArrayList<String>(Arrays.asList("chrome","firefox","edge"));
		System.out.println(browserList);
		System.out.println(browserList.size());
		System.out.println(browserList.get(0));
		for(String e:browserList) {
			System.out.println(e);
		}
		
		ArrayList<String> empList=new ArrayList<String>
										(Arrays.asList("Tom","Peter","Ravi","Shubham","Sagar"));
		System.out.println(empList);
		
		for(int i=empList.size()-1;i>=0;i--) {
			System.out.println(empList.get(i));
		}
		System.out.println("============================");
		Collections.reverse(empList);
		System.out.println(empList);
		
		System.out.println("============================");
		for(String e:empList) {
			System.out.println(e);
		}
		
		System.out.println("====================");
		ArrayList<Integer> numList=new ArrayList<>(Arrays.asList(10,20,30,40,50));
		System.out.println(numList);
		Collections.reverse(numList);
		System.out.println(numList);
		
		//
		int num[]= {12,34,55,11,22,33};
		//array to arraylist:
		
		List<int[]> numberList = Arrays.asList(num);
		System.out.println(numberList.size());
		
		System.out.println("=======================");
		
		String browser[]= {"chrome","firefox","edge"};
		List<String> browserNamesList = Arrays.asList(browser);
		System.out.println(browserNamesList.size());
		
		
		Integer num1[]= {12,34,55,11,22,33};
		List<Integer> numberCountList = Arrays.asList(num1);
		System.out.println(numberCountList.size());
		
		
	}

}
