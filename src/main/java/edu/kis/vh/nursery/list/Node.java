package edu.kis.vh.nursery.list;

public class Node {

    public int value;
    public Node prev, next;

    /**
     * Konstruktor klasy Node inicjalizujący wartość węzła.
     * Początkowo wskaźniki prev i next są ustawione na null.
     *
     * @param i Wartość przypisana do węzła.

     */
    public Node(int i) {
        value = i;
    }
    
}
