package CrackingTheCodingInterview.Chapter2_LinkedLists;

public class Q3_DeleteMiddleNode {
	
	public static boolean deleteMiddle(LinkedListNode n){
		if(n==null || n.next == null){
			return false;
		}
		LinkedListNode next = n.next;
		
		n.data = next.data;
		n.next = next.next;
		return true;
	}
	
	public static void main(String args[]){
		LinkedListNode first = new LinkedListNode(0, null, null); 
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		deleteMiddle(head.next.next.next);
		System.out.print(head.printForward());
	}
}
