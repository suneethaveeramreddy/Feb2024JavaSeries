package hundredJavaPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoLargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number1,number2;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter first Large number");
		number1 =in.nextLine();
		
		System.out.println("Enter second Large number");
		number2 =in.nextLine();
		
		BigInteger first=new BigInteger(number1);
		BigInteger second=new BigInteger(number2);
		BigInteger sum;
		
		sum=first.add(second);
		
		System.out.println("Result of addition = " +sum);
	}

}
