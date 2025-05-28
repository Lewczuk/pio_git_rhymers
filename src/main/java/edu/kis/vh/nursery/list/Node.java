package edu.kis.vh.nursery.list;

public class Node {

    public int value;
    private Node prev;
    private Node next;

    /**
     * Konstruktor klasy Node inicjalizujący wartość węzła.
     * Początkowo wskaźniki prev i next są ustawione na null.
     *
     * @param i Wartość przypisana do węzła.

     */
    public Node(int i) {
        value = i;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
