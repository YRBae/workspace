package chapter5;

public class z14_BeyondMain {
	static {
		System.out.println("Initialize");
	}
	protected void finalize() throws Throwable{
		System.out.println("Clean Up");
	}
	public static void main(String[] args) {
		System.out.println("int main ...");
	}
}
