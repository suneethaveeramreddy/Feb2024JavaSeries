package javasessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TC --> BIG o
		//SC --> BIG o
		
		int i=1;
		System.out.println(i);
		//Big o(1) -- Constant Time
		String s="Selenium";
		System.out.println(s);
		
		//loop: 1 to 10:
		for(int k=1;i<=10;i++) {
			System.out.println(k);
			
			// 1+n+n+n ==> 3n+1 --> Linear Equation
			//3n + 1 --> 3n --> o(3n)--> o(n)
		}
	}

}
