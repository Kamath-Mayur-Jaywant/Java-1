package OOPJ;


class DivByZeroException extends Exception{
	public DivByZeroException(String message) {
		super(message);
	}
}
public class Test_Exception{

	public static void main(String[] args) {
		System.out.println("Exception");
		int n=10;
		int d=0;
		int result;
		try {
			if(d==0) {
				throw new DivByZeroException("division by zero not allowed");
			}
			
			
		}
		
		catch(DivByZeroException e1) {
			System.out.println(e1.getMessage());
		}
		catch(ArithmeticException e2) {
			System.out.println(e2.getMessage());
		}
		finally {
			System.out.println("Finally block executed");
		}
}
}
