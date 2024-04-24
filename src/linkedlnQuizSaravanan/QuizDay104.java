package linkedlnQuizSaravanan;

public class QuizDay104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits(12345));
	}
	public static int sumDigits(int n) {
		if(n==0) {
			return 0;
		}else {
			return n%10 +sumDigits(n/10);
		}
	}
}
