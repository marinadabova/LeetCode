class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length - 1];
        for (int i = 0; i < Math.min(f.length(), l.length()); i++) {
            if (f.charAt(i) != l.charAt(i)) {
                return answer;
            }
            answer += f.charAt(i);
        }
        return answer;
    }
}
