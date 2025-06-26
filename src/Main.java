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
