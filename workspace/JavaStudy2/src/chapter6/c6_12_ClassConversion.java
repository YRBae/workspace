package chapter6;

class SuperClass12 {
	public boolean equals(Object obj) {
		if (obj instanceof SuperClass12)
			return true;
		else
			return false;
	}
}

class SubClass12 extends SuperClass12 {
	public boolean equals(Object obj) {
		if (obj instanceof SubClass12)
			return true;
		else
			return false;
	}
}

public class c6_12_ClassConversion {
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		SubClass sub = new SubClass();

		if (sup.equals(sub))
			System.out.println("casting up is calid");
		else
			System.out.println("casting up is not valid");
		if (sub.equals(sup))
			System.out.println("casting down is calid");
		else
			System.out.println("casting down is not valid2");
	}
}