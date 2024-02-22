package javasessions;

public class SwitchCaseUseCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aeiou
		
		char alphabet='z';
		
		switch (alphabet) {
		case 'a':
			System.out.println("this is vowel");
			break;
		case 'e':
			System.out.println("this is vowel");
			break;
		case 'i':
			System.out.println("this is vowel");
			break;
		case 'o':
			System.out.println("this is vowel");
			break;
		case 'u':
			System.out.println("this is vowel");
			break;

		default:
			System.out.println("this is consonant");
			break;
		}
		
		// env -dev/qa/stage/uat/prod
		
		String envName=" Prod ";
		switch(envName.trim().toLowerCase()) {
		case "qa":
			System.out.println("run it on QA");
			break;
		case "dev":
			System.out.println("run it on dev");
			break;
		case "stage":
			System.out.println("run it on stage");
			break;
		case "uat":
			System.out.println("run it on uat");
			break;
		case "prod":
			System.out.println("run it on prod");
			break;
			
		default:
			System.out.println("no env is found...." +envName);
			break;
		} 
		
		//cross browser testing:
		//days in a week/ months in a year
		//booking app --- uber:
		String carType="mini";
		int persons=4;
		switch (carType) {
		case "mini":
				if(persons<=4) {
					System.out.println("mini is allocated");
				}
			break;
		case "sedan":
			if(persons>=5) {
				System.out.println("sedan is allocated");
			}
		break;
		default:
			break;
		}
		//user based permissions//RBAC: admin, customer, seller, partner, vendor
		//run test cases: sanity, smoke, regression, prod
		//loan type : home , car ,educational, personal

	}

}
