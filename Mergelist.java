class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    
class Merge {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode cur=new ListNode();
    ListNode Head=cur;
    while(list1!=null && list2!=null){
        if(list1.val>list2.val){
            cur.next=list2;
            list2=list2.next;
        }
        else{
            cur.next=list1;
            list1=list1.next;
        }
        cur=cur.next;
    }
    if(list1!=null){
        cur.next=list1;
    }
    else{
        cur.next=list2;
    }
    return Head.next;
    }
}

class Mergelist{
    public static void main(String[] args) {
    ListNode list1=new ListNode(1);
    list1.next=new ListNode(2);
    list1.next.next=new ListNode(4);
    
    ListNode list2=new ListNode(1);
    list2.next=new ListNode(3);
    list2.next.next=new ListNode(4);
    
    Merge list=new Merge();
    ListNode listprev;
    listprev=list.mergeTwoLists(list1,list2);
    while (listprev!=null){
    System.out.println(listprev.val); 
    listprev=listprev.next;
}   
    }
    //Here i have created a linked list and then passed two list with their respective values in sorted order and then i have done merging in that and displayed the output 
}