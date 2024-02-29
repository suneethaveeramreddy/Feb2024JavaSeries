package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 to 10:
		// 1. while loop:

		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}

		int l = 1;
		while (l <= 100) {
			if (l == 5) {
				System.out.println("hi");
				break;
			}
			System.out.println(l);
			l++;
		}
		System.out.println("-----------------------------");
		//
		while (true) {
			System.out.println("bye");
			break;
		}
		System.out.println("-------------------");
		int count = 0;
		while (count <= 100) {
			System.out.println(count);
			if (count == 25) {
				System.out.println("25 runs");
			}
			if (count == 50) {
				System.out.println("Half century");
			}
			if (count == 100) {
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
		// carousel button : The carousel is a slideshow for cycling through a series of
		// content, built with CSS 3D transforms and a bit of JavaScript
		System.out.println("--------------------");
		// FOR LOOP:
		// 1 to 10
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		//
		/*
		 * for(int p=1;p<=10;) { System.out.println(p);//11111111111111111 }
		 */
		System.out.println("=======================");

		for (int m = 1; m <= 10; m++) {
			System.out.println(m);// 13579
			m++;
		}

		System.out.println("==============================");

		for (;;) {
			System.out.println("bye");
			break;
		}
		//
		System.out.println("=================================");
		for (int run = 1; run <= 100; run++) {
			System.out.println(run);
			if (run == 0) {
				System.out.println("DUCK....Bye");
				break;
			}
			System.out.println("Hello");
		}

		// Use cases for loop
		// 1. use for loop when no of iterations are fixed
		// to fetch values from the array
		System.out.println("==============================");
		int arr[] = new int[4];
		// 0 to 3
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

		for (int n = 0; n < arr.length; n++) {
			System.out.println(arr[n]);
		}
		// drop down -- month -- 1 to 12
		// country drop down
		// menu - sub menus
		// No. of subjects in Exam
		// Total no of semesters
		
		System.out.println("================================");
		
		for (char ch = 'a'; ch <= 'z'; ch++) {

			System.out.println(ch + " = " + (byte) ch);

		}

	}

}
