package array;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {
    private T[] arr;
    private int length = 0;
    private int size=0;

    public int getLength() {
        return length;
    }
    public DynamicArray(){
        this(10);
    }
    public DynamicArray(int capacity) {
        this.length = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index, T element){
        arr[index] = element;
    }

    public void add(T element){
        if(size >= length - 1){
            length *= 2;
            T[] newArr = (T[]) new Object[length];
//            System.arraycopy(arr, 0, newArr, 0, arr.length);
            for (int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr=newArr;
        }
        arr[size++] = element;
    }

    public void removeAt(int index){
        if(index >= size || index < 0) throw new IndexOutOfBoundsException("Index out of bound");
        T[] newArr = (T[]) new Object[size-1];

        for(int i= 0, j=0; i < size; i++, j++){
            if(i ==index){
                j--;
            }else {
                newArr[j] = arr[i];
            }
        }
        arr = newArr;
        length = size--;
    }

    public T removeAtWithoutMoving(int removeIndex) {
        if(removeIndex>=size || removeIndex<0) throw new IndexOutOfBoundsException();
        T item = arr[removeIndex];
        arr[removeIndex] = null;
        length = --size;
        return item;
    }

    public boolean remove(Object object){
        int indexOf = indexOf(object);
        if(indexOf != -1){
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public int indexOf(Object object){
        for(int i = 0; i < size; i++){
            if(object == null){
                if(arr[i] == null){
                    return i;
                }
            }else{
                if(object.equals(arr[i])) return i;
            }
        }
        return -1;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index==size;
            }
            @Override
            public T next() {
                return arr[index++];
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < size - 1; i++){
            sb.append(arr[i]).append(",");
        }
        sb.append(arr[size-1]).append("]");
        return sb.toString();
    }
}
