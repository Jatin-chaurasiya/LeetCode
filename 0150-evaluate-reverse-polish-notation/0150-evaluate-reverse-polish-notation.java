class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int a,b;
        for(String num : tokens){
            if(num.equals("+") || num.equals("-") || num.equals("*") || num.equals("/")){
                a = st.pop();
                b = st.pop();
                if(num.equals("+")) st.push(a + b);
                else if(num.equals("-")) st.push(b-a);
                else if(num.equals("*")) st.push(a*b);
                else st.push(b/a);
            }else{
                st.push(Integer.parseInt(num));
            }
        }
        return st.pop();
    }
}