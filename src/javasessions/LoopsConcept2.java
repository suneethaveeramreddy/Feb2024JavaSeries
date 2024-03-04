package javasessions;

public class LoopsConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 to 1:
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println("===================");
		//
		for (int p = 10; p >= 1; p--) {
			System.out.println(p);
		}
		System.out.println("===========================");
		// do - while loop
		// 1 to 10:
		int s = 1;
		do {
			System.out.println(s);
			s++;
		} while (s <= 10);

		System.out.println("===========================");
		// do - while loop
		// 2 to 11
		int t = 1;
		do {
			t++;
			System.out.println(t);// 234567891011
			t++;
		} while (t <= 10);
		// use cases for do-while loop:
		// element is already present on the page. -- no need to come inside the loop.
		// drop down -- default value ---> 0, 2 , 5, 10

		System.out.println("============================");
		int v = 1;
		do {
			System.out.println(v);
			if (v == 5) {
				System.out.println("Hi");
				break;
			}
			v++;
		} while (v <= 100);

		System.out.println("======================");
		// even numbers with the for loop

		for (int x = 0; x <= 20; x = x + 2) {
			System.out.println(x);
		}

		System.out.println("========================");
		// 1 to 100 but print hii if number is divisible by 5.
		for (int a = 1; a <= 100; a++) {
			System.out.println(a);
			if (a % 5 == 0) {
				System.out.println("Hiiiii");
			}
		}

		// odd/even numbers with %
		// num % 2 == 0 ---> even

		System.out.println("-------------------");
		// double with the loop:

		for (double d = 1.0; d <= 10.0; d++) {
			System.out.println(d);
		}

		// 1.0 1.1 1.2
		/*
		 * for(double c=1.0;c<=10.0;c=c+0.1) { System.out.println(c); }
		 */
		System.out.println("========print a to z ASCII table============");
		// char: a to z
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + "=" + (int) c);
		}

		System.out.println("=======print A to Z ASCII table==============");
		// char: A to Z
		for (char d = 'A'; d <= 'Z'; d++) {
			System.out.println(d + "=" + (int) d);
		}
		//
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
			if (c == 'y') {
				System.out.println("execute my test cases");
				break;
			}
		}
		System.out.println("-----------");
		//
		int count = 0;
		for (;;) {
			System.out.println("bye");
			if (count == 5) {
				break;
			}
			count++;
		}
		//
		System.out.println("=====================");
		int pointer = 0;
		while (true) {
			System.out.println("checking the element");
			if (pointer == 10) {
				System.out.println("element is displayed....click on ele");
				break;
			}
			pointer++;
		}

		// for - each with arrays
		// streams -- lambda

	}

}
