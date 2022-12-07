class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int next_index = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[next_index] = nums[i];
                next_index++;
                k++;
            }
        }
        System.out.println(k);
        return k;
    }
}