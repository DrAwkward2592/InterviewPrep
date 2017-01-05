package CrackingTheCodingInterview.Chapter2_LinkedLists;

public class Q5_SumLists {
	
	private static LinkedListNode sum(LinkedListNode l1, LinkedListNode l2, int carry) {
		if (l1 == null && l2 == null && carry == 0) {
             return null;
		}
		
		LinkedListNode result = new LinkedListNode();
		int value = carry;
		if (l1 != null) {
			value += l1.data;
		}
		if (l2 != null) {
			value += l2.data;
		}
		result.data = value % 10;
		if (l1 != null || l2 != null) {
			LinkedListNode more = sum(l1 == null ? null : l1.next, 
										   l2 == null ? null : l2.next, 
										   value >= 10 ? 1 : 0);
			result.setNext(more);
		}
		return result;
	}
	
	public static int linkedListToInt(LinkedListNode node) {
		int value = 0;
		if (node.next != null) {
			value = 10 * linkedListToInt(node.next);
		}
		return value + node.data;
	}	
	
	public static int sumForward(LinkedListNode l1, LinkedListNode l2){
		
		LinkedListNode head1 = l1;
		LinkedListNode head2 = l2;
		int length1 = 0;
		int length2 = 0;
		while(head1!=null){
			length1++;
			head1 = head1.next;
		}
		
		while(head2!=null){
			length2++;
			head2 = head2.next;
		}
		int result = 0;
		
		while(length1>length2){
			result = result * 10 + head1.data;
			head1 = head1.next;
			length1--;
		}
		
		while(length2>length1){
			result = result*10 + head2.data;
			head2 = head2.next;
			length2--;
		}

		while(l1!=null || l2!=null){
			result*=10;
			if(l1!=null){
				result+=l1.data;
				l1 = l1.next;
			}
			
			if(l2!=null){
				result+=l2.data;
				l2 = l2.next;
			}
		}
		return result;
	}
	public static void main(String argsp[]){
		LinkedListNode lA1 = new LinkedListNode(3, null, null);
		LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
		
		LinkedListNode lB1 = new LinkedListNode(5, null, null);
		LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
		LinkedListNode lB3 = new LinkedListNode(1, null, lB2);	
		
		//LinkedListNode list3 = addLists(lA1, lB1);
		
		System.out.println(lA1.printForward());		
		System.out.println(lB1.printForward());	
		System.out.print(sum(lA1, lB1, 0).printForward());
		System.out.println();
		System.out.println(sumForward(lA1, lB1));
	}
}
