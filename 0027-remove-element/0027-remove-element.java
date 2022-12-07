class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int next_index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[next_index] = nums[i];
                next_index++;
                k++;
            }
        }
        return k;
    }
}