package javasessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TC --> BIG o
		// SC --> BIG o

		int i = 1;
		System.out.println(i);
		// Big o(1) -- Constant Time
		String s = "Selenium";
		System.out.println(s);

		// loop: 1 to 10:
		for (int k = 1; i <= 10; i++) {
			System.out.println(k);

			// 1+n+n+n ==> 3n+1 --> Linear Equation
			// 3n + 1 --> 3n --> o(3n)--> o(n)

			//
			int p = 1;
			while (p <= 100) {
				System.out.println(p);
				if (p == 30) {
					System.out.println("hiii");
				}
				p++;
			}
			// 1+n+n+n+1+n ==>2+4n ==> 2(1+2n)==> 4n==> o(4n)==> o(n)
			System.out.println("--------nested loops---------");
			// nested for loops:
			// 00 01 02 03 04 05
			// 10 11 12 12 14 15
			// 20 21 22
			//
			// 50 51 52 53 54 55

			for (int m = 0; m <= 5; m++) {
				for (int n = 0; n <= 5; n++)
				{
					System.out.print(m+""+n+" ");//00 01 02 03
				}
				System.out.println();
			}
			//(1+n+n+n)(1+n+n+n) ==> (1+3n)(1+3n) ==> 1+6n+9n^2 --Quadratic equation
			//9n^2+6n ==> 3n(3n+2) --> 9n^2 --> 0(n^2)
			
			System.out.println("======cubic equation=========");
			
			// cubic equation 
			
			for (int m = 0; m <= 2; m++) {
				for (int n = 0; n <= 2; n++)
				{
					for(int o=0;o<=2;o++) {
						System.out.print(m+""+n+""+o+" ");//00 01 02 03
					}
				}
				System.out.println();
			}
			//()()() =n^3+n^2+n+1= o(n^3)
			
			//binary search: 25
			//1 to 30 --len=30
			//li = 0
			//hi =29
			
			//30/2 --15+15 //15--> 15/2 --> 7+8 
			//8 --> 8/2 --> 4+4 --> 4/2 =2 --> 1+1
			//n --> n/2 --> n/4 --> n/8
			//generalized
			//k = n/2
			//log(k)=log(n/2)
			//log(k)=log n - log 2 ==> log n - 1 ==> log n
			
			//8/2 --> 4/2 --> 2/2 --> 1
			//8 --> 0 to 7 --> 
			
			// why base 2 because we are dividing by 2
			//divided by 2 --> log with base 2
			//divided by 3 --> log with base 3
			
			
			
			
		} 
	}

}
