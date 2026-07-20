class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{')
                st.push(ch);
            else if(!st.isEmpty() && ((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')))
                    st.pop();
                
            
            else
                    st.push(ch);
        }
        if(st.isEmpty())
            return true;
        else 
            return false;
    }
}