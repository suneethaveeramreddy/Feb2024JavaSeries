package linkedlnQuizSaravanan;

public class QuizDay97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(5));
	}
	
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);//f(4)+f(3)== f(1)+0+f(1)+f(1)+0+f(1)+0+f(1)=5
	}
}
