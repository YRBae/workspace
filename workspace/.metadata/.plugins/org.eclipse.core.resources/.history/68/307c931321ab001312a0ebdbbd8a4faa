package chapter1;
class Stack<StackType>{
	private StackType[] stack = (StackType[]) new Object[100];
	private int sp = -1;
	public void push(StackType element){
		stack[++sp] = element;
	}
	public StackType pop(){
		return stack[sp--];
	}
}

public class GenericClassExample {
	public static void main(String[] args){
		Stack<Integer> stk1 = new Stack<Integer>();
		Stack<Double> stk2 = new Stack<Double>();
		stk1.push(1); stk1.push(2); stk1.push(3);
		System.out.println("integer stack : "+stk1.pop()+" "+stk1.pop()+" "+stk1.pop());
		stk2.push(1.5); stk2.push(2.5); stk2.push(3.5);
		System.out.println("double stack : "+stk2.pop()+" "+stk2.pop()+" "+stk2.pop());
	}
}
