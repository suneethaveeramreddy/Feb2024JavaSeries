package javasessions;

public class DataTypesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. byte:
		//size 1 byte = 8 bits
		//range:-128 to 127

		byte b=10;
		byte b1=20;
		b=40;
		System.out.println(b);
		byte c=-10;
		byte v=0;
		//byte n=130; //throws error as n is not in range -128 to 127
		
		//2. Short:
		//size 2 bytes = 8*2 = 16 bits 
		//range: -32768 to 32767 
		short s = 1000;
		//short s1 =32768; //throws error as s1 is not in range -32768 to 32767
		System.out.println(s);
		
		//3. int 
		//size 4 bytes = 4*8 = 32 bits
		//range: 2^31 to (2^31)- 1 
		int i = 100000;
		int j = 1;
		int l = 0;
		int k = -989;
		
		//4. long:
		//size 8 bytes = 8*8 = 64 bits
		//range: 2^63 to (2^63)-1
		long l1 = 123456789;
		System.out.println(l1);
		
		//5. float:
		//size: 4 bytes = 4*8 = 32 bits
		//range: after . it can take up to 6 to 7 digits.
		
		float g=12.33f;
		float h=(float)12.55;
		float p=100;
		
		System.out.println(g);
		System.out.println(h);
		System.out.println(p);
		
		//6. Double:
		//size: 8 bytes = 64 bits.
		//range: after . it can take up to 15 digits.
		
		double d = 12.33333;
		System.out.println(d);
		
		//7. char
		//size 2 bytes = 16 bits 
		//unicode chars: ASCII + special uni code chars (symbolic, Chinese, Japanese)
		//range:
		//a-z: 97 to (97+25)122
		//A-Z: 65 to (65+25)90
		//0-9: 48 to 57
		char c1 = 'a';
		char c2 = 'A';
		char c3	= '1'; //49
		char c33 = '2'; //50
		char c4 = '$';
		char gender = 'F';
		char execution = 'Y';
		
		char c11 = 'b';
		
		System.out.println(c1); // prints a
		System.out.println(c11); // prints A 
		System.out.println(c1+c11);//prints sum of ASCII values of a and A
		System.out.println(c11-c1);//1
		
		System.out.println(c3+c33);
		System.out.println(c1);
		// if we don't know the ASCII value of any character below is the formula/logic.
		System.out.println((int)c1);
		System.out.println((int)'@');
		System.out.println((byte)'$');
		
		int go = 100;
		char pop = 'a';
		System.out.println(go + pop); //197
		System.out.println(c1+""+c11);
		System.out.println('a'+'1');
		System.out.println(12.33+'a');
		
		//boolean: true/false:
		//size: ~1 bit 
		boolean flag = true;
		boolean flg = false;
		
		int totalBillAmount = 9000;
		int total_fee_amount = 1000;
		
		
		

	}

}
