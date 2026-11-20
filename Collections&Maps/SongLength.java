//leetcode #1010
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainderCount = new int[60];
        int count = 0;

        for (int t : time){
            int remainder = t%60;
            int comp = (60-remainder)%60;

            count+=remainderCount[comp];
            remainderCount[remainder]++;
        }
        return count;
    }
}