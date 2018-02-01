package com.linkedlistsample;

/**
 * Created by Flexsin on 2/1/18.
 */

class SinglyLinkedList {
    // the size of linked list
    private int size;
    //denote the head object
    private Node head;
    //denote the last object in link list
    private Node tail;

    /*  Constructor  */
    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /*  Function to check if list is empty  */
    public boolean isEmpty() {
        return head == null;
    }

    /*  Function to get size of list  */
    public int getSize() {
        return size;
    }

    /*  Function to insert an element */
    public void insert(int val) {
        Node node = new Node(val, null);
        size++;
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.setNode(node);
            tail = node;
        }
    }

    /**
     * The purpose of this method is to delete the element from tail
     */
    public void deleteFromTail() {
        delete(getSize());
    }

    /*  Function to delete an element at any position  */
    private void delete(int pos) {
        //delete head
        if (pos == 1) {
            head = head.getNode();
            size--;
            return;

        }
        //delete tail
        if (pos == size) {
            Node s = head;
            Node t = head;
            while (s != tail) {
                t = s;
                s = s.getNode();

            }
            tail = t;
            tail.setNode(null);
            size--;
            return;

        }
        //delete from any position
        Node ptr = head;
        pos = pos - 1;
        for (int i = 1; i < size - 1; i++) {
            if (i == pos) {
                Node tmp = ptr.getNode();
                tmp = tmp.getNode();
                ptr.setNode(tmp);
                break;
            }
            ptr = ptr.getNode();
        }
        size--;
    }

    /**
     * The purpose of this method is to delete the element greater than the target element in the linked list
     *
     * @param target
     */
    public void deleteBasedOnTarget(int target) {
        Node s = head;
        for (int i = 1; i < size + 1; i++) {
            if (s.getData() > target) {
                delete(i);
                deleteBasedOnTarget(target);
                break;
            } else {
                s = s.getNode();
            }
        }
    }

    /*  Function to display elements  */
    public void display() {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;

        }
        if (head.getNode() == null) {
            System.out.println(head.getData());
            return;

        }
        Node ptr = head;
        System.out.print(head.getData() + "->");
        ptr = head.getNode();
        while (ptr.getNode() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getNode();

        }
        System.out.print(ptr.getData() + "\n");
    }

}

