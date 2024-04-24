package classandobjects;

public class Student {
	
	//class vars/template vars:
	String name="tom";
	int marks;
	char grade;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.name="Ravi";
		s1.marks=90;
		s1.grade='A';
		
		Student s2=new Student();
		s1.name="Mitaj";
		s1.marks=95;
		s1.grade='A';

		Student s3=new Student();
		s1.name="Vinayk";
		s1.marks=60;
		s1.grade='C';
		
		System.out.println(s1.name + " " + s1.marks);
	}

}
