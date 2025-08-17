import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
           int[] freq = new int[26];
           for (int i = 0; i < s.length(); i++) 
           freq[s.charAt(i) - 'a']++;
…    return new ArrayList<>(map.values());
   }
 }
