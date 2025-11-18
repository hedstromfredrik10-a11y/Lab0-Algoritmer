package se.hig.aod.lab0;

public abstract class ArrayStack<T> implements Stack<T> {

    private T[] elements;
    private int topIndex;

    public ArrayStack(int capacity) {
        elements = (T[]) new Object[capacity]; // Skapar en ny stack med en viss kapacitet
        topIndex = -1; // Gör en tom stack
    }

    @Override
    public void clear() {
        for (int i = 0; i <= topIndex; i++) {
            elements[i] = null;
        }
        topIndex = -1; // topIndex = -1 betyder att stacken är tom
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1; // Kontrollerar om topIndex är -1 alltså om stacken är tom
    }

    @Override
    public boolean isFull() {
        return topIndex == elements.length - 1; // Kontrollerar om topIndex är samma som länged på arrayen, vilket
                                                // indikerar full
    }

    @Override
    public void push(T element) {
        if (isFull()) {
            throw new StackFullException("Stacken är full, kan inte pusha");
        }
        elements[++topIndex] = element; // Ökar först topIndex och lägger in ett element på den platsen
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new StackEmptyException("Stacken är tom, kan inte poppa");
        }
        T o = elements[topIndex]; // Hämtar elementet från toppen och lagrar den i o
        elements[topIndex] = null; // Rensar den platsen
        topIndex--; // Gör stacken en kortare
        return o;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new StackEmptyException("Stacken är tom, kan inte peeka");
        }
        return elements[topIndex]; // Kollar på elementet högst upp i stacken
    }

}
