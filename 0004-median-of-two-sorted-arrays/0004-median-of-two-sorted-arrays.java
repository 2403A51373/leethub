
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int[] ma = new int[nums1.length + nums2.length];
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                ma[k] = nums1[i];
                i++;
            }
            else {
                ma[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {    ma[k++] = nums1[i++];    }
        while (j < nums2.length) {    ma[k++] = nums2[j++];   }
        int n = ma.length;
        if (n % 2 == 1) {    return ma[n / 2];    }
        else {    return ((double) ma[n / 2 - 1] + ma[n / 2]) / 2;    }
    }
}
