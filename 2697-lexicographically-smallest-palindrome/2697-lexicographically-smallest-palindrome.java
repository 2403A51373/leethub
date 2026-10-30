class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            if (c[i] != c[j]) {
                if (c[i] < c[j]) {    c[j] = c[i];    }
                else {    c[i] = c[j];    }
            }
            i++;
            j--;
        }
        return new String(c);
    }
}
