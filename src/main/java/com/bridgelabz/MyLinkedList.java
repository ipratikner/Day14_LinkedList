package com.bridgelabz;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //adding new node to linkedList
    public void add(INode newNode) {
        if (this.tail == null){
            this.tail = newNode;
        }
        if (this.head == null){
            this.head = newNode;
        }else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    //appending node in linkedList
    public void append(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    //inserting node 30 between 56 and 70
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }


    //printing nodes
    public void printmyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes :");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    //pop method for deleting first elements from linkedList
    public void pop(INode newNode) {
        INode tempNode = newNode;
        this.head = tempNode.getNext();
    }

    //deleting last element
    public void popLast( INode newNode) {
        INode tempNode = newNode;
        while (tempNode.getNext().equals((tail))){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode.getNext();
        tempNode.getNext().setNext(null);
        // return tempNode;
    }
    //search nodes
    public INode searchNode(INode newNode) {
        INode tempNode = newNode;
        while(tempNode !=null && tempNode.getNext() != null){
            if(tempNode.getKey().equals(newNode.getKey())){
                System.out.println("The Found value: "+tempNode.getKey());
                break;
            }
            else
                tempNode = tempNode.getNext();
        }
        return tempNode;
    }
}
