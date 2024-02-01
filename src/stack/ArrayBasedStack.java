package stack;

import array.DynamicArray;

import java.util.EmptyStackException;
import java.util.Iterator;

public class ArrayBasedStack<T> implements StackADT<T> {
    private int index = -1;
    private DynamicArray<T> array = new DynamicArray<>();
    public ArrayBasedStack(){};
    public ArrayBasedStack(T element){
        push(element);
    };
    @Override
    public void push(T element) {
        array.add(element);
        index++;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return array.get(index--);
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator iterator() {
        return array.iterator();
    }
}
