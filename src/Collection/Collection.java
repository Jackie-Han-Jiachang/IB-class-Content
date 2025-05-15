package Collection;

public class Collection {
    private Object[] data;
    private int size;
    private int next; //index to the "next" item

    public Collection(){
        this.data = new Object[5];
        this.size = 0;
        this.next = 0;
    }

    public void add(Object x) {

        //check full
        if (this.size >= this.data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i <data.length; i++){
                newData[i] = data[i];
            }

            this.data = newData;
        }

        this.data[this.size] = x;
        this.size++;
    }

    public Object remove (int index) {
        Object ret = data[index];
        if (index > size){
            throw new IllegalArgumentException("404 not found" + index);
        }
        for (int i = index; i < size; i++){
            data[i] = data[i+1];
        }
        size--;
        return ret;
    }

    public Object getValue(int index){
        if (index > size){
            throw new IllegalArgumentException("404 not found" + index);
        }
        return data[index];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void resetNext(){
        next = 0;
    }

    public boolean hasNext(){
        return next < size;
    }

    public Object getNext(){
        if (hasNext()){
            next++;
            return data[next-1];
        }
        throw new IllegalStateException("We dont have a next to return");
    }

    public int size() {
        return size;
    }
}
