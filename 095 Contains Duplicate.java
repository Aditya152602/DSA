//import java.util.*;
//
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> seen = new HashSet<>();
//        for (int n : nums) {
//            if (!seen.add(n)) return true;
//        }
//        return false;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter size: ");
//        int n = sc.nextInt();
//
//        int[] nums = new int[n];
//        System.out.print("Enter elements: ");
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//
//        Solution sol = new Solution();
//        System.out.println(sol.containsDuplicate(nums));
//    }
//}