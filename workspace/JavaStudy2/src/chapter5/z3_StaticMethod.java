package chapter5;

class Count {
	public static int scount = 0;
	public int count = 0;
	public static void sIncrement() {
		scount++;
	}
	public void increment() {
		count++;
	}
}

public class z3_StaticMethod {
	public static void main(String[] args){
		Count c = new Count();
		Count d = new Count();
		
		c.increment(); Count.sIncrement();
		d.increment(); d.sIncrement();
		
		System.out.print("Insatance Value: c.count = "+c.count);
		System.out.println(", Static Value: c.scount = "+c.scount);
		
		System.out.print("Instance Value: d.count = "+d.count);
		System.out.println(", Static Value: Count.scount = "+Count.scount);
		
		System.out.println("Sahred Value ? "+(c.scount == d.scount));
	}
}
