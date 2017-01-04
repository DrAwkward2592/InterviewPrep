package CrackingTheCodingInterview.Chapter2_LinkedLists;

public class Q4_Partition {

	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode headBeforePivot = null;
		LinkedListNode tailBeforePivot = null;
		LinkedListNode headAfterPivot = null;
		LinkedListNode tailAfterPivot = null;
		
		while(node!=null){
			LinkedListNode next = node.next;
			//node.next = null;
			if(node.data<x){
				if(headBeforePivot==null){
					headBeforePivot = node;
					tailBeforePivot = headBeforePivot;
				}
				else{
					tailBeforePivot.next = node;
					tailBeforePivot = node;
				}
			}
			else{
				if(headAfterPivot==null){
					headAfterPivot = node;
					tailAfterPivot = headAfterPivot;
				}
				else{
					tailAfterPivot.next = node;
					tailAfterPivot = node;
				}
			}
			node=node.next;
		}
		
		if(headBeforePivot==null){
			return headAfterPivot;
		}
		
		tailBeforePivot.next = headAfterPivot;
		return headBeforePivot;
	}
	
	public static LinkedListNode partition_optimized(LinkedListNode node, int x){
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
		while(node!=null){
			LinkedListNode next = node.next;
			
			if(node.data<x){
				node.next = head;
				head = node;
			}
			else{
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
	public static void main(String args[]){
		int[] vals = {33,9,2,3,10,10389,838,874578,5};
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());
		
		/* Partition */
		LinkedListNode h = partition_optimized(head, 3);
		
		/* Print Result */
		System.out.println(h.printForward());
	}
}
	
