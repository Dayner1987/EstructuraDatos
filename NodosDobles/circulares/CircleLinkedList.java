package circulares;
import java.util.Random;
public class CircleLinkedList {
    private Nodo head;
    private Nodo tail;
    private int size;
    public static Nodo CurrentS;

    public CircleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Music data) {
        Nodo newN = new Nodo(data);

        if (head == null) {
            head = newN;
            tail = newN;
            newN.next = head;
        } else {
            tail.next = newN;
            newN.next = head;
            tail = newN;

        }

        size++;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List null.");
            return;
        }

        Nodo current = head;
        do {
            System.out.println(current.music.toString());
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public void aleatoryList() {
        if (head == null) {
            System.out.println("List null.");
            return;
        }

        Random rand= new Random();
        int start=rand.nextInt(size);

        Nodo current= head;
        for(int i=0;i<start;i++){
            current=current.next;
        }
        Nodo start2=current;
        do{
            System.out.println(current.music.toString());
            current=current.next;
        }while(current!=start2);
    }

    public int size() {
        return size;
    }
}
