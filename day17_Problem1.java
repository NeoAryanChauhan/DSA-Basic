class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> sd = new HashMap<>();
        Set<Character> usedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (!sd.containsKey(chS)) {
                if (usedChars.contains(chT)) return false;
                sd.put(chS, chT);
                usedChars.add(chT);
            } else if (sd.get(chS) != chT) {
                return false;
            }
        }
        
        return true;
    }
}

// TC : O(n)
// SC : O(1)