package com.digiteched.javadsa;

import com.digiteched.javadsa.interfaces.IStack;

public class LinkedStack<T> implements IStack<T> {
    private class LinkedStackNode {
        public final T data;

        public LinkedStackNode(T data) {
            this.data = data;
        }

        private LinkedStackNode next;

        public LinkedStackNode getNext() {
            return next;
        }

        public void setNext(LinkedStackNode next) {
            this.next = next;
        }
    }

    private int count;

    private LinkedStackNode top;

    public LinkedStack() {
        count = 0;
    }

    @Override
    public void push(T item) {
        LinkedStackNode newNode = new LinkedStackNode(item);

        LinkedStackNode secondInLine = isEmpty() ? null : top;

        top = newNode;

        if (secondInLine != null) {
            top.setNext(secondInLine);
        }

        count++;
    }

    @Override
    public T pop() {
        // TODO throw if empty

        LinkedStackNode outNode = top;

        top = top.getNext();

        count--;

        return outNode.data;
    }

    @Override
    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

}
