package leetcode_practice;

import java.util.HashSet;
import java.util.Set;

public class without_repeated_chara {
    static int ans(String a){
        Set<Character> list = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < a.length(); right++) {
            if (list.add(a.charAt(right))) {
                max = Math.max(max, right - left + 1);
            } else {
                while (a.charAt(left) != a.charAt(right)) {
                    list.remove(a.charAt(left));
                    left++;
                }
                left++;  // Move left past the duplicate character
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a = ans("auubs");
        System.out.println(a);
    }
}
