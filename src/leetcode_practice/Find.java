package leetcode_practice;

public class Find {
  static   int chae(String first,String sec) {
      if (first.length() < sec.length()) {
          return -1;
      }
      for (int a = 0; a <= first.length() - sec.length(); a++) {
          if (first.substring(a, a + sec.length()).equals(sec)) {
              return a;
          }
      }
      return -1;
  }
    public static void main(String[] args) {
     int ans=chae("rehaan","reh");
        System.out.println(ans);
    }
}
