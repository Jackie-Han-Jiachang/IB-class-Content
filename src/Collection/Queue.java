package Collection;


public class Queue {
    private class Node{
        Object value;
        Node next;

        public Node(Object value){
            this.value = value;
            // this.next = next;
        }
    }

    private Node front;
    private Node back;
    //Collection data;

    public Queue(){
        front = null;
        back = null;
    }

    void enqueue(Object value){
        Node n = new Node(value);
        n.value = value;
        n.next = null;

        if(back == null){
            back = n;
            front = n;
        } else {
            back.next = n;
            back = n;
        }
    }

    /*
     * PreCondition: Do not call this if the Queue is Empty.
     * 
     * returns the *value* stored at the front of the queue.
     * 
     * PostContition: 
     * throws an exception if the Queue is empty
     * or retures the value at the front of the queue
     * removes the item from the queue.
     */

    Object dequeue(){
        if(front == null){
            // good candidate for throwing exception
            throw new IllegalStateException("I am empty");
        } else{
            Object ret = front.value;
            front = front.next;
            return ret;
        }
    }

    boolean isEmpty(){
        return front == null;
    }
}
