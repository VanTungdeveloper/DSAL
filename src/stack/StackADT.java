package stack;

public interface StackADT<T> extends Iterable {
    void push(T element);
    T pop();
     int size();
     boolean isEmpty();
}
