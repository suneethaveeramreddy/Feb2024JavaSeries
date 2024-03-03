package incrementdecreoperators;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;//2//1
		int b=2;//1//2
		System.out.println(--b- ++a+ ++b- --a);//1-2+2-1//0
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
