class MyException_A extends Exception {
	public String toString() {
		return "I am a MyException_A object";
	}
}

class MyException_B extends MyException_A {
	public String toString() {
		return "I am a MyException_B object";
	}
}

class MyException_C extends MyException_A {
	public String toString() {
		return "I am a MyException_C object";
	}
}

public class JavaProgram {
	public static void fun() {		// purple code
		try {
			int i;			
			System.out.println("FA");
			if (true)
				i = 3 / 0; 		// green code
			if (true)
				throw new MyException_B();
			System.out.println("BA");
		} catch (MyException_B e) {				
			System.out.println("P1 " + e.toString()); 
		} 								
		catch (MyException_A e) { 				
			System.out.println("P2 " + e.toString()); 
			throw e; 						
		} 								
		// finally {
		// 	System.out.println("In finally");
		// }
		finally {
			System.out.println("In finally");
			int arr[] = new int[2];
			arr[4] = 7;
		}
		System.out.println("BC");
	}

	public static void main(String[] args) {
		try {
			System.out.println("A");
			fun();
			if (true)
				throw new MyException_B();
			System.out.println("B");
		} catch (MyException_B e) {
			System.out.println("P3 " + e.toString());
		} catch (MyException_A e) {
			System.out.println("P4 " + e.toString());
		} catch (Exception e) {
			System.out.println("P5 " + e.toString());
		}
		System.out.println("F");
	}
}
