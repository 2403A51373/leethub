 class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st = new StringBuilder(); 
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' ) { 
                c++;
                if(c > 1){
                    st.append(ch);
                }
            } 
            else if(ch == ')' ){    
                c--; 
                if(c>0){
                    st.append(ch);
                }
            }
        }

        return st.toString();
    }
}