package chapter4;

public class LabeledContinue {
	public static void main (String [] args) {
		int   count = 0;
		outer:
			for (int i = 0; i < 10; i++) {
			inner:
				for (int j = 0; j<10; j++){
					if   (j == 2) continue inner;
					if   (j == 5) continue outer;
					++count;
				}
		}
		System.out.println("count = "+count);
	}
}
