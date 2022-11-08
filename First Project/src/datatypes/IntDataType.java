package datatypes;

public class IntDataType {
	
	public static void main(String[] args) {
		int a = 10; //int data types allows only integer values
		int b = 0; // default value of int data is 0(zero)
		           //int is a 32 bit data type
		           //range is -2147438648 to 2147438647
		
		int c = 2147483647; //it accepts bcz within range
		//int d = 2147483648; it gives compile error because out of range
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
