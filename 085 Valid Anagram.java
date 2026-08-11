//import java.util.Arrays;
//public class Solution {
//    public boolean isAnagram(String s, String t){
//        if(s.length()!=t.length())
//            return false;
//        char[] a= s.toCharArray();
//        char[] b= t.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        return Arrays.equals(a,b);
//    }
//
//    static void main() {
//        Solution obj = new Solution();
//        boolean result1 = obj.isAnagram("listen","silent");
//        System.out.println("listen & silent = " + result1);
//        boolean result2 = obj.isAnagram("rat","car");
//        System.out.println("rat  & car = " + result2);
//    }
//
//
//}