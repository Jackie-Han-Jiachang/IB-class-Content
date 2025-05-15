package Collection;

public class Main {
    public static void main(String[] args) {
    //    Queue a = new Queue();
    //    a.enqueue(1);
    //    a.enqueue(2);
    //    a.enqueue(3);

    //    while (!a.isEmpty()){
    //        Object value = a.dequeue();
    //        IBIO.output(value.toString());
    //    }

    LinkedList ll = new LinkedList();

    ll.add(4,0);
    ll.add(5,1);
    ll.add(3,0);
    ll.add(6,3);

    // ll.add(7,5); //should be an error


    Object v;
    v = ll.remove(1);

    System.out.println(v.toString());

    v = ll.remove(0);
    System.out.println(v.toString());
    }
}
