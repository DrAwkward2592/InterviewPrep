package CrackingTheCodingInterview.Chapter1_ArraysAndStrings;

import java.util.HashMap;

public class Q2_StringPermutations {

	
	public boolean isPermutation(String first, String second){
		HashMap<Character, Integer> dictionary1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> dictionary2 = new HashMap<Character, Integer>();
		
		if (first.length() != second.length()) return false;
		
		for(int i=0;i<first.length();++i){
			int count = dictionary1.containsKey(first.charAt(i))? dictionary1.get(first.charAt(i)) : 0;
			dictionary1.put(first.charAt(i), count + 1);
		}
		
		for(int i=0;i<second.length();++i){
			int count = dictionary2.containsKey(second.charAt(i))? dictionary2.get(second.charAt(i)) : 0;
			dictionary2.put(second.charAt(i), count + 1);
		}
		
		boolean is_permutation = true;
		for(Character key : dictionary1.keySet()){
			if (dictionary2.containsKey(key)){
				if (dictionary1.get(key) != dictionary2.get(key)) is_permutation = false;
				break;
			}
			else{
				is_permutation = false;
				break;
			}
		}
		
		return is_permutation;
	}
	
}
