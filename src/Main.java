<<<<<<< HEAD
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas= new ArrayList<>();
        Persona p= new Persona("Pepe",123);
        Persona p2= new Persona("Lopez",124);
        Persona p3= new Persona("Micael",125);
        personas.add(p);
        personas.add(p2);
        personas.add(p3);
        for(Persona persona:personas){
            System.out.println(persona);
        }
    }
}
=======
public class Main {
    public static void main(String[] args) {
        SingLinkedList lista = new SingLinkedList();
        System.out.println("List values: ");
        lista.add(5);
        lista.add(10);
        lista.add(30);
        lista.add(50);
        lista.printLis();
        System.out.print("Size List: ");
        System.out.print(lista.size());
        System.out.println("");
        System.out.println("Search List: ");
        System.out.println(lista.searchData(10));
        System.out.println(lista.searchData(30));
        System.out.println(lista.searchData(5));
        System.out.println(lista.searchData(2));

    }
}
>>>>>>> e12bbab22893f25e36d19015520089c9badb6d4b
