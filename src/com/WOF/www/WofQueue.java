package com.WOF.www;

import java.util.LinkedList;

public class WofQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();
    private final int maxSize = 10;

    public void enqueue(T item) {
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        queue.addLast(item);
    }

    public T dequeue() {
        return queue.removeFirst();
    }

    public T peek() {
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public boolean isFull() {
        return queue.size() == maxSize;
    }
}
