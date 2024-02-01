package stack;

import linkedlist.DefaultDoublyLinkedList;
import linkedlist.DoublyLinkedList;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasedStack<T> implements StackADT<T> {
    private int index = -1;

    private DoublyLinkedList<T> linkedList = new DefaultDoublyLinkedList<>();

    public LinkedListBasedStack(){}
    public LinkedListBasedStack(T element){
        push(element);
    }
    @Override
    public void push(T element) {
        linkedList.addLast(element);
        index++;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return linkedList.peekLast();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator iterator() {
        return linkedList.iterator();
    }
}
