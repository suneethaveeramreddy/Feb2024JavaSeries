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
		
		System.out.println("=========================");
		Integer num1[]= {12,34,55,11,22,33};
		//array to arraylist
		List<Integer> numberCountList = Arrays.asList(num1);
		System.out.println(numberCountList.size());
		
		//
		System.out.println("==========================");
		ArrayList<String> list=new ArrayList<String>(){
			{
				add("Java");
				add("Python");
				add("Ruby");
			}
		};
		System.out.println(list.size());
		list.add("c#");
		System.out.println(list.size());
		
		System.out.println("===========================");
		
		//Immutable List ---It cannot be changed now -- no add/remove
		//List<Integer> nList = List.of(1,2,3,4,5);
		//List<Integer> nList = List.of(1,2,3,4,5);
		//System.out.println();
		
		//
		ArrayList<String> monthsList = new ArrayList<String>();//vc=10, pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		monthsList.add("MAR");
		monthsList.add("APR");
		monthsList.add("MAY");
		monthsList.add("JUN");
		//vc=4, pc=6
		
		monthsList.trimToSize();//trim the VC to the current pc
		//vc=6,pc=6
		//vc=6/2=3
		
		monthsList.add(0,"Month");
		System.out.println(monthsList);
		
		Collections.swap(monthsList, 0, 1);
		System.out.println(monthsList);
		
		Collections.reverse(monthsList);
		System.out.println(monthsList);
		
		List<Object> ls = Collections.emptyList();
		System.out.println(ls.size());
		
		Collections.sort(monthsList);
		System.out.println(monthsList);
		
		ArrayList<Integer> numsList = new ArrayList<Integer>(Arrays.asList(1,4,11,22,2,34));
		Collections.sort(numsList);
		System.out.println(numsList);
		Collections.reverse(numsList);
		System.out.println(numsList);
		
		// add a value in the middle of the list;
		int middleIndex=numsList.size()/2;
		numsList.add(middleIndex, 43);
		System.out.println(numsList);
		
		
		

	}

}
