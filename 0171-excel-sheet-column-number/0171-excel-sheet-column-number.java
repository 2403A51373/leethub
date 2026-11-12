class Solution {
    public int titleToNumber(String s) {
        char[] a = s.toCharArray();
        int ans = 0;

        for (int i = 0; i < a.length; i++) {
            int j = a[i] - 'A' + 1;;
            ans = ans * 26 + j;
        }

        return ans;
    }
}