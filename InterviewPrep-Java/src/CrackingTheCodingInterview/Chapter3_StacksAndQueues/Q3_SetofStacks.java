package CrackingTheCodingInterview.Chapter3_StacksAndQueues;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class Q3_SetofStacks {

	public ArrayList<Stack<Integer>> stacks;
	public int capacity;
	
	public Q3_SetofStacks(int capacity){
		stacks = new ArrayList<>();
		this.capacity = capacity;
	}
	
	public boolean isEmpty(){
		Stack<Integer> last = getLastStack();
		return last==null || last.isEmpty();
	}
	
	public Stack<Integer> getLastStack(){
		if(stacks.size()==0) return null;
		return stacks.get(stacks.size()-1);
	}
	
	public void push(int data){
		Stack<Integer> last = getLastStack();
		
		if(last!=null && !isFull())
		last.push(data);
		
		last = new Stack<>();
		last.push(data);
		stacks.add(last);
	}
	
	public boolean isFull(){
		Stack<Integer> last = getLastStack();
		if(last.size()==capacity) return true;
		return false;
	}
	
	public int pop(){
		Stack<Integer> last = getLastStack();
		if(last==null) throw new EmptyStackException();
		Integer popped = last.pop();
		if(last.isEmpty()){
			stacks.remove(stacks.size()-1);
		}
		return popped;
	}
}
