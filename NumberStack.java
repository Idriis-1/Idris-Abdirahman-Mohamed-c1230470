import java.util.Arrays;
import java.util.EmptyStackException;

public class NumberStack<T> {
    private static final int BASE_SIZE = 3;
    private int counter;
    private T[] numbers;

    NumberStack() {
        this(BASE_SIZE);
    }

    NumberStack(int capacity) {
        counter = 0;
        numbers = (T[]) (new Object[capacity]);
    }

    public void insert(T value) {
        if (counter == numbers.length)
            grow();
        numbers[counter] = value;
        counter++;
    }

    private void grow() {
        numbers = Arrays.copyOf(numbers, numbers.length * 2);
    }

    public boolean isBlank() {
        return counter == 0;
    }

    public int length() {
        return counter;
    }

    public void printData() {
        if (isBlank())
            throw new EmptyStackException();
        System.out.println("Double values stored in stack:");
        for (int i = 0; i < counter; i++)
            System.out.println(numbers[i]);
        System.out.println();
    }
}