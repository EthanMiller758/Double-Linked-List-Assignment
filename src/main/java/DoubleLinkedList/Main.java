package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertDLL(1, 0);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);

        System.out.println("Original DLL:");
        doublyLinkedList.traverseDLL();

        System.out.println("Reverse Traverse:");
        doublyLinkedList.reverseTraverseDLL();

        int targetValue = 2;
        DoublyNode foundNode = doublyLinkedList.searchDLL(targetValue);
        if (foundNode != null) {
            System.out.println("Found value " + targetValue + " at node: " + foundNode.value);
        } else {
            System.out.println("Value " + targetValue + " not found in DLL");
        }

        doublyLinkedList.deleteDLL(2);
        System.out.println("DLL after deleting value 2:");
        doublyLinkedList.traverseDLL();

        doublyLinkedList.deleteEntireDLL();
        System.out.println("DLL after deleting entire list:");
        doublyLinkedList.traverseDLL();
    }
}
