package DataStructuresFromScratch;

public class StackUsingArrays<T> {

    private T[] array;

    private int top;

    public StackUsingArrays()
    {
        array = (T[]) new Object[2];
    }

    private void resize(int capacity)
    {
        T[] tmp = (T[]) new Object[capacity];
        System.arraycopy(array, 0, tmp, 0, top);
        array = tmp;
    }

    public StackUsingArrays<T> push(T element)
    {
        if (array.length == top) resize(array.length * 2);
        array[top++] = element;
        return this;
    }

    public T pop()
    {
        if (top == 0) throw new java.util.NoSuchElementException();
        T element = array[--top];
        array[top] = null;
        if (top > 0 && top == array.length / 4) resize(array.length / 2);
        return element;
    }
    
    public T peek(){
    	return array[top-1];
    }

    @Override
    public String toString()
    {	
    	StringBuilder output = new StringBuilder();
    	for(int i=top-1;i>=0;i--){
    		output.append(array[i]).append(" ");
    	}
        return output.toString().trim();
    }

}