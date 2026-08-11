//public class Main {
//    public int firstUniqueCharacter(String text){
//        int[] frequency = new int[26];
//        for (int i=0;i<text.length();i++){
//            char ch = text.charAt(i);
//            frequency[ch-'a']++;
//        }
//        for (int i=0; i<text.length();i++){
//            char ch = text.charAt(i);
//            if(frequency[ch-'a']==1){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    static void main() {
//        String word = "AdityanujDwivedi";
//        Main obj = new Main();
//        int result = obj.firstUniqueCharacter(word);
//        System.out.println("First Unique Character Index: "+ result);
//    }
//}
