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