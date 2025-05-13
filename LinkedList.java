class Node{
    int data;

    Node prev;
    Node next;

}
class LinkedList{
    public static void main(String[] args){
        Node head=new Node();
        head.data=10;
        head.prev=null;
        Node n1=new Node();
        head.next=n1;
        n1.data=90;
        n1.prev=head;
        n1.next=null;
        System.out.println(n1.prev.data);
        System.out.println("node after head node:");
        System.out.println(head.next);
        System.out.println(n1);
        System.out.println("head node");
        System.out.println(head);
        System.out.println(n1.prev);
        System.out.println("the head node and the previous node have its connection as the previous and next Node ");
}}