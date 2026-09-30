//leetcode #26
class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();
        for (int num : nums) {
            seen.add(num);
        }

        int i = 0;
        for (int val : seen) {
            nums[i++] = val; ß
        }
        return seen.size();
    }
}