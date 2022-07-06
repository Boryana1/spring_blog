package JPMorgan;

import java.util.ArrayList;
import java.util.List;

public class MissingWords {
//    public static List<String> missingWords(String s, String t){
//        String[] sArray = s.split(" "); //the most words
//        String[] tArray = t.split(" "); // var tArray;
//        List<String> result = new ArrayList<>(); //var result = [];
//        int sIndex = 0;
//        for (int tIndex = 0; tIndex < tArray.length;) {
//            if(!tArray[tIndex].equals(sArray[sIndex])){
//                result.add(sArray[sIndex]);
//                sIndex++;
//            }else{
//                tIndex++;
//                sIndex++;
//            }
//        }
//        for (int i = sIndex; i < sArray.length; i++) {
//            result.add(sArray[i]);
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(missingWords("I like cheese too", "like"));
//    }
public static List<String> missingWords(String s, String t){
    String[] sArray = s.split(" "); //the most words
    String[] tArray = t.split(" "); // var tArray;
    List<String> result = new ArrayList<>(); //var result = [];
    int tIndex = 0;
    for (int sIndex = 0; sIndex < sArray.length; sIndex++) {
        if ((tIndex == tArray.length) || !tArray[tIndex].equals(sArray[sIndex])){
            result.add(sArray[sIndex]);
        }else{
            tIndex++;
        }
    }
    return result;
}

    public static void main(String[] args) {
        System.out.println(missingWords("I like cheese too", "like"));
    }
}

