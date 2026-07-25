//import java.util.*;                          // Line 1
//
//public class GroupAnagrams {                 // Line 2
//
//    public static void main(String[] args) { // Line 3
//
//        String[] strs = {"act","pots","tops","cat","stop","hat"}; // Line 4
//
//        Map<String, List<String>> map = new HashMap<>();          // Line 5
//
//        for (String s : strs) {              // Line 6
//
//            char[] chars = s.toCharArray();  // Line 7
//
//            Arrays.sort(chars);              // Line 8
//
//            String key = new String(chars);  // Line 9
//
//            if (!map.containsKey(key)) {     // Line 10
//                map.put(key, new ArrayList<>()); // Line 11
//            }
//
//            map.get(key).add(s);             // Line 12
//        }
//
//        List<List<String>> result = new ArrayList<>(map.values()); // Line 13
//
//        System.out.println(result);          // Line 14
//    }
//}