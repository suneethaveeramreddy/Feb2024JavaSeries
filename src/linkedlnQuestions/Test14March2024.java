package linkedlnQuestions;

import java.util.Arrays;

public class Test14March2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {0,2,4,1,3};
		for(int i=0;i< A.length;i++){
			A[i]=A[(A[i]+3)%A.length];
		}
		System.out.println(Arrays.toString(A));
	}

}
