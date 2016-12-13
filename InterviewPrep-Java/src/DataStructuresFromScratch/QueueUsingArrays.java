package DataStructuresFromScratch;
import java.util.NoSuchElementException;

public class QueueUsingArrays<T> {

    private T[] array;

    private int total, first, next;

    public QueueUsingArrays()
    {
        array = (T[]) new Object[2];
    }

    private void resize(int capacity)
    {
        T[] tmp = (T[]) new Object[capacity];

        for (int i = 0; i < total; i++)
            tmp[i] = array[(first + i) % array.length];

        array = tmp;
        first = 0;
        next = total;
    }

    public QueueUsingArrays<T> enqueue(T ele)
    {
        if (array.length == total) resize(array.length * 2);
        array[next++] = ele;
        if (next == array.length) next = 0;
        total++;
        return this;
    }

    public T dequeue()
    {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = array[first];
        array[first] = null;
        if (++first == array.length) first = 0;
        if (--total > 0 && total == array.length / 4) resize(array.length / 2);
        return ele;
    }
    
    public boolean isEmpty(){
    	if (total==0) return true;
    	return false;
    }
    
    public T peek(){
    	return array[first];
    }

    @Override
    public String toString()
    {	
    	StringBuilder sb = new StringBuilder();
    	for(int i=first;i<total;i++){
    		sb.append(array[i]).append(" ");
    	}
    	return sb.toString().trim();
    }

}
