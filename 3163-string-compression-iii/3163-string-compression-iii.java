class Solution {
    public String compressedString(String ch) {
        int c = 0;
        int i = 0;
        int j = 0;
        String s = "";
        while(j< ch.length()){
            if(ch.charAt(i) == ch.charAt(j) && c != 9){   c++;    j++;    }
            else{
                s +=  ""  + c + ch.charAt(i);
                c = 0;
                i=j;             
            }
        }
        s += "" + c + ch.charAt(i);
        return s;
    }
}