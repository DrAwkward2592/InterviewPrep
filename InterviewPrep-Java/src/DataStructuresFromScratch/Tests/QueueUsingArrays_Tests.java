package DataStructuresFromScratch.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import DataStructuresFromScratch.QueueUsingArrays;

public class QueueUsingArrays_Tests {

	@Test
	public void test() {
		QueueUsingArrays<Integer> queue = new QueueUsingArrays<>();
		queue.enqueue(1).enqueue(2).enqueue(3);
		assertEquals("1 2 3", queue.toString());
		assertEquals(false, queue.isEmpty());
	}
	
	@Test
	public void test1(){
		QueueUsingArrays<Integer> queue = new QueueUsingArrays<>();
		queue.enqueue(1).enqueue(2).enqueue(3);
		assertEquals("1", queue.peek().toString());
	}
	
	@Test
	public void test2(){
		QueueUsingArrays<Integer> queue = new QueueUsingArrays<>();
		queue.enqueue(1);
		queue.dequeue();
		assertEquals(true, queue.isEmpty());
	}
	

}
