package com.linkedlistsample;

/**
 * Created by Flexsin on 2/1/18.
 * This class represent the single node in the linked list. which have a data part and a link part
 * that holds the address of next node
 */

public class Node {

    private int mData;
    private Node mNode;

    /*  Constructor  */
    public Node() {
        mNode = null;
        mData = 0;
    }

    /*  Constructor  */
    public Node(int data, Node node) {
        mData = data;
        mNode = node;
    }

    /*  Function to set mNode to next Node  */
    public Node getNode() {
        return mNode;
    }

    /*  Function to set mData to current Node  */
    public void setNode(Node node) {
        mNode = node;
    }

    /*  Function to get mNode to next node  */
    public int getData() {
        return mData;
    }

    /*  Function to get mData from current Node  */
    public void setData(int data) {
        mData = data;
    }

}

