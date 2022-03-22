package exercise1;

public class Test {
	
	public void tryCatch02() {
		int num1 = 120, num2 = 120, result = 0;
		result = num2 / (num1-num2);
		System.out.println("Result : " + result);
	}
	
	/*
	 * This is the part of code that you have to copy to answer
	 */
	public void reWriteTryCtach02() {
		int num1 = 120, num2 = 120, result = 0;
		
		try {
			result = num2 / (num1 - num2);
			System.out.println("Result: " + result);
		}
		catch (ArithmeticException e){
			System.out.println("Error : Devison by 0");
		}
	}
	
	public void tryCatch06() {
		try {
			try06(0, "");
			System.out.println("A");
		} catch (ArithmeticException e) {
			System.out.println("B Error");
		}
	}

	public void try06(int num, String s) {
		System.out.println("C");
		try {
			num = s.length();
			num = 200 / num;
		} catch (NullPointerException e) {
			System.out.println("E Error");
		}
		System.out.println("F");
	}
	
	public void tryCatch08() {
		try {
			try08(0, null);
			System.out.println("A");
		}
		catch (NullPointerException e) {
			System.out.println("B");
		}
	}
	
	public void try08(int num, String s) {
		System.out.println("C");
		try {
			num = s.length();
			System.out.println("D");
		}
		//Finally will run always
		finally {
			System.out.println("E");
		}
		
		System.out.println("F");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		
		//No. 1
		test.reWriteTryCtach02();
		
		//No. 2
		System.out.println("\nThis is the result of no. 2");
		test.tryCatch06();
		
		//No. 3
		System.out.println("\nThis is the result of no. 3");
		test.tryCatch08();
	}
}
