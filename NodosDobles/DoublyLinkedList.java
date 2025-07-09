// DoublyLinkedList.java
public class DoublyLinkedList {
    private Nodo2 head;
    private Nodo2 tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Nodo2 newNode = new Nodo2(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addFirst(int data) {
        Nodo2 newNode = new Nodo2(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void printList() {
        Nodo2 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printListReverse() {
        Nodo2 current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void printFirst() {
        System.out.println(head.data);
    }
    public void printLast() {
        System.out.println(tail.data);
    }

    public void printNext() {
        if (head != null && head.next != null) {
            System.out.println(head.next.data);
        } else {
            System.out.println("No more numbers to next");
        }
    }

    public void printPrevious() {
        if (tail != null && tail.prev != null) {
            System.out.println(tail.prev.data);
        } else {
            System.out.println("No more previus tail");
        }
    }

    public int size() {
        int count = 0;
        Nodo2 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}
