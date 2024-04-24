package classandobjects;

public class Employee {
	
		//Class --> Category, BluePrint, Templates 
		//Object: physical entity created from Class(Specific Category)
		//Every object will have its own properties
	
		//class var: 
		String name;
		int age;
		double salary;
		String city;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i=10; //local variable
			//create the object of the class: using new keyword 
			Employee obj=new Employee();
			//employee - class name
			// obj --> Object reference name
			//new --> is keyword to create the object 
			//new Employee() --> Object 
			
		obj.name="Tom";
		obj.age=20;
		obj.salary=12.33;
		obj.city="LA";
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		Employee obj1=new Employee();
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.salary);
		System.out.println(obj1.city);
		
			
	}

}
