import java.util.Arrays;
 
public class MyArrayList {
 
    private Object[] my_array;
    private int actSize = 0;
     
    public MyArrayList(){
        my_array = new Object[10];
    }
     
    public Object get(int index){
        if(index < actSize){
            return my_array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public void add(Object obj){
        if(my_array.length == actSize){
            increaseCapacity();
        }
        my_array[actSize++] = obj;
    }
     
    public Object remove(int index){
    	if(index >= actSize){
    	throw new ArrayIndexOutOfBoundsException();
    	}

    	Object delobj = my_array[index];

    	for(int i=index ; i<=actSize;i++ ){
    		my_array[i] = my_array[i+1];
    	}
    	my_array[actSize--] = null;

    	return delobj;
    	}
     
    public int size(){
        return actSize;
    }
     
    private void increaseCapacity(){
        my_array = Arrays.copyOf(my_array, my_array.length*2);
    }
     
    public static void main(String a[]){
        MyArrayList mal = new MyArrayList();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }
}