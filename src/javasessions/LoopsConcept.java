package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 to 10:
		//1. while loop:
		
		int i =1;
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
		
		int l=1;
		while(l<=100)
		{
			if(l==5) {
				System.out.println("hi");
				break;
			}
			System.out.println(l);
			l++;
		}
		System.out.println("-----------------------------");
		//
		while(true) {
			System.out.println("bye");
			break;
		}
		System.out.println("-------------------");
		int count=0;
		while(count<=100) {
			System.out.println(count);
			if(count==25) {
				System.out.println("25 runs");
			}
			if(count==50) {
				System.out.println("Half century");
			}
			if(count==100) {
				System.out.println("Century");
			}
			count++;
		}
		// use cases of while loop
		// we have to use while loop when number of iterations are not fixed
		// wait for the specific element on the page: 0, 2, 5, 10, 20 
		// wait for the page loading: 0, 5, 10, 20
		// drop down values:
		// web table pagination.
		// calendar:
		// carousel button :  The carousel is a slideshow for cycling through a series of
		// content, built with CSS 3D transforms and a bit of JavaScript
		
		//FOR LOOP:
		//1 to 10
		for(int j=1;j<=10;j++)
		{
			System.out.println(j);
		}
	}

}
