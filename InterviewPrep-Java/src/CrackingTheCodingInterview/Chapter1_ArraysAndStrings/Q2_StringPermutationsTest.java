package CrackingTheCodingInterview.Chapter1_ArraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q2_StringPermutationsTest {

	@Test
	public void test() {
		Q2_StringPermutations q = new Q2_StringPermutations();
		boolean actual = q.isPermutation("abcde", "edcba");
		boolean expected  = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		Q2_StringPermutations q = new Q2_StringPermutations();
		boolean actual = q.isPermutation("abce", "edcba");
		boolean expected  = false;
		assertEquals(expected, actual);
	}

}
