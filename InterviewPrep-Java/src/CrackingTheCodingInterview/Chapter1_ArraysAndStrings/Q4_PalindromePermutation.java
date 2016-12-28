package CrackingTheCodingInterview.Chapter1_ArraysAndStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q4_PalindromePermutation {

	//Adds characters to a map and then finds if theres max one odd character
	public static boolean palinPermutation(String input){
		
		input=input.toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<input.length();i++){
			int count = map.containsKey(input.charAt(i)) ? map.get(input.charAt(i)) : 0;
			map.put(input.charAt(i), count+1);
		}
		boolean isOdd = false;
		for(Character key : map.keySet()){
			if(key==' ') continue;
			if(map.get(key) %2 ==1){
				if(isOdd) return false;
				isOdd = true;
			}
		}
		return true;
		
	}
	
	//another way is to just keep track of whether we have odd or even number of occurances
	public static boolean isPalinPossible(String input){
		input = input.toLowerCase();
		Set<Character> oddLetters = new HashSet<>();
	    for ( char c : input.toCharArray() ) {
	    	if(c == ' ') continue;
	        if ( ! oddLetters.remove(c) ) {
	            oddLetters.add(c);
	        }
	    }
	    return oddLetters.size() <= 1;
	}
	
	//To save space, most optimal solution is using a bit vector to keep track of bits set
	public static boolean bitVector(String input){
		input = input.toLowerCase();
		
		int bitVector = 0;
		for(Character c: input.toCharArray()){
			if(c==' ') continue;
			
			//get character index 
			int index = Character.getNumericValue(c) - Character.getNumericValue('a');
			//left shift mask by index spaces
			int mask = 1 << index;
			
			//if bit vector and mask is zero then OR it else AND the inverse
			if ((bitVector & mask) == 0) {
				bitVector |= mask;
			} else {
				bitVector &= ~mask;
			}
		}
		
		return bitVector==0 || (bitVector & (bitVector - 1)) == 0;
	}
	
	public static void main(String args[]){
		String input = "Tact Coa";
		System.out.println(palinPermutation(input));
		System.out.println(isPalinPossible(input));
		System.out.println(bitVector(input));
	}
}
