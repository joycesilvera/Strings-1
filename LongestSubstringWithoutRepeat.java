import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;

        int l = 0, r = 0;

        while (r < s.length()) {
            char toAdd = s.charAt(r);

            if (set.contains(toAdd)) {
                while (s.charAt(l) != toAdd) {
                    set.remove(s.charAt(l));
                    l++;
                }
                l++; // here we are escaping it
            }
            set.add(toAdd);
            r++;

            maxLen = Math.max(maxLen, r - l);

        }

        return maxLen;
    }
}