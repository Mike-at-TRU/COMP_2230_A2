package com.digiteched.javadsa;

import com.digiteched.javadsa.exceptions.FailedToDequeueFromEmptyQueueException;
import com.digiteched.javadsa.interfaces.IQueue;

public class LinkedQueue<T> implements IQueue<T> {
    @Override
    public void enqueue(T item) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T dequeue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();

    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }
}
