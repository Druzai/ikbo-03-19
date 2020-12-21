package ru.mirea.practika11;

import java.util.Queue;
import java.util.LinkedList;

public abstract class AbstractQueue<E> {
    protected Queue<E> linkedQueue;

    AbstractQueue() {
        linkedQueue = new LinkedList<>();
    }

    public E element() {
        return linkedQueue.peek();
    }

    public E dequeue() {
        return linkedQueue.poll();
    }
}
