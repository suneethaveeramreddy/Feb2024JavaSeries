package linkedlnQuestions;

public class Test28Feb2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Try");
			throw new RuntimeException();
		}catch(Exception e) {
			System.out.println("catch ");
			System.exit(1);
		}finally{
			System.out.println("Finally");
		}
	

	}

}
