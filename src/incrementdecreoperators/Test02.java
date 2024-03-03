package incrementdecreoperators;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=11;//12//13
		int b=22;//23//24
		int c;
		
		c=a+b + a++ + b++ + ++a + ++b;//11+22+11+22+13+24//103
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("c=" +c);
		

	}

}
