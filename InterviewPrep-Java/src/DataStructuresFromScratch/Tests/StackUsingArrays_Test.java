package DataStructuresFromScratch.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import DataStructuresFromScratch.StackUsingArrays;

public class StackUsingArrays_Test {
	
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
	
	@Test
	public void test3(){
		StackUsingArrays<Integer> stack = new StackUsingArrays<>();
		assertEquals(true, stack.isEmpty());
	}
	
	@Test
	public void test4(){
		StackUsingArrays<Integer> stack = new StackUsingArrays<>();
		stack.push(1);
		assertEquals(false, stack.isEmpty());
	}
}
