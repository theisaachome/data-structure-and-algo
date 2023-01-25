package com.datastrcuture.linkedlist;

public class LinkedList<T extends  Comparable<T>> implements  Cloneable {

    private Node<T> head=null;
    public  LinkedList(){

    }
    public int countNodes(){
        if (head ==null){
            return  0;
        }else{
            Node<T> current=head;
            int count=0;
            while (current!=null){
                current=current.getNext();
                count++;
            }
            return  count;
        }
    }
    public  void addNode(T data){
        if(head==null){
            this.head=new Node<>(data);
        }else{
            Node<T> current = head;
            while (current.getNext()!=null){
                current=current.getNext();
            }
            current.setNext(new Node<>(data));
        }
    }
}
