package Collection;

public class LinkedList {
    private class Node{
        Object data;
        Node next;
    
        public Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList(){
        head = null;
    }

    public void add(Object value, int index){
        Node n = new Node(value);
       

        if(index == 0){
            n.next = head;
            head = n;
        }

        Node temp = head;
        int count = 0;

        while(temp != null && count < index-1){
            temp = temp.next;
            count++;
        }

        if(temp == null){
            throw new IndexOutOfBoundsException("notFound!");
        }

        n.next = temp.next;
        temp.next = n;
    }

    public Object remove(int index){
        Node temp = head;
        int count = 0;
        if(index == 0){
            Object ret = head.data;
            head = head.next;
            return ret;
        }

        while(temp != null && count < index-1){
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null){
            throw new IndexOutOfBoundsException("notFound!");
        }
        
        Object ret = temp.next.data;
        temp.next = temp.next.next;
        return ret;
    }

    public boolean isEmpty(){
        return (head == null) ? true : false;
    }

    public boolean contains(Object value){
        Node temp = head;
        while(temp != null){
            if (temp.data == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
