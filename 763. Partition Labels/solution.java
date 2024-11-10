class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, i);
        }
        List<Integer> ans = new ArrayList<>();
        int start = 0, end = 0; // end is lastAppearanceIndex
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            end = Math.max(end, mp.get(ch));

            if (end == i) {
                ans.add(end - start + 1);
                end++;
                start = end;
            }
        }
        return ans;
    }
}


//

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int[] lastPos = new int[26];
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            lastPos[arr[i] - 'a'] = i;
        }
        int start = 0;
        int end = lastPos[arr[start] - 'a'];
        for (int i = 1; i < arr.length; i++) {
            if (i > end) {
                ans.add(i - start);
                start = i;
            }
            end = Math.max(end, lastPos[arr[i] - 'a']);
        }
        ans.add(arr.length - start);

        return ans;
    }
}
