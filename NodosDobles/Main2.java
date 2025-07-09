import java.util.Scanner;

public class Main2 {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        DoublyLinkedList list2 = new DoublyLinkedList();

        int res;
        do{
            printMenu();
            System.out.println("Print a option:");
            res=lector.nextInt();

            switch(res){
                case 1:
                    optionOne(list2);
                    break;

                case 2:
                    optionTwo(list2);
                    break;
                case 3:
                    optionThree(list2);
                    break;
                case 4:
                    optionFour(list2);
                    break;
                case 5:
                    optionFive(list2);
                    break;
                case 6:
                    optionSix(list2);
                    break;
                case 7:
                    optionSeven(list2);
                    break;
                case 8:
                    System.out.println("Thanks for your preference!!!");
                    break;

            }
        }while(res!=8);
    }
    static void printMenu(){
        System.out.println("****** MENU ******");
        System.out.println("1.Insert Number");
        System.out.println("2.List Numbers");
        System.out.println("3.List Numbers in Reverse");
        System.out.println("4.Show Firts");
        System.out.println("5.Show Last");
        System.out.println("6.Show Next");
        System.out.println("7.Show Previous");
        System.out.println("8.Exit");

    }

    static void optionOne(DoublyLinkedList list2) {
        System.out.println("Insert a Number to add: ");
        int newNumer = lector.nextInt();
        list2.add(newNumer);
    }
    static void optionTwo(DoublyLinkedList list2){
        if(list2.size()==0){
            System.out.println("Error!!! No numbers registred!!");
        }else{
            System.out.print("\tlist Numbers: ");
            list2.printList();
        }

    }
    static void optionThree(DoublyLinkedList list2){

        if(list2.size()==0){
            System.out.println("Error!!! No numbers registred!!");
        }else{
            System.out.print("\tlist Numbers Reverse: ");
            list2.printListReverse();
        }

    }
    static void optionFour(DoublyLinkedList list2){
        if(list2.size()==0){
            System.out.println("Error!!! No numbrs registred!!");
        }else{
            System.out.print("\tFirt Number: ");
            list2.printFirst();
        }

    }
    static void optionFive(DoublyLinkedList list2){
        if(list2.size()==0){
            System.out.println("Error!!! No numbers registred!!");
        }else{
            System.out.print("\tLast Number: ");
            list2.printLast();
        }

    }
    static void optionSix(DoublyLinkedList list2){
        if(list2.size()==0){
            System.out.println("Error!!! No numbers registred!!");
        }else{
            System.out.print ("\tNext Number: ");
            list2.printNext();
        }

    }
    static void optionSeven(DoublyLinkedList list2){
        if(list2.size()==0){
            System.out.println("Error!!! No numbers registred!!");
        }else{
            System.out.print ("\tPrevius Number: ");
            list2.printPrevious();
        }


    }
}
