class MyLinkedList {
    Node start;
    class Node{
        int val;
        Node next;
        Node(int v){
            val=v;
            next=null;
        }
    }
    public MyLinkedList() {
        start=null;
    }
    
    public int get(int index) {
        Node ptr=start;
        if(index<0){
            return -1;
        }
        int count=0;
        while(ptr!=null){
            if(count++==index) return ptr.val;
            ptr=ptr.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=start;
        start=newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        Node ptr=start;
        if(start==null){
            start=newNode;
            return;
        }
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;

    }
    
    public void addAtIndex(int index, int val) {
        
        if(index<0) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        Node newNode=new Node(val); 
        Node ptr=start;
        for(int i=0;i<index-1 && ptr!=null;i++){
            ptr=ptr.next;
        }
        if(ptr==null){
            return;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
        Node ptr=start;
        if(start==null||index<0) return;
        if(index==0){
            start=start.next;
            return;
        }
        for(int i=0;i<index-1 && ptr!=null;i++){
            ptr=ptr.next;
        }
        if(ptr==null || ptr.next==null) return;
        ptr.next=ptr.next.next;
        
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