class Solution {
    public int clumsy(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n);
        int i=0,curr=n-1;
        
        while(curr>0){
            if(i==0){   //multiplication
                int num = st.pop();
                st.push(num*curr);
                curr--;
                i++;
            }
            else if(i==1){ //division
                int num = st.pop();
                st.push(num/curr);
                curr--;
                i++;
            }
            else if(i==2){ //addition
                st.push(curr);
                curr--;
                i++;
            }
            else{  //subtraction
                st.push(-curr);
                curr--;
                i=0;
            }
        }
        
        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}