//public class solutions {
//    public String longestCommonPrefix(String[] strs){
//        String p = strs[0];
//        for (int i=1; i<strs.length;i++){
//            while (strs[i].indexOf(p)!=0){
//                p=p.substring(0,p.length()-1);
//            }
//        }
//        return p;
//    }
//    static void main() {
//        Solution obj = new Solution();
//        String[] arr = {"flower" , "flow" , "flight"};
//        String result = obj.longestCommonPrefix(arr);
//        System.out.println("Longest Common Prefix:  "+ result);
//    }
//}
