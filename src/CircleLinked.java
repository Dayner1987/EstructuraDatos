import java.util.Random;

public class CircleLinked {
    private Nodo head = null;
    private Nodo current = null;
    private int size = 0;

    public void add(Music music) {
        Nodo newNodo = new Nodo(music);
        if (head == null) {
            head = newNodo;
            head.next = head;
            head.prev = head;
            current = head;
        } else {
            Nodo tail = head.prev;

            newNodo.next = head;
            newNodo.prev = tail;
            tail.next = newNodo;
            head.prev = newNodo;
            current=newNodo;
        }
        size++;
    }

    public void printList() {
        if (size == 0) {
            System.out.println("No Music registers");
            return;
        }
        Nodo currentS = head;
        do {
            System.out.println(currentS.music.toString());
            currentS = currentS.next;
        } while (currentS != head);
    }

    public void next() {
        if (current != null) {
            current = current.next;
            System.out.println("Now playing: " + current.music);
        } else {
            System.out.println("List is empty.");
        }
    }

    public void prev() {
        if (current != null) {
            current = current.prev;
            System.out.println("Now playing: " + current.music);
        } else {
            System.out.println("List is empty.");
        }
    }

    public void aleatory() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }

        int randSteps = new Random().nextInt(size);
        for (int i = 0; i < randSteps; i++) {
            current = current.next;
        }
        System.out.println("Now playing (Random): " + current.music);
    }
    public void delete(String name) {
        if (size == 0) {
            System.out.println("No music registers!!");
            return;
        }

        Nodo temp = head;
        int count = 0;

        do {
            if (temp.music.getName().equalsIgnoreCase(name)) {
                if (size == 1) {
                    // Único nodo
                    head = null;
                    current = null;

                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;

                    if (temp == head) {
                        head = temp.next;
                    }
                    if (temp == current) {
                        current = temp.next;
                    }
                }

                size--;
                System.out.println("Deleted: " + name);
                return;
            }

            temp = temp.next;
            count++;
        } while (temp != head && count < size);

        System.out.println("Music not found: " + name);
    }

}
