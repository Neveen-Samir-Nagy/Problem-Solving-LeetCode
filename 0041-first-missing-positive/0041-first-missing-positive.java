class Solution {
    public int firstMissingPositive(int[] nums) {
        int smallestNumber = 1;
        if(!Arrays.stream(nums).anyMatch(x -> x == 1)){
            return 1;
        }
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(nums[i] <= 0){
                continue;
            }else if(i == nums.length-1){
                smallestNumber = nums[i] + 1;
                return smallestNumber;
            }else{
                if(nums[i+1] - nums[i] > 1){
                    smallestNumber = nums[i] + 1;
                    return smallestNumber;
                }
            }
        }
        return smallestNumber;
    }
}