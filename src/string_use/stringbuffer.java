package string_use;
import java.util.*;
public class stringbuffer {
    public static void main(String[] args) {
    StringBuffer sb= new StringBuffer("rehaan");
   sb.append("ahamd");
        System.out.println(sb);
        sb.insert(3,"xxxx");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(3,7,"yaya");
        System.out.println(sb);
        System.out.println(sb.capacity());
}}
