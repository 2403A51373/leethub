class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        String v = "aeiouAEIOU";
        while (i < j) {
            if(v.indexOf(a[i]) == -1) {    i++;  continue;  }
            if(v.indexOf(a[j]) == -1){    j--; continue;   }
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return new String(a);
    }
    
}