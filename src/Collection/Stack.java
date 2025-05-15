package Collection;

public class Stack {
    Collection data;

    Stack(){
        data = new Collection();
    }

    void push(Object value){
        data.add(value);
    }

    Object pop(){
        return data.remove(data.size()-1);
    }

    boolean isEmpty(){
        return data.isEmpty();
    }

}
