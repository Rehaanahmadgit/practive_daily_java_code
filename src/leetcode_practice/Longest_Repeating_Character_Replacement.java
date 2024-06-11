package leetcode_practice;

public class Longest_Repeating_Character_Replacement {
    static int ans(String name,int k){
      int right=0;
      int max=0;
      for (int left=0;left<name.length();left++){
          while (left<right&&k!=0){
            if (!(name.charAt(left) ==name.charAt(right))){
                k--;
                right++;
                max=Math.max(max,left-right+1);
            }else {
              right++;
              max=Math.max(max,left-right+1);
            }
          }
          right=left;
      }

        return max;
    }
    public static void main(String[] args) {
      int as=  ans("abab",2);
        System.out.println(as);
    }
}
