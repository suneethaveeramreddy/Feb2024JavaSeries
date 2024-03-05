package javasessions;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//online ecomm app:
		//cricinfo
		
		
		//player : name, age, country, total runs, strike rate
		
		Object player[]= new Object[5];
		player[0] = "Rashid Khan";
		player[1] = 30;
		player[2] = "AFG";
		player[3] = 5000;
		player[4] = 110.22;
		
		Object player1[]= new Object[5];
		player1[0] = "Naveen";
		player1[1] = 20;
		
		System.out.println(player1[2]);
		System.out.println(player1[3]);
		System.out.println(player1[4]);
		
		System.out.println(Arrays.toString(player1));
		System.out.println(Arrays.toString(player));
		
		
		
		
	}

}
