package linkedlnQuizMay2024;

public class PQMay08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int number=25/5;
			System.out.println(number);
		} catch (NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally");
		}
	}

}
