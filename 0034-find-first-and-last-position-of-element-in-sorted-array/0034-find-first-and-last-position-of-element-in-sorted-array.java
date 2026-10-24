class Solution {
    public int[] searchRange(int[] nums, int t) {
        int s = 0;
        int e = nums.length-1;
        int a [] = new int [2];
        int a1 = -1;
        int a2 = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m] == t){       
                e = m - 1;
                a1 = m;
            }
            else if(nums[m] < t){ s = m + 1; }
            else{    e = m - 1;    }
        }
        s = 0;
        e = nums.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m] == t){       
                s = m + 1;
                a2 = m;   
            }
            else if(nums[m] < t){      s = m + 1;    }
            else{  e = m - 1;     }
        }
        a[0] = a1;
        a[1] = a2;
        return a;
        
    }
}