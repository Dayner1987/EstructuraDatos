import java.util.*;

public class Main {
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        CircleLinked list = new CircleLinked();
        int n;

        do {
            printMenu();
            System.out.print("Choose an option: ");
            n = lector.nextInt();
            lector.nextLine();

            switch (n) {
                case 1:
                    opOne(list);
                    break;
                case 2:
                    opTwo(list);
                    break;
                case 3:
                    opThree(list);
                    break;
                case 4:
                    opFour(list);
                    break;
                case 5:
                    opFive(list);   
                    break;
                case 6:
                    opSix(list);
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Select correct please!!!");
                    break;
            }
        } while (n != 7);
    }

    static void printMenu() {
        System.out.println("\n--- Music Menu ---");
        System.out.println("1. Register Music");
        System.out.println("2. Print Musics");
        System.out.println("3. Next");
        System.out.println("4. Prev");
        System.out.println("5. Aleatory");
        System.out.println("6. Delete");
        System.out.println("7. Exit");
    }

    static void opOne(CircleLinked list) {
        System.out.print("Name: ");
        String name = lector.nextLine();
        System.out.print("Artist: ");
        String artist = lector.nextLine();
        System.out.print("Duration: ");
        double duration = lector.nextDouble();
        lector.nextLine(); // limpiar buffer
        System.out.print("Genre: ");
        String genre = lector.nextLine();

        Music music = new Music(name, artist, duration, genre);
        list.add(music);
    }

    static void opTwo(CircleLinked list) {
        list.printList();
    }

    static void opThree(CircleLinked list) {
        list.next();
    }

    static void opFour(CircleLinked list) {
        list.prev();
    }

    static void opFive(CircleLinked list) {
        list.aleatory();
    }

    static void opSix(CircleLinked list) {
        System.out.print("Enter the name of the music to delete: ");
        String nameToDelete = lector.nextLine();
        list.delete(nameToDelete);
    }
}
