class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        List<List<Integer>> l = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < a.length - 2; i++) {
            int j = i + 1;
            int k = a.length - 1;
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            while (j < k ) {
                List<Integer> t = new ArrayList<>();
                s = a[i] + a[j] + a[k];
                if(s == 0){
                    t.add(a[i]);
                    t.add(a[j]);
                    t.add(a[k]);
                    l.add(t);
                    j++;
                    k--;
                    while (j < k && a[j] == a[j - 1]) {    j++;    }
                    while (j < k && a[k] == a[k + 1]) {    k--;    }
                }
                else if(s>0){    k--;    }
                else{    j++;    }
            }
        }
        return l;
    }
}