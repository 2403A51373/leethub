class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class MyLinkedList {
    Node head;
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index >= size){ return -1;}
        if(index == 0){ return head.data;}
        Node temp = head;
        for(int i = 0 ; i < index ; i++ ){
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val){
        size++;
        Node n = new Node(val);
        if(head == null){ head = n; return;}
        else{
            n.next = head;
            head = n;
            return;
        }
    }
    
    public void addAtTail(int val) {
        size++;
        Node n = new Node(val);
        if(head == null){
            head = n;
            return;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
            return;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){ addAtHead(val);  return; }
        if(index == size){ addAtTail(val); return; }
        if(index > size){ return; }
        index = index - 1;
        Node temp = head;
        size++;
        Node n = new Node(val);
        while(index>0){
            index--;
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
        return;

    }
    
    public void deleteAtIndex(int index) {
        if(index >= size){ return; }
        if(head == null){ return;}
        if(index == 0){ head = head.next; size--; return;} 
        index = index - 1;
        Node temp = head;
        while(index > 0){
            index--;
            temp = temp.next;
        }
        size--;
        temp.next = temp.next.next;
        return;
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