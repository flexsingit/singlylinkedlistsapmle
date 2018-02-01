package com.linkedlistsample;

import java.util.Scanner;

/**
 * This class  provide the user option to perform operation on singly linked list
 * Created by Flexsin on 2/1/18.
 */

public class ExampleLinkedListOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Singly linked list operation test\n");
        char ch;
        /*  choose operations on linked list */
        do {
            System.out.println("Singly Linked List Operations\n");
            System.out.println("1. insert element in linked list\n");
            System.out.println("2. delete element from tail\n");
            System.out.println("3. delete values greater than a target value\n");
            int choice = scanner.nextInt();
            chooseOption(choice, scanner, list);
            /*  Display List  */
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

    }

    /**
     * This method perform operation on linked list as per user choice
     *
     * @param choice
     * @param scan
     * @param list
     */
    private static void chooseOption(int choice, Scanner scan, SinglyLinkedList list) {
        switch (choice) {
            case 1:
                //insert element in linked list
                System.out.println("Enter element to insert in linked list");
                list.insert(scan.nextInt());
                break;
            case 2:
                //delete from tail
                if (!list.isEmpty() && list.getSize() > 0) {
                    list.deleteFromTail();
                } else {
                    System.out.println("Empty linked list");
                }
                break;
            case 3:
                //delete all values greater than target value
                System.out.println("Enter the target element");
                int target = scan.nextInt();
                if (!list.isEmpty() && list.getSize() > 0) {
                    list.deleteBasedOnTarget(target);
                } else {
                    System.out.println("Empty linked list");
                }
                break;
            default:
                System.out.println("Wrong operation.Please select a valid operation \n ");
                break;

        }

    }

}