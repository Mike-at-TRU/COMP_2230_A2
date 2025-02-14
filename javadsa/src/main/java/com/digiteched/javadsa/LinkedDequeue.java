package com.digiteched.javadsa;

import com.digiteched.javadsa.interfaces.IDequeue;

// TODO implement `IDequeue`
public class LinkedDequeue<T> implements IDequeue<T> {

    private class LinkedNode {

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
        if(count == 0){
            head = new LinkedNode(element);
            tail = head;
        }else{}
        count++;
    }

    @Override
    public T getFirst() {
        return  head.data();
    }

    @Override
    public T removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public void addLast(T element) {
      if(count == 0){
        tail = new LinkedNode(element);
        head = tail;
      }
      else{}
      count++;
    }

    @Override
    public T getLast() {
        return  tail.data();
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
