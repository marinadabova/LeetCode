class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> mp1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            mp1.put(ch, mp1.getOrDefault(ch, 0) + 1);
        }
      
        Map<Character, Integer> mp2 = new HashMap<>();
        int windowSize = s1.length();
        for (int i = 0; i < windowSize; i++) {
            char ch = s2.charAt(i);
            mp2.put(ch, mp2.getOrDefault(ch, 0) + 1);
        }
      
        if (mp1.equals(mp2)) {
            return true;
        }
      
        for (int i = windowSize; i < s2.length(); i++) {
            char newCh = s2.charAt(i);// d
            char oldCh = s2.charAt(i - windowSize);//e
            mp2.put(newCh, mp2.getOrDefault(newCh, 0) + 1);
            mp2.put(oldCh, mp2.get(oldCh) - 1);
            if (mp2.get(oldCh) == 0) {
                mp2.remove(oldCh);
            }
            if (mp1.equals(mp2)) {
                return true;
            }
        }
        return false;

    }
}
