package firstFive;

import java.util.HashMap;
import java.util.Map;

public class One {
    private static String word = "commmmuniity";

    public static void main(String[] args) {
        //How to find the maximum occurring character in a given String
        //maxiNum(word);
        System.out.println(maxiNum(word));

    }

    public static int maxiNum(String num){
       Map<Character, Integer> test = new HashMap<>();
       char[] test1 = word.toCharArray();
        for(char t : test1){
            if(test.containsKey(t)){
                test.put(t,test.get(t)+1);
            }else{
                test.put(t, 1);
            }
        }
        System.out.println(test);
        return 0;
    }


}
