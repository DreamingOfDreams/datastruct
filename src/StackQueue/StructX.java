package StackQueue;

public class StructX {

    private int maxSize;

    private long[] stackArray;

    private int top;

    public StructX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long value){
        stackArray[++top] = value;
    }
}
