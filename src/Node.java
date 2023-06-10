class Node{
    Node next;
    Object data;

    Node(Object obj){
        this.data = obj;
    }

    Node(Object obj,Node next){
        this.data = obj;
        this.next = next;
    }
}
