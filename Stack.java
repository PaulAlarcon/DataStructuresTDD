import java.util.Arrays;

public class Stack {
    final static int MAX_CAPACITY =  Integer.MAX_VALUE/10;
    int capacity;
    private int[] arr;
    int size;

    Stack(){
        capacity = 10;
        size = 0;
        arr = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int item) {
        if(size == capacity )
            arr = Arrays.copyOf(arr, capacity < MAX_CAPACITY ? capacity <<= 1 : MAX_CAPACITY);
        arr[size++] = item;
    }

    public int pop() {
        return arr[--size];
    }

    public boolean contains(int i) {
        for(int el : arr)
            if(el == i)
                return true;
        return false;
    }

    public int peek() {
        return arr[size - 1];
    }
}
