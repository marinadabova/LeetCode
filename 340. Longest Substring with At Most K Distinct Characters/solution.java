class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();

        char[] arr = s.toCharArray();
        int i = 0, n = arr.length;
        int longestLen = 0;

        for (int j = 0; j < n; j++) {
            // Expand the window
            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);

            // Shrink the window if window size exceeds the k distinct characters
            while (k < mp.size()) {
                if (mp.get(arr[i]) == 1) {
                    mp.remove(arr[i]);
                } else {
                    mp.put(arr[i], mp.get(arr[i]) - 1);
                }
                i++;
            }
            longestLen = Math.max(longestLen, j - i + 1);
        }
        return longestLen;
    }
}
