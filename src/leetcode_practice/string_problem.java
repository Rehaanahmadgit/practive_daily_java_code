package leetcode_practice;

public class string_problem {
    static int str(String name){

        int max=0;
        int a=1; // Move initialization outside the loop
        for (int i=1;i<name.length();i++){
            if(name.charAt(i)==name.charAt(i-1)){
                ++a;
            } else {
                // If the character changes, reset a to 1
                a = 1;
            }
            max=Math.max(max,a);
        }
        return max;
    }
    public static void main(String[] args) {
        String name ="abbcccddddeeeeedcba";
        int ans= str(name);
        System.out.println(ans);
    }
}
