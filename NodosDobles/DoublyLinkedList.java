public class DoublyLinkedList {
    private Nodo2 head;
    private Nodo2 tail;
    public static Nodo2 currentS;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        currentS = null;
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
            currentS = head;
            System.out.println(currentS.data);
    }

    public void printLast() {
            currentS = tail;
            System.out.println(currentS.data);
    }

    public void printNext() {
        if (currentS != null && currentS.next != null) {
            currentS = currentS.next;
            System.out.println(currentS.data);

        } else if (currentS == null) {
            System.out.println("No start navegation.");
        } else {
            System.out.println("No next element (value=null).");
        }
    }

    public void printPrevious() {
        if (currentS != null && currentS.prev != null) {
            currentS = currentS.prev;
            System.out.println(currentS.data);

        } else if (currentS == null) {
            System.out.println("No start navegation.");
        } else {
            System.out.println("No previous element(value=null).");
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
