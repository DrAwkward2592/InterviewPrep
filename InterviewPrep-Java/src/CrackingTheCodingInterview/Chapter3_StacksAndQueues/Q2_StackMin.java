package CrackingTheCodingInterview.Chapter3_StacksAndQueues;

import java.util.Stack;

public class Q2_StackMin extends Stack<StackNode> {

	public Q2_StackMin(){
		
	}
	
	public void push(int data){
		int min = Math.min(data, min());
		super.push(new StackNode(data, min));
	}
	
	public int min(){
		if(this.isEmpty()) return Integer.MAX_VALUE;
		else return this.peek().minSoFar;
	}
	
	public static void main(String[] args) {
		Q2_StackMin stack = new Q2_StackMin();
		int[] array = {2, 1, 3, 1};
		for (int value : array) {
			stack.push(value);
			System.out.print(value + ", ");
		}
		System.out.println('\n');
		for (int i = 0; i < array.length; i++) {
			System.out.println("Popped " + stack.pop().data);
			System.out.println("New min is " + stack.min());
		}
	}
}
