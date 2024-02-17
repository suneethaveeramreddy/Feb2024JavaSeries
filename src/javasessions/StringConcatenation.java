package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is a class in Java
		//" "
		String s ="Hello World";
		System.out.println(s);
		
		String s1="100";
		System.out.println(s1+20);
		
		System.out.println(10+20);
		
		int a = 100;
		int b = 200;
		
		String x ="Hello";
		String y ="Selenium";
		
		System.out.println(a+b);//300
		System.out.println(x+y);//HelloSelenium
		
		System.out.println(a+b+x+y);//300HelloSelenium
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		
		System.out.println("the value of a " +a);
		System.out.println("the value of b " +b);
		System.out.println("the sum is: " +a+b);
		
		double c =12.33;
		double d =12.44;
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println(a+b+x+y+c+d);
		System.out.println(a+b+x+y+(c+d));
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1+c2);
		System.out.println(x+y+c1+c2);
		System.out.println(c1+c2+x+y);
		
		System.out.println("this emp is :" +true);
		System.out.println("your bank account is " +false);
		
		System.out.println(9/3);
		System.out.println(9/2);//4 when both the numbers are integers o/p will also be integer
		System.out.println(9.0/2); //4.5 
		System.out.println(9/2.0); //4.5
		System.out.println(9.0/2.0);//4.5
		
		System.out.println(0/1);//0
		System.out.println(0/100);//0 zero divided by anything will result in 0
		
		/*
		 * Any integer divided by zero will give AE 
		 */
		//System.out.println(9/0); ArithmeticException: / by zero
		//System.out.println(0/0); ArithmeticException: / by zero
		
		/*
		 * Any floating value divided by 0 or 0.0 will result INFINITY
		 */
		System.out.println(9.1/0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		System.out.println(9/0.0);//Infinity
		
		/*
		 * Zero integer or Zero Floating value when divided by 0.0/0 will result NaN
		 */
		
		System.out.println(0.0/0.0);//NaN - Not a Number
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		
		//System.out.println('a'/0); AE
		System.out.println('a'/'0');//97/48
		
		//-128 to 127
		
		byte b1 = 10; 
		byte b2 = 20;
		/*
		 * b1 and b2 can be anything suppose if b1 =125 then the sum will be 
		 * greater than the range of byte i.e., -128 to 127
		 */
		//byte b3 = b1+b2; //throws error cannot convert from int to Byte
		int b3=b1+b2;
		System.out.println(b3);
		
		byte h = 065;//octal number -- base of 8
		System.out.println(h);
		//065 =(0*8^2)+(6*8^1)+(5*8^0) = 0+ 48 + 5 = 53
		
		short t = 0736;//0-7
		System.out.println(t);
		
		int u = 0765676543;
		System.out.println(u);
		//0765676543 = (0 × 8⁹) + (7 × 8⁸) + (6 × 8⁷) + (5 × 8⁶) + (6 × 8⁵) + (7 × 8⁴) + (6 × 8³) + (5 × 8²) + (4 × 8¹) + (3 × 8⁰) = 131562851
		
		byte x1 = 125;
		byte x2 = 120;
		
		byte x3 = (byte) (x1+x2);
		System.out.println(x3);//245-256 = -11
		
		
		
		
		
		
	}

}
