package com.isaachome.linkedlist;

/**
 *
 *  A {@code Node } is a generic class which can hold any type of Data.<p>
 *
 *  The Data should be Comparable
 *  This is for Equality checks, So you can do things like find  what index a particular element is located at in a list.
 *
 */
public class Node<T extends  Comparable<T>>{
    /**
     * The  information within any node is the actual Data as well as a reference to the next node.
     */
    private  T data;
    private  Node<T> next;
    public Node(T data){
        this.data =data;
        this.setNext(null);
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}