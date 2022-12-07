class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mixed = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mixed, 0, nums1.length);
        System.arraycopy(nums2, 0, mixed, nums1.length, nums2.length);
        double median;
        Arrays.sort(mixed);
        if(mixed.length % 2 == 0){
            median = (Double.valueOf(mixed[mixed.length / 2 - 1]) + Double.valueOf(mixed[mixed.length / 2])) / 2;
        }else {
            median = (mixed[mixed.length / 2]);
        } 
        return median;
    }
}