package CrackingTheCodingInterview.Chapter3_StacksAndQueues;

import java.util.Queue;
import java.util.Stack;

public class Q4_QueueFromStack<E>{

	public Stack<E> newestTop;
	public Stack<E> oldestTop;
	
	public Q4_QueueFromStack (){
		newestTop = new Stack<>();
		oldestTop = new Stack<>();
	}
	
	public void push(E data){
		newestTop.push(data);
	}
	
	public void shiftStack(){
		if(oldestTop.isEmpty()){
			while(!newestTop.isEmpty()){
				oldestTop.push(newestTop.pop());
			}
		}
	}
	
	public int size(){
		return oldestTop.size() + newestTop.size();
	}
	
	public E pop(){
		shiftStack();
		return oldestTop.pop();
	}
	
	public E peek(){
		shiftStack();
		return oldestTop.peek();
	}
	
	public static void main(String args[]){
		Q4_QueueFromStack<Integer> queue = new Q4_QueueFromStack<>();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.push(6);
		System.out.println(queue.peek());
		queue.pop();
		queue.pop();
		queue.pop();
		
		System.out.println(queue.peek());
	}
}
