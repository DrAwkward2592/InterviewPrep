package CrackingTheCodingInterview.Chapter1_ArraysAndStrings;

public class Q6_StringCompression {
	public static String StringCompression(String input){
		
		int count=0;
		StringBuilder output=new StringBuilder();
		for(int i=0;i<input.length();++i){
			count++;
			
			if(i+1>=input.length() || input.charAt(i)!=input.charAt(i+1)){
				output.append(input.charAt(i));
				output.append(count);
				count=0;
			}
		}
		if(output.length()<input.length()) return output.toString();
		else return input;
	}
	
	public static void main(String args[]){
		System.out.print(StringCompression("aabbcc"));
	}
}
