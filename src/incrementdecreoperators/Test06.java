package incrementdecreoperators;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=19;
		int j=29;
		int k=0;
		
		int m=i-- - j-- -k--;//19-29-0//-10
		
		System.out.println("i="+i);//18
		System.out.println("j="+j);//28
		System.out.println("k="+k);
		System.out.println("m="+m);
		
	}

}
