//public class Main {
//    public static int value(char c){
//        if (c=='I')return 1;
//        if (c=='V')return 2;
//        if (c=='X')return 10;
//        if (c=='L')return 50;
//        if (c=='C')return 100;
//        if (c=='D')return 500;
//        if (c=='M')return 100;
//        return 0;
//    }
//
//    public static int romanToInt(String s){
//        int total = 0;
//        for (int i=0;i<s.length();i++){
//            int current = value(s.charAt(i));
//            if (i<s.length()-1 && current<value(s.charAt(i+1))){
//                total-=current;
//            }else {
//                total+=current;
//            }
//        }
//        return total;
//    }
//
//    static void main() {
//        String roman = "MCMXCIV";
//        int result = romanToInt(roman);
//        System.out.println("Integer value: "+ result);
//    }
//}
