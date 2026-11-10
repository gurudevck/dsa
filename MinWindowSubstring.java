//leetcode #76
class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        for (char ch : t.toCharArray()) need[ch]++;

        int missing = t.length();
        int left = 0;
        int bestStart = 0;
        int bestLength = Integer.MAX_VALUE;

        for(int right=0; right<s.length(); right++){
            char incoming = s.charAt(right);
            if(need[incoming]>0) missing--;
            need[incoming]--;

            while(missing == 0){
                if(right-left+1 < bestLength){
                    bestStart = left;
                    bestLength = right - left + 1;
                }

                char outgoing = s.charAt(left);
                need[outgoing]++;
                if(need[outgoing]>0) missing++;
                left++;
            }
        }
        return bestLength == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLength);
    }
}