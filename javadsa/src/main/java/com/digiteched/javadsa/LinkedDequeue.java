package com.digiteched.javadsa;

import com.digiteched.javadsa.interfaces.IDequeue;

// TODO implement `IDequeue`
public class LinkedDequeue<T> implements IDequeue<T> {

    private class LinkedNode<T> {

        private LinkedNode next;
        private LinkedNode previous;
        private T data;

        LinkedNode(T data) {
            this.data = data;
        }

        public LinkedNode setNext(LinkedNode next) {
            this.next = next;
            return this;
        }

        public LinkedNode setPrevious(LinkedNode previous) {
            this.previous = previous;
            return this;
        }

        public LinkedNode next() {
            return next;
        }

        public LinkedNode previous() {
            return previous;
        }

        public T data(){
            return data;
        }

    }

    private int count = 0;
    private LinkedNode head;
    private LinkedNode tail;

    @Override
    public void addFirst(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFirst'");
    }

    @Override
    public T getFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFirst'");
    }

    @Override
    public T removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public void addLast(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLast'");
    }

    @Override
    public T getLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLast'");
    }

    @Override
    public T removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public int size() {
        return count;
    }

}
