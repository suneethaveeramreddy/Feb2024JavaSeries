package linkedlnQuestions;

public class Test01032024_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(5));
	}
		
		public static int fibonacci(int n) {
			if(n<=1) {
				return n;
			}
			return fibonacci(n-1)+fibonacci(n-2);
		}
}
