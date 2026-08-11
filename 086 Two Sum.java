//import java.util.HashMap;
//import java.util.Arrays;
//public class Solution {
//    public static int[] twoSum(String[] arr , int target){
//        HashMap<Integer , Integer>map = new HashMap<>();
//        for (int i=0; i< arr.length;i++){
//            int num = Integer.parseInt(arr[i]);
//            int remaining = target-num;
//            if (map.containsKey(remaining)){
//                return new int[] {map.get(remaining),i};
//            }
//            map.put(num,i);
//        }
//        return new int[0];
//    }
//
//    static void main() {
//        String[] numbers = {"1","2","7","11"};
//        int target = 9;
//        int [] result = twoSum(numbers,target);
//        if (result.length==0){
//            System.out.println("NO PAIR FOUND");
//        }else {
//            System.out.println("Indices: " + Arrays.toString(result));
//        }
//    }
//}
