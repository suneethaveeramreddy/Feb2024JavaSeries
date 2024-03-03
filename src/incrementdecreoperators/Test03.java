package incrementdecreoperators;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;//1//0//1//0
		i = i++ - --i+ ++i-i--;//0-0+1-1//0
		System.out.println(i);
	}

}
