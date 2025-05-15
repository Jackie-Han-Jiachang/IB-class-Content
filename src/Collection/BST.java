package Collection;

public class BST {
    private class Node{
        int value;
        Node left;
        Node right;

        public Node (int v) {
            this.value = v;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    

    public BST() {
        this.root = null;
    }

    //helper function to help us with recursion
    //returns the 
    public Node add(int value, Node current){
        if (current == null){
            return new Node(value);
        }else if (current.value > value) {
            current.left = add(value, current.left);
        }else {
            current.right = add(value, current.right);
        }
        return current;
    }

    public void add(int x){
        root = add(x, root);
    }

    public boolean contains(int value, Node current){
        if (current == null){
            return false;
        }
        if (current.value == value){
            return true;
        } else if (current.value > value){
            return contains(value, current.left);
        } else{
            return contains(value, current.right);
        }
    }
    public boolean contains(int x){
        return contains(x, root);
    }

    public int findMin(Node current){
            if (current == null){
                return -1;
            }else if (current.left == null){
                return current.value;
            } else {
                return findMin(current.left);
            }
    }

    public int findMin(){
        return findMin(root);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(50);
        bst.add(30);
        bst.add(70);

        System.out.println(bst.findMin()); // true
         // false
    }
}



