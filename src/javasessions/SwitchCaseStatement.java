package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch - case: is only allowed for int,short, byte, string , char
		String browser = "naveen";
		double version = 111.11;

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			if (version == 111.11) {
				System.out.println("launch chrome 111.11");
				break;
			}
			break;
		case "firefox":
			System.out.println("launch chrome");
			break;
		case "safari":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch chrome");
			break;
		default:
			System.out.println("plz pass the right browser name..." + browser);
			break;
		}
		//
		int marks = 95;
		switch(marks) {
		case 10:
			System.out.println("grade D");
			break;
		case 90:
			System.out.println("grade A");
			break;
			
		default:
			System.out.println("FAIL");
			break;
		}
	}

}
