package javasessions;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static array: size is fixed

		// int array:
		int k[] = new int[4];
		// lowest index of the array = li =0
		// highest index of the array = hi = 3 ---> len -1
		// length = 4 --> hi+1
		// range : 0 to 3

		// k[-1] = 60;
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;
		// k[4]=50; //ArrayIndexOutOfBoundException -- AIOB
		
		System.out.println(k[0]);
		System.out.println(k[3]);
		//System.out.println(k[4]);

		System.out.println("==================================");

		int count = 0;
		int p[] = { 10, 2, 3, 5 }; // using this syntax we can assign values to an array
		for (int e : p) {
			System.out.println("The value at index : " + count + " = " + e);
			count++;
		}
		
		//2. double array:
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=34.44;
		
		char c[]= new char[3];
		c[0]='a';
		c[1]='A';
		c[2]='0';
		
		System.out.println("====================");
		//string array:
		String browsers[] = new String[4];
		browsers[0] = "chrome";
		browsers[1] = "firefox";
		browsers[2] = "safari";
		browsers[3] = "edge";
		
		System.out.println(browsers[0]);
		
		
		

	}

}
