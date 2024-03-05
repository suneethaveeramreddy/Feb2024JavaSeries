package javasessions;

import java.util.Arrays;

public class ArrayLiteralConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[] = new int[10];
		k[0] = 100;
		k[1] = 200;
		System.out.println(k[0]);//100
		System.out.println(k[2]);//0
		
		k[5]=500;
		//k[10]=233;AIOB
		System.out.println(k[5]);//500
		
		
		//Array Literals: static array
		int p[] = {1,2,3,4,5,6,7,8,9,10};
		//li (lowest index)		= 0;
		//hi (highest index)	= length -1;
		
		int l=p.length;//10 
		System.out.println(l);
		//p[10]=200;
		//System.out.println(p[10]);
		
		//double 
		double d[]= {12.33,44.55,8.99};
		char c[]= {'a','b','r'};
		String emp[] = {"Shhubham","Pooja","Naresh","Adil"};
		Object studentInfo[]= {"Vijay",25,34.44,'m',"Pune","India",false};
		
		System.out.println("==========================");
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(emp));
		System.out.println(Arrays.toString(studentInfo));
		
		//
		System.out.println("============================");
		for(String e:emp) {
			System.out.println(e);
		}
		//
		System.out.println("============================");
		for(Object e:studentInfo) {
			System.out.print(e+" ");
		}
		
		
		
				
		
		
		
				

	}

}
