package CrackingTheCodingInterview.Chapter2_LinkedLists;

import java.util.HashSet;

public class Q1_RemoveDups {
	public static void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	public static void deleteDups_withoutBuffer(LinkedListNode n){
		LinkedListNode current = n;
		LinkedListNode runner = null;
		while(current!=null){
			runner = current;
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next = runner.next.next;
				}
				else{
					runner=runner.next;
				}
			}
			current=current.next;
		}
	}
	
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); 
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		deleteDups_withoutBuffer(head);
		System.out.println(head.printForward());
	}
}
