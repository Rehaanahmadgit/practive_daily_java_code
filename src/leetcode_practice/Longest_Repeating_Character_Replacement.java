package leetcode_practice;

public class Longest_Repeating_Character_Replacement {
    static int ans(String name,int k){
        int left=0;
        int k1=k;
        int max=0;
       char[]ch=name.toCharArray();
        for (int rigth=0;rigth<name.length();rigth++){
            if (ch[left]!=ch[rigth]){
               k1--;
               max=Math.max(max,left-rigth+1);
               if (k1==0){
                   k1=k;
                   left++;
               }
            }else {

                max=Math.max(max,left-rigth+1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
      int as=  ans("abab",2);
        System.out.println(as);
    }
}
