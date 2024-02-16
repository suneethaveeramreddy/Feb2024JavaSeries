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
		
		System.out.println('a');
		
		
		
		
		
		
	}

}
