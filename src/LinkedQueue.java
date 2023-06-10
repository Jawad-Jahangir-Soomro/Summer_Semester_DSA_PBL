public class LinkedQueue{
    private static class Node{
        Object object;
        Node pre = this;
        Node next = this;

        Node(Object object){
            this.object = object;
        }
        Node(Object object,Node pre,Node next){
            this.object = object;
            this.pre = pre;
            this.next = next;
        }
    }

    private Node head = new Node(null);
    private int size;

    public void add(Object object){
        head.pre = head.pre.next = new Node(object,head.pre,head);
        size++;
    }

    public Object first(){
        if(size == 0){
            throw new IllegalStateException("Empty Queue");
        }
        return head.next.object;
    }

    public Object remove(){
        if(size == 0){
            throw new IllegalStateException("Empty Queue");
        }
        Object obj = head.next.object;
        head.next = head.next.next;
        head.next.pre = head;
        --size;
        return obj;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public void traverse(){
        for(Node temp = head.next;temp!=head;temp = temp.next){
            System.out.println(temp.object);
        }
    }
}
