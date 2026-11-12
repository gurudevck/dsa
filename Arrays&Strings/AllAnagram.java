//leetcode #438
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) return result;

        int[] pCount = new int[26];
        int[] windowCount = new int[26];
        for(char ch : p.toCharArray()) pCount[ch - 'a']++;

        int windowSize = p.length();

        for(int right = 0; right < s.length(); right++){
            windowCount[s.charAt(right) - 'a']++;

            if(right>=windowSize) windowCount[s.charAt(right - windowSize) - 'a']--;

            if(Arrays.equals(pCount, windowCount)) result.add(right-windowSize+1);
        }
        return result;
    }
}