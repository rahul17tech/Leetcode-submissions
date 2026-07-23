class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(char c: s.toCharArray()){
            if(st.isEmpty())
                st.push(c);
            else{
                if(st.peek()!=c)
                    st.push(c);
                else
                    st.pop();
            }
        }
        while(!st.isEmpty())
            str.append(st.pop());
        return str.reverse().toString();
    }
}