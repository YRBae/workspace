package chapter1;

public class ExceptionExample {
	public static void main(String[] args){
		try{
			System.out.println("Exception throwing...");
			throw new Exception();
		} catch (Exception e){
			System.out.println("Caought Exception");
		} finally {
			System.out.println("In the finally statement...");			
		}
	}
}
