package javasessions;

public class StringWithQuotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love \"Java\" and its concepts";
		System.out.println(str);

		String str1="This is my \"java\" and \"selenium\" code";
		System.out.println(str1);
		
		String username="admin";
		String password="admin123";
		
		String url="https://"+username+":"+password+"@abc.com/login.html";
		System.out.println(url);
		
		//a[text()='swecha']
		String userName="Swecha";
		String xpath="//a[text()='"+userName+"']"; 
		System.out.println(xpath);
	}

}
