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
	}

}
