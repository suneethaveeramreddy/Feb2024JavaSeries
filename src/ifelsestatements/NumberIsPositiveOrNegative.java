package ifelsestatements;

import java.util.Scanner;

public class NumberIsPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a>0) {
			System.out.println("a is Positive");
		}
		else {
			System.out.println("a is Negative");
		}
		

	}

}
