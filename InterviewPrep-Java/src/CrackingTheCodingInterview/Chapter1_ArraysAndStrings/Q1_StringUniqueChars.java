package CrackingTheCodingInterview.Chapter1_ArraysAndStrings;


import java.util.HashSet;

public class Q1_StringUniqueChars {
	
	/*Determine if a string has all unique characters.
	 * What if you can't use other data structures?
	 */
	public boolean hasUniqueChars(String input){
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i=0;i<input.length();i++){
			if(set.contains(input.charAt(i))) return false;
			else set.add(input.charAt(i));
		}
		return true;
	}
	
	public static void main(String a[]){
		
		Q1_StringUniqueChars s = new Q1_StringUniqueChars();
		System.out.println(s.hasUniqueChars("abc"));
		System.out.println(s.hasUniqueChars("aaba"));
	}

}

