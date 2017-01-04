package CrackingTheCodingInterview.Chapter2_LinkedLists;

public class Q2_KtoLast {
	
	public static LinkedListNode KthToLast(LinkedListNode head, int k) {
		
		LinkedListNode p1 = null;
		LinkedListNode p2 = null;
		
		for(int i=0;i<k;i++){
			if(p2==null) return null;
			p2 = p2.next;
		}
		
		while(p2!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1; 
		
	}
}
