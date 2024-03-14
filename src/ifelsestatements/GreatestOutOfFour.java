package ifelsestatements;

public class GreatestOutOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=78;
		int c=87;
		int d=97;
		
		if(a>b & a>c & a>d) {
			System.out.println("The greatest is a:" +a);
		}
		else if (b>c & b>d) {
			System.out.println("The greatest is b:" +b);
		}
		else if(c>d) {
			System.out.println("The greatest is c:" +c);
		}
		else {
			System.out.println("The greatest is d:" +d);
		}
	}

}
