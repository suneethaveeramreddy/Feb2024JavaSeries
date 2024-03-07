package linkedlnQuestions;

public class Test07Mar2024_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,8,5,2};
		int res=0;
		for(int x:nums) {
			if(x>res) {
				res=x;
			}
		}
		System.out.println(res);
	}

}
