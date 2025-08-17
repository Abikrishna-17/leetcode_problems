class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next=null;
    }
}


class MyLinkedList {

    
    public MyLinkedList() {

    }

    Node head = null;
    Node tail = null;
    int size=0;
    public int get(int index) {
        Node temp = head;

        int i=0;
        while(temp != null && i<index){
            temp=temp.next;
            i++;
        }

        return (temp==null)? -1:temp.val;
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        if(head == null){
            tail = head = newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    
    public void addAtTail(int val) {

        Node newnode = new Node(val);
          if( head == null){
            
           head = tail = newnode;
            return;
          }
        
        tail.next = newnode;
        tail=newnode;
     
    }
    
    public void addAtIndex(int index, int val) {
         if (index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        int i=0;
        while(temp != null && i<index-1){
            temp=temp.next;
            i++;
        }
         if (temp == null) return;
        Node newnode = new Node(val);
        newnode.next=temp.next;
        temp.next=newnode;
        if (newnode.next == null) tail = newnode;
    }
    
    public void deleteAtIndex(int index) {
        
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null; 
            size--;
            return;
        }
        Node temp = head;
        int i = 0;
        while (temp.next != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp.next == null) return; 
        temp.next = temp.next.next;
        if (temp.next == null) tail = temp; 
        size--;
    }

    }


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
