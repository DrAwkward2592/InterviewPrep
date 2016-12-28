package CrackingTheCodingInterview.Chapter1_ArraysAndStrings;

public class Q3_URLify {
	
	public static void replaceSpaces(char[] input, int trueLength){
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (input[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		if (trueLength < input.length) input[trueLength] = '\0';
		for (i = trueLength - 1; i >= 0; i--) {
			if (input[i] == ' ') {
				input[index - 1] = '0';
				input[index - 2] = '2';
				input[index - 3] = '%';
				index = index - 3;
			} else {
				input[index - 1] = input[i];
				index--;
			}
		}
	}
	
	public static int findTrueLength(String input){
		
		for(int i=input.length()-1;i>=0;i--){
			if(input.charAt(i)!=' '){
				return i+1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		String str = "Mr John Smith    ";
		char input[] = str.toCharArray();
		replaceSpaces(input, findTrueLength(str));
		
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]);
		}
		
	}
}
