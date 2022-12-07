class Solution {
    public int search(int[] nums, int target) {
        ArrayList<Integer> listNums = IntStream.of(nums)
                                   .boxed()
                                   .collect(Collectors.toCollection(ArrayList::new));
        return listNums.indexOf(target);
    }
}