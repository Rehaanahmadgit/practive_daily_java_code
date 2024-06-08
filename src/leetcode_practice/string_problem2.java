package leetcode_practice;

import java.util.Arrays;

public class string_problem2 {
    static boolean quws1(String s, String t) {
        // If the lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        // Sort the character arrays

        Arrays.sort(ch1);
        Arrays.sort(ch2); for (char a:ch2){
            System.out.println(a);
        }

        // Compare the sorted arrays
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        boolean ans = quws1("anagram", "nagaram");
        System.out.println(ans); // This will print true because the strings are anagrams
    }
}
