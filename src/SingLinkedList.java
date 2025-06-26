public class SingLinkedList {
    private Nodo head = null;

    public void add(int data) {
        Nodo newNodo = new Nodo(data);

        if (head == null) {
            head = newNodo;
        } else {
            Nodo current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNodo;
        }
    }

    public void printLis(){
        Nodo current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println("");
    }
    public int size(){
        Nodo current = head;
        int cout=0;
        while(current!=null){
            cout++;
            current=current.next;
        }
        return cout;
    }

    public boolean searchData(int x){
        Nodo current = head;
        boolean res=false;
        while(current!=null){
            if(current.data==x){
                res=true;
            }
            current=current.next;
        }
        return res;
    }

}
