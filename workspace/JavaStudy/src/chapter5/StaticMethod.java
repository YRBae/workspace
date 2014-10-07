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

public class StaticMethod {
	public static void main(String[] args) {
		Count c = new Count();
		Count d = new Count();
		
		c.increment(); Count.sIncrement();
		d.increment(); d.sIncrement();
		
		System.out.print("Instacne Value: c.count = "+c.count);
		System.out.println(", Static Value: c.scout = "+c.scount);
		
		System.out.print("Instace Calue: d.count = "+d.count);
		System.out.println(", Static Value: Count.Scount = "+Count.scount);
		
		System.out.println("Shared Value ? "+ (c.scount == d.scount));
	}
}
