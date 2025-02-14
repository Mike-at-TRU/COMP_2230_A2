package com.digiteched.javadsa;

import com.digiteched.javadsa.exceptions.FailedToDequeueFromEmptyQueueException;
import com.digiteched.javadsa.interfaces.IDequeue;
import com.digiteched.javadsa.utils.Factory;

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
     public LinkedDequeue() {


    }

    @Override
    public void addFirst(T element) {
        if(count == 0){
            head = new LinkedNode(element);
            tail = head;
        }else{
            LinkedNode newNode = new LinkedNode(element);
            head.setPrevious(newNode);
            newNode.setNext(head);
            head = newNode;
        }
        count++;
    }

    @Override
    public T getFirst() {
        return  head.data();
    }

    @Override
    public T removeFirst() {
        if(count ==0){
            throw new FailedToDequeueFromEmptyQueueException();
        }
        LinkedNode out = head;
        head = head.next();
        return out.data();
    }

    @Override
    public void addLast(T element) {
      if(count == 0){
        tail = new LinkedNode(element);
        head = tail;
      }
      else{
        LinkedNode newNode = new LinkedNode(element);
        tail.setNext(newNode);
        newNode.setPrevious(tail);
        tail = newNode;
      }
      count++;
    }

    @Override
    public T getLast() {
        return  tail.data();
    }

    @Override
    public T removeLast() {
        if(count ==0){
            throw new FailedToDequeueFromEmptyQueueException();
        }
        LinkedNode out = tail;
        tail = tail.previous;
        return out.data;
    }

    @Override
    public int size() {
        return count;
    }

}
