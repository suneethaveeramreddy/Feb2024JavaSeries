package incrementdecreoperators;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0, n=0;
		int p=--m*--n*n--*m--;//-1*-1*-1*-1
		System.out.println(p);//1
		System.out.println(m);//-2
		System.out.println(n);//-2
	}

}
