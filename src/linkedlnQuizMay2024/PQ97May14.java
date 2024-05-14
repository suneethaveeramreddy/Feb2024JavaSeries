package linkedlnQuizMay2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PQ97May14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(".s");
		System.out.println(p);
		Matcher m=p.matcher("as");
		System.out.println(m);
		boolean b=m.matches();
		System.out.println(b);
	}

}
