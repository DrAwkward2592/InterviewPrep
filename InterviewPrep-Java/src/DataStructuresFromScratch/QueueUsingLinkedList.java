package DataStructuresFromScratch;

public class QueueUsingLinkedList<T>{

    private int total;

    private Node first, last;

    private class Node {
        private T element;
        private Node next;
    }

    public QueueUsingLinkedList() { }

    public QueueUsingLinkedList<T> enqueue(T element)
    {
        Node current = last;
        last = new Node();
        last.element = element;

        if (total++ == 0) first = last;
        else current.next = last;

        return this;
    }

    public T dequeue()
    {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = first.element;
        first = first.next;
        if (--total == 0) last = null;
        return ele;
    }
    
    public boolean isEmpty(){
    	if (total==0) return true;
    	return false;
    }
    
    public T peek(){
    	return first.element;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.element).append(" ");
            tmp = tmp.next;
        }
        return sb.toString().trim();
    }

}
