package ifelsestatements;

import java.util.ArrayList;
import java.util.Arrays;

public class WAPToCheckNumIsOddOrEven {

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
	}

}
