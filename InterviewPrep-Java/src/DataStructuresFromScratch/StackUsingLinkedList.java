package DataStructuresFromScratch;

public class StackUsingLinkedList<T> {

    private int top;

    private Node first;

    private class Node {
        private T element;
        private Node next;
    }

    public StackUsingLinkedList() { }

    public StackUsingLinkedList<T> push(T element)
    {
        Node current = first;
        first = new Node();
        first.element = element;
        first.next = current;
        top++;
        return this;
    }

    public T pop()
    {
        if (first == null) new java.util.NoSuchElementException();
        T ele = first.element;
        first = first.next;
        top--;
        return ele;
    }
    
    public boolean isEmpty(){
    	if (top==0) return true;
    	return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.element).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

}
