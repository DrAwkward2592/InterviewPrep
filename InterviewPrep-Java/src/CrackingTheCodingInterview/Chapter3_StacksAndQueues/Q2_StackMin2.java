package CrackingTheCodingInterview.Chapter3_StacksAndQueues;

import java.util.Stack;

public class Q2_StackMin2 extends Stack<Integer> {
	private Stack<Integer> minStack;
	
	public Q2_StackMin2(){
		minStack = new Stack<>();
	}
	
	public void push(int data){
		if(data<min()){
			minStack.push(data);
		}
		super.push(data);
	}
	
	public int min(){
		if(minStack.isEmpty()) return Integer.MAX_VALUE;
		return minStack.peek();
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value == min()) minStack.pop();
		return value;
	}
	
	public static void main(String args[]){
		Q2_StackMin2 stack = new Q2_StackMin2();
		int[] array = {2, 1, 3, 1};
		for (int value : array) {
			stack.push(value);
			System.out.print(value + ", ");
		}
		System.out.println('\n');
		for (int i = 0; i < array.length; i++) {
			System.out.println("Popped " + stack.pop());
			System.out.println("New min is " + stack.min());
		}
	}
}
