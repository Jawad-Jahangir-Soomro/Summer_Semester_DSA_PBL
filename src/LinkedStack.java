public class LinkedStack{
    private Node top;
    private int size;

    public boolean isEmpty(){
        return (size == 0);
    }

    public Object peek(){
        if(size == 0){
            throw new java.util.NoSuchElementException("Empty Stack");
        }
        return top.data;
    }

    public Object pop(){
        if(size == 0){
            throw new java.util.NoSuchElementException("Empty Stack");
        }
        Object obj = top.data;
        top = top.next;
        size--;
        return obj;
    }

    public void push(Object obj){
        top = new Node(obj,top);
        ++size;
    }

    public int size(){
        return size;
    }
}