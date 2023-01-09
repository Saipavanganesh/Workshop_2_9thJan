package com.bridgelabz;

public class LinkedList {
    Node head;
    public void addFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    public void append(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    public void display(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.print("NULL");
    }
}
