//public class Main {
//    public String countAndSay(int n){
//        String s = "1";
//        for (int i=1;i<n;i++){
//            StringBuilder sb = new StringBuilder();
//            int count = 1;
//            for (int j=1;j<=s.length();j++){
//                if (j<s.length() && s.charAt(j)==s.charAt(j-1)){
//                    count++;
//                }else {
//                    sb.append(count).append(s.charAt(j-1));
//                    count = 1;
//                }
//            }
//            s = sb.toString();
//        }
//        return s;
//    }
//
//    static void main() {
//        Main obj = new Main();
//        int n = 5;
//        String result = obj.countAndSay(n);
//        System.out.println("Count And Say result: "+result);
//    }
//}
