class Solution {
    public boolean isLongPressedName(String n, String t) {
       /*
        char a [] = name.toCharArray();
        char b [] = typed.toCharArray();
        char c [] = new char [name.length()];
        int i = 0;
        int j = 0;
        int k = 0;
        if(typed.length() < name.length()){
            return false;
        }
        while(i < name.length() && j < typed.length()){
            if(a[i] == b[j]){
                if(k < c.length){
                    c[k] = b[j];
                    j++; k++; i++;
                }
            }
            else{
                j++;
            }
        }
        // if(j < typed.length()  && i == name.length()-1){
        //     return false;
        // }
        // else if(j < typed.length() ||i < name.length()){
        //     return false;
        // }
        return new String(c).equals(name);
        */
        if(t.length() < n.length()){
            return false;
        }
        int i = 0, j = 0;
        while(i < n.length() && j < t.length()){
            int c1 = 0;
            int c2 = 0;
            while(j+1 < t.length() && t.charAt(j) == t.charAt(j+1)){
                j++;
                c2++;
            }
            while(i+1 < n.length() && n.charAt(i) == n.charAt(i+1)){
                i++;
                c1++;
            }
            if(c2 < c1){
                return false;
            }
            if(n.charAt(i) != t.charAt(j)){
                return false;
            }
            i++; j++;
        }
        if(i < n.length() || j < t.length()){
            return false;
        }
        else{
            return true;
        }
    }
}