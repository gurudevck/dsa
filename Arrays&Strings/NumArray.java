//leetcode #303
class NumArray {
    int[] sum;

    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        sum = nums;
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return sum[right];
        return sum[right]-sum[left-1];
    }
}