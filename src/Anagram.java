import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (map.containsKey(c1)) {
                map.put(c1, map.get(c1) + 1);

            } else {
                map.put(c1, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c1 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) == 1) {
                    map.remove(c1);
                }
                else {
                    map.put(c1, map.get(c1) - 1);
                }

            }
        }

        if (map.size() > 0) {
            return false;
        }

        return true;
    }
}
