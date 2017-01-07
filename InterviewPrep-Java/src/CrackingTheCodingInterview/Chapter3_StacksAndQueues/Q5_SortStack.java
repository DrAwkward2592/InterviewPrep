package CrackingTheCodingInterview.Chapter3_StacksAndQueues;

import java.util.Stack;

public class Q5_SortStack {

	public static void sortStack(Stack<Integer> primary){
		Stack<Integer> secondary = new Stack<>();
		
		while(!primary.isEmpty()){
			int temp = primary.pop();
			
			while(!secondary.isEmpty() && secondary.peek()> temp){
				primary.push(secondary.pop());
			}
			secondary.push(temp);
			
		}
		
		//reverse the order
		while(!secondary.isEmpty()){
			primary.push(secondary.pop());
		}
	}
	
	public static Stack<Integer> mergesort(Stack<Integer> inStack) {
		if (inStack.size() <= 1) {
			return inStack;
		}

		Stack<Integer> left = new Stack<Integer>();
		Stack<Integer> right = new Stack<Integer>();
		int count = 0;
		while (inStack.size() != 0) {
			count++;
			if (count % 2 == 0) {
				left.push(inStack.pop());
			} else {
				right.push(inStack.pop());
			}
		}

		left = mergesort(left);
		right = mergesort(right);

		while (left.size() > 0 || right.size() > 0) {
			if (left.size() == 0) {
				inStack.push(right.pop());
			} else if (right.size() == 0) {
				inStack.push(left.pop());
			} else if (right.peek().compareTo(left.peek()) <= 0) {
				inStack.push(left.pop());
			} else {
				inStack.push(right.pop());
			}
		}

		Stack<Integer> reverseStack = new Stack<Integer>();
		while (inStack.size() > 0) {
			reverseStack.push(inStack.pop());
		}

		return reverseStack;
	}
	
	public static void main(String args[]){
		Stack<Integer> sorted = new Stack<>();
		
		sorted.push(4);
		sorted.push(5);
		sorted.push(1);
		sorted.push(3);
		sorted.push(11);
		sorted.push(7);
		sorted.push(9);
		
		sortStack(sorted);
		
		System.out.println(sorted.toString());
	}
}
