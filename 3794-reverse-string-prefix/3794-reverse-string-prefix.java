class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(i < k){
                s1.append(ch);
            }
            else{
                s2.append(ch);
            }
        }
        s1.reverse();
        s1.append(s2);
        return s1.toString();
    }
}