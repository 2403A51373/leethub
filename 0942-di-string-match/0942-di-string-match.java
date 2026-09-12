class Solution {
    public int[] diStringMatch(String s) {
        char a [] = s.toCharArray();
        int b [] = new int[s.length()+1];
        int i = 0;
        int j = s.length()-1;
        int k = 0;
        while(k < a.length){
            if(a[k] == 'I'){
                b[k] = i;
                i++;
                k++;
            }
            else if(a[k] == 'D'){
                b[k] = j+1;
                j--;
                k++;
            }
            
        }
        b[k] = i;
        return b;
    }
}