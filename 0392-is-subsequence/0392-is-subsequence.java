class Solution {
    public boolean isSubsequence(String s, String t) {
        char a [] = s.toCharArray();
        char b [] = t.toCharArray();
        int i = 0 , j = 0, c = 0;
        while(i < s.length() && j < t.length()){
            if(a[i] == b [j]){
                i++;
                j++;
                c++;
            }
            else{
                j++;
            }
        }
        if(c == s.length()){
            return true;
        }
        else{
            return false;
        }

        /*
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i) == t.charAt(j)){ i++; }
            j++;
        }
        return (i==s.length());
        
        char[] f = new char[s.length()];
        int k = 0;
        int st = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = st; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    f[k] = t.charAt(j);
                    st = j + 1;
                    found = true;
                    break;
                }
            }
            if (!found) {  return false; }
            k++;
        }

        String str = String.valueOf(f);
        return str.equals(s);
        */
    }
}