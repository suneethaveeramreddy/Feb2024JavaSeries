package javasessions;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static array: size is fixed

		// int array:
		int k[] = new int[4];
		// lowest index of the array = li =0
		// highest index of the array = hi = 4 ---> len -1
		// length = 4 --> hi+1
		// range : 0 to 3

		//k[-1] = 60;
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;
		// k[4]=50; //ArrayIndexOutOfBoundException -- AIOB

		System.out.println("==================================");

		int count = 0;

		int p[] = { 10, 2, 3, 5 }; // using this syntax we can assign values to an array

		for (int e : p) {

			System.out.println("The value at index : " + count + " = " + e);

			count++;

		}

	}

}
