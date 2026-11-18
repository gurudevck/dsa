//leetcode #350
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for(int num : nums1){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for(int num : nums2){
            int available = counts.getOrDefault(num, 0);
            if(available > 0){
                result.add(num);
                counts.put(num, available - 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}