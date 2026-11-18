//leetcode #387
import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> firstIndex = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(firstIndex.containsKey(ch)) firstIndex.put(ch, -1);
            else firstIndex.put(ch, i);
        }

        for(int index : firstIndex.values()){
            if(index != -1) return index;
        }
        return -1;
    }
}