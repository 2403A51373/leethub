class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        String sh = "";
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sh = st.peek() + sh;
            st.pop();
        }
        return sh;
    }
}