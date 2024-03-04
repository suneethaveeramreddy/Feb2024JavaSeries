package javasessions;

import java.util.Arrays;

public class ArrayTravesing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= new int[4];
		
		k[0]= 10;
		k[1]= 20;
		k[2]= 30;
		k[3]= 40;
		
		System.out.println(k);
		System.out.println(Arrays.toString(k));
		
		//to iterate the array: for loop:
		//index based loop:
		for(int i=0; i<k.length;i++) {
			System.out.println(k[i]);
			if(k[i]==30) {
				System.out.println("hi");
				break;
			}
		}
		
		System.out.println("---------------------");
		//for each loop:
		for(int e:k) {
			System.out.println(e);
			if(e==30) {
				System.out.println("bye");
				break;
			}
		}
		
		System.out.println("======================");
		//
		short s[]=new short[5];
		s[0]=100;
		s[1]=200;
		s[2]=300;
		s[3]=400;
		s[4]=500;
		
		for(short e:s) {
			System.out.println(e);
		}
		
		System.out.println("====================");
		//string array:
		String browsers[] = new String[4];
		browsers[0] = "chrome";
		browsers[1] = "firefox";
		browsers[2] = "safari";
		browsers[3] = "edge";
		
		for(String e:browsers) {
			System.out.println(e);
			if(e.equals("safari")) {
				System.out.println("Launch Safari");
				break;
			}
		}
		
		//Employee data: String, int, double,char, boolean 
		//use Object array:
		//Object is a class:
		System.out.println("===============");
		
		Object emp[]=new Object[5];
		emp[0]="Tom";
		emp[1]=25;
		emp[2]=12.33;
		emp[3]='m';
		emp[4]=true;
		
		int count=0;
		for(Object e:emp) {
			System.out.println(count+"="+e);
			count++;
		}
		
		//reverse order with for each loop:
		
		//reverse order with index based loop:
		System.out.println("-------------------");
		for(int j=emp.length-1;j>=0;j--) {
			System.out.println(emp[j]);
		}

	}

}
