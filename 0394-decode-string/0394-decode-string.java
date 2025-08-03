class Solution {
    public String decodeString(String s) {
        Stack<Integer> num_stack=new Stack<>();
        Stack<String> str_stack=new Stack<>();
        String tempstr="";
        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                num_stack.push(num);
                str_stack.push(tempstr);
                tempstr="";
                num=0;
            }
            else if(ch==']'){
                int i=num_stack.pop();
                String prev=str_stack.pop();
                StringBuilder str=new StringBuilder(prev);
                for(int j=0;j<i;j++){
                    str.append(tempstr);
                }
                tempstr=str.toString();
            }
            else{
                tempstr+=ch;
            }
        }
        return tempstr;
    }
}