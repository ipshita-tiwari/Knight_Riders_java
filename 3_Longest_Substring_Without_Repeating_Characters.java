class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char ch = s.charAt(windowEnd); 
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            while(frequencyMap.size() != (windowEnd - windowStart + 1)) {
                char leftChar = s.charAt(windowStart);
                frequencyMap.put(leftChar, frequencyMap.get(leftChar) - 1);
                if(frequencyMap.get(leftChar) == 0) {
                    frequencyMap.remove(leftChar);
                }
                windowStart += 1;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
