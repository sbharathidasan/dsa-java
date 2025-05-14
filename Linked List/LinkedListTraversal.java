class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedListTraversal{
    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        traverse(head);
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}