//Implementare qui la classe Coda
public class Coda<T> {
    private Nodo<T> head;
    private Nodo<T> tail;

    public Coda(){
        this.head = null;
        this.tail = null;
    }
    

    public boolean isEmpty(){
        return head == null;
    }
}