public class SimpleList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next =null;
        }
    }
    public void searchList(int t){
        Node k=head;
        while(k.next!=null){
            if(k.data==t)
                System.out.printf("element found at: %s\n",k);
            k=k.next;
        }
    }
    public void deleteNode(Node n){
        Node k= head;
        System.out.printf("deleting node with data : %d \n",n.data);
        while(k.next!=null){
            if(k.next==n){
                k.next=n.next;
            }
            k=k.next;
        }
    }
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " \n");
            n = n.next;
        }
    }
    public static void main(String args[]){
        int n,t=21;
        SimpleList list=new SimpleList();
        list.head= new Node(32);
        Node second = new Node(43);
        Node third = new Node(21);
        Node fourth = new Node(24);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        list.printList();
        list.searchList(t);
        list.deleteNode(third);
        list.printList();
    }
}
