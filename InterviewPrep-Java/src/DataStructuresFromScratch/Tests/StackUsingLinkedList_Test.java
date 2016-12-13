package DataStructuresFromScratch.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import DataStructuresFromScratch.StackUsingArrays;

public class StackUsingLinkedList_Test {

	@Test
	public void test() {
		StackUsingArrays<Integer> stack = new StackUsingArrays<>();
		stack.push(1).push(2).push(3);
		assertEquals("3 2 1", stack.toString());
	}
	
	@Test
	public void test1() {
		StackUsingArrays<Integer> stack = new StackUsingArrays<>();
		stack.push(1).push(2).push(3);
		stack.pop();
		assertEquals("Passed", "2 1", stack.toString());
	}
	
	@Test
	public void test2() {
		StackUsingArrays<Integer> stack = new StackUsingArrays<>();
		stack.push(1).push(2).push(3);
		assertEquals("3", stack.peek().toString());
	}

}
