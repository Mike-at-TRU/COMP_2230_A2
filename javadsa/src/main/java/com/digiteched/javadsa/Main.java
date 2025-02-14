package com.digiteched.javadsa;

public class Main {
    public static void main(String[] args) {
        LinkedDequeue<String> dequeue = new LinkedDequeue<String>();
        dequeue.addFirst("Hello");
        dequeue.addFirst("there");
        dequeue.addFirst("how");
        dequeue.addFirst("are");
        dequeue.addFirst("you");
        dequeue.iterator().forEachRemaining((x) -> System.out.print(x + " "));
    }
}