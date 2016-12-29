package CrackingTheCodingInterview.Chapter1_ArraysAndStrings;

public class Q5_OneAway {

	public static boolean oneAway(String s1, String s2){
		
		int l1=s1.length();
		int l2 = s2.length();
		
		if (Math.abs(l1-l2)>1) return false;
		
		int diffCount = 0, i=0, j=0;
		
		while(i<l1 && j<l2){
			if(s1.charAt(i)!=s2.charAt(j)){
				if(diffCount==1) return false;
				
				if(l1>l2) i++;
				else if(l1<l2) j++;
				else if(l1==l2){
					i++;
					j++;
				}
				diffCount++;
			}
			else{
				i++;
				j++;
			}
		}
		if(i<l1 || j<l2){
			diffCount++;
		}
		return diffCount==1;
	}
	
	public static void main(String args[]){
		System.out.println(oneAway("palessss", "pales"));
	}
}
