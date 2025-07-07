class MinStack {
    Node top;
    class Node{
        int data;
        int min;
        Node next;
        Node(int d,int m){
            min=m;
            data=d;
            next=null;
        }
    }
    public MinStack() {
        top=null;
    }
    
    public void push(int val) {
        Node newNode=new Node(val,val);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        newNode.min=Math.min(newNode.min,top.min);
        top=newNode;
    }
 
    public void pop() {
        top=top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */