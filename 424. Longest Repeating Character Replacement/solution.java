class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int maxLen = 0;
        Map<Character, Integer> mp = new HashMap<>();

        int i = 0;
        int mostFrequent = 0;
        for (int j = 0; j < n; j++) {
            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);
            mostFrequent = Math.max(mostFrequent, mp.get(arr[j]));
            // Shrink the window if we need to replace more than k char
            if ((j - i + 1) - mostFrequent > k) {
                mp.put(arr[i], mp.get(arr[i]) - 1);
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}
