package chapter2;

enum Week{
	Sunday(0), Monday(1), Tuesday(2), Wednesday(4),Thursday(8), Friday(16), Saturday(32);
	
	private final int value;
	
	Week(int value) { this.value = value;}
	
	public int value() {return value;}
}

public class PredefinedValueEnumTypeExample {
	public static void main(String[] args){
		for(Week w: Week.values()){
			System.out.println(w + ": ordinal=" + w.ordinal()+", value=" + w.value());
		
		}
	}
}
