package leetcode_practice;

public class Repeating_Character_Replacement {
    static int ans(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int result = ans("ABAB", 2);
        int a='a'-'A';
        System.out.println(a);
        System.out.println(result);
       int []num=new int[5];
       for (int  a1=0;a1<num.length;a1++){
//           num[a1]++;
           System.out.println(num[a1]++);
       }
    }
}
