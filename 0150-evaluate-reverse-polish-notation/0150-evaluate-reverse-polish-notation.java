class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(token.matches("-?\\d+")){
                stack.push(Integer.parseInt(token));
            }
            else if(stack.size()>=2 && token.matches("[+\\-*/^]")){

                int n2=stack.pop();
                int n1=stack.pop();
                stack.push(Eval(n1,n2,token));
            }
        }
        return stack.peek();
    } 
    public int Eval(int n1,int n2,String token){
        switch(token){
            case "+":
            return n1+n2;
            case "-":
            return n1-n2;
            case "*":
            return n1*n2;
            case "/":
            return (int)n1/n2;
        }
        return 0;
    }
}