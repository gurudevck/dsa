//leetcode #454
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> pairSums = new HashMap<>();
        for(int a : nums1){
            for(int b : nums2){
                int sum = a + b;
                pairSums.put(sum, pairSums.getOrDefault(sum, 0)+1);
            }
        }

        int count = 0;
        for(int c : nums3){
            for(int d : nums4){
                int needed = -(c+d);
                count += pairSums.getOrDefault(needed, 0);
            }
        }
        return count;
    }
}