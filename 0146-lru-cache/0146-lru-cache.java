class LRUCache {
    Node start;
    class Node{
        int key, val;
        Node next,prev;
        Node(int k,int v){
            key=k;
            val=v;
            next=null;
            prev=null;
        }
    }
    Node head=null,tail=null;//global
    HashMap<Integer,Node> map=new HashMap<>();
    int capacity=0;  //global capacity

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(-1,-1); //Initialize head with dummy key,value
        tail=new Node(-1,-1); //Initialize tail with dummy key,value
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node KeyNode=map.get(key);
        delete(KeyNode);
        add(KeyNode);
        return KeyNode.val; //return value
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node rem=map.get(key);
            delete(rem);
            map.remove(key);
        }
        if(map.size()==capacity){
            Node lru=tail.prev;
            delete(lru);
            map.remove(lru.key);
        }
            Node newNode=new Node(key,value);
            add(newNode);
            map.put(key,newNode); 
    }

    public void add(Node newNode){
            newNode.next=head.next;
            newNode.prev=head;
            head.next.prev=newNode;
            head.next=newNode;
    }
    public void delete(Node delnode){
        delnode.prev.next=delnode.next;
        delnode.next.prev=delnode.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */