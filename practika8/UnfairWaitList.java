package ru.mirea.practika8;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        this.content.remove(element);
    }

    public void moveToBack(E element) {
        content.remove(element);
        super.add(element);
    }
}