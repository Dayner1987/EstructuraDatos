package circulares;

import java.util.Scanner;

public class Main {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        CircleLinkedList list = new CircleLinkedList();

        int res;
        do{
            printMenu();
            System.out.println("Print a option: ");
            res=lector.nextInt();

            switch(res){
                case 1:
                    optionOne(list);
                    break;

                case 2:
                    optionTwo(list);
                    break;
                case 3:
                    optionThree(list);
                    break;
                case 4:
                    System.out.println("Tanks for use my Menu!!!");
                    break;

            }
        }while(res!=4);
    }
    static void printMenu(){
        System.out.println("****** MENU ******");
        System.out.println("1.Register Music");
        System.out.println("2.print ListMusic ");
        System.out.println("3.print Aleatory ListMusic ");
        System.out.println("4.Exit");

    }

    static void optionOne(CircleLinkedList list) {
        lector.nextLine();
        System.out.println("INSERT NAME: ");
        String name=lector.nextLine();
        System.out.println("INSERT ARTIST: ");
        String art=lector.nextLine();
        System.out.println("INSERT DURATION: ");
        Double duration=lector.nextDouble();

        Music newMusic= new Music(name,art,duration);
        list.add(newMusic);

    }
    static void optionTwo(CircleLinkedList list){
        int size=list.size();
        if(size==0){
            System.out.println("NO MUSIC REGISTERS");
        }else{
            list.printList();
        }

    }
    static void optionThree(CircleLinkedList list){
        int size=list.size();
        if(size==0){
            System.out.println("NO MUSIC REGISTERS");
        }else{
            list.aleatoryList();
        }

    }

}
