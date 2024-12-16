package com.WOF.www;
import com.WOF.www.WofQueue;
import com.WOF.www.WofStack;

public class Run {
    public static void main(String [] args){
         WofQueue<Integer> queue = new WofQueue<>();
         WofStack<Integer> stack = new WofStack<>();
         for (int i = 0; i < 20; i++){
              queue.enqueue(i);
              stack.push(i);
         }
         System.out.println("Queue size: " + queue.size());
         System.out.println("Stack size: " + stack.size());
         System.out.println("Queue is full: " + queue.isFull());
         System.out.println("Stack is full: " + stack.isFull());
         for (int i = 0; i < 10; i++){
              System.out.println("Queue item: " + queue.dequeue());
              System.out.println("Stack item: " + stack.pop());
         }
         System.out.println("Queue is empty: " + queue.isEmpty());
         System.out.println("Stack is empty: " + stack.isEmpty());
    }
}
