class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()>1){
            q2.add(q1.poll());
        }

        int top = q1.poll();
        swapQueues();
        return top;
    }
    
    public int top() {
        while(q1.size() > 1){
            q2.add(q1.poll());
        }

        int top = q1.peek();
        q2.add(q1.poll());
        swapQueues();
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }

    private void swapQueues(){
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */