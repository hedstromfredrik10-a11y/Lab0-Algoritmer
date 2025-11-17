package se.hig.aod.lab0;

public abstract class ArrayStack<T> implements Stack<T> {

    private T[] elements;
    private int topIndex;

    @Override
    public void clear() {
        for (int i = 0; i <= topIndex; i++) {
            elements[i] = null;
        }
        topIndex = -1;
        System.out.println("Stack cleared");
    }

    @Override
    public boolean isEmpty() {
        return (elements[0] == null);
    }

    // @Override
    // public boolean isFull() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    // }

    // @Override
    // public void push(Object element) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'push'");
    // }

    // @Override
    // public Object pop() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'pop'");
    // }

    // @Override
    // public Object peek() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'peek'");
    // }

}
