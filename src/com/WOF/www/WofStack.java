package com.WOF.www;

import java.util.LinkedList;

public class WofStack<T> {
    private LinkedList<T> stack = new LinkedList<>();
    private final int maxSize = 10;

    public void push(T item) {
        if (isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack.addLast(item);
    }

    public T pop() {
        return stack.removeLast();
    }

    public T peek() {
        return stack.getLast();
    }

    public boolean isEmpty() {
return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public boolean isFull() {
        return stack.size() == maxSize;
    }
}