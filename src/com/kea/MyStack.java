package com.kea;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack<T> {

    Deque<T> stack = new LinkedList<T>();

    public T peek(Deque<T> stack) {
        return stack.peek();
    }

    public T pop(Deque<T> stack) {
        return stack.pop();
    }

    public void push(T te, Deque<T> stack){
        stack.addFirst(te);
    }

    public boolean empty(Deque<T> stack){
        return stack.isEmpty();
    }

}
