package firstFive;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Tester1 {
private static String song = "worrshipppers";
    private static String song1 = "raining";
    private static String song2 = "gniniar";
    public static String  str1 = "Every day is a new opportunity";
    public static int  count = 34;
    private static String palin = "nun";
    private static String rem = "programmmming";
    private static String rem1 = "JAVA";

    public static void main(String[] args) {
        Map<Character,Integer> ONE = test(song);
        System.out.println(ONE);

        System.out.println(test1(song));

        System.out.println(song.length());

        System.out.println(dup(song));

        System.out.println(rem(song, song1));

        System.out.println(rotate(song1,song2));

        System.out.println(time(song1));

        System.out.println(buffer(song));

        System.out.println(repeat(song));

        System.out.println(words(str1));

        boolean test = anagram(song1, song2);
        boolean test1 = anagram(song1, song);
        System.out.println(test);
        System.out.println(test1);

        boolean holder = palindrome(song1);
        System.out.println(holder);

        //System.out.println(convert(song1));

        System.out.println(convert1(count));

        System.out.println(palindrome(palin));

        System.out.println(remove(rem));

        System.out.println(remove1(rem));

        System.out.println(remove2(rem1));

        System.out.println(count(rem));


//        Map<Integer,Integer> map1 = new HashMap<>();
//        map1.put(10,1);
//        map1.put(12,2);
//        map1.put(10,3);
//        map1.put(13,4);
//        map1.put(14,14);
//        System.out.println(map1.get(10));



    }

    public static Map<Character,Integer> test(String item){

        Map<Character,Integer> px = new HashMap<>();
        char[] xp = song.toCharArray();
        for(char x: xp){
            if(px.containsKey(x)){
                px.put(x,px.get(x) +1);
            }else{
                px.put(x,1);
            }
        }
        return px;
    }

    public static List<char[]> test1(String item1){
       // Character[] hold = item1.toCharArray();
        System.out.println(item1.split(""));
        System.out.println(Arrays.toString(item1.split("")));
//        List<String> hold1 = new ArrayList<String>(Arrays.asList(item1.split("")));
//        int e = hold1.size();
//        System.out.println(e);
//        return null;
        String [] a = item1.split("");
//        Set<String> hold1 = new HashSet<String>(Arrays.asList(item1.split("")));
        Set<String> hold1 = new HashSet<String>(Arrays.asList(a));
        System.out.println(hold1.size());

        // System.out.println(Arrays.toString(hold));
       int t =  hold1.size();
        System.out.println(t);
      return null;
   }

    //How to print the duplicate characters from the given String?
    public static Map<Character,Integer> dup(String one){
        char[] xx = one.toCharArray();
        Map<Character, Integer> dup1 = new HashMap<>();
        for(char x : xx ){
            if(dup1.containsKey(x)){
                System.out.println(x);
                //dup1.put(x, dup1.get(x) + 1);
            }else{
                dup1.put(x, 1);
            }
        }
return dup1;
    }


    public static String rem(String one, String two){
//        String[] hold = one.split("");
//        String[] hold1 = two.split("");
//        for(int i =0; i< hold.length; i++){
//            for(int j =0; j<hold1.length; i++){
//                if(hold[i] == hold1[j]){
//
//                }         //woshippers
//            }
//        }
        StringBuffer sb = new StringBuffer(one); //bcus I wan to delete from the string and our String class doesnt have delete
        for(int i = 0; i < two.length(); i++){ //this is to  loop thru two
            for(int j = 0; j < sb.length(); j++){// this is to loop thru one which is now my stringbuffer sb
                String first = ""+two.charAt(i);
                String second = ""+sb.charAt(j);
                if(first.equals(second)){
                    sb.deleteCharAt(j);     // to delete from a Stringbuffer
                    j = -1; //to reset the inner(j) for loop or enable the inner for loop begin from the index 0
                }
            }
        }


        return new String(sb); // to convert our stringbuffer to a String
    }

    public static boolean rotate(String one, String two){
        StringBuffer obj = new StringBuffer(one);
        StringBuffer obj1 = new StringBuffer(two);
        //System.out.println(obj.reverse());
        obj.reverse();
       if(obj.compareTo(obj1) == 0){
           return true;
       }else{
           return false;
       }

    }

    //reverse a String
    public static String time(String one){
        String hold = "";
        char[] test = one.toCharArray();
        for(int i = test.length-1; i >= 0; i--){
            hold += test[i];
        }
        return hold;
    }

    //reverse a String with String buffer
    public static String buffer(String one){
        StringBuffer obj = new StringBuffer(one);
        obj.reverse();
        return new String(obj);
//        return new String(new StringBuffer(one).reverse());
    }

    //First non-repeating character in a String
    public static Map<Character,Integer> repeat(String first) {
        char hold = '\u0000';
        Map<Character, Integer> test1 = new HashMap<>();
    for(int i =0; i < first.length(); ++i){
            hold = first.charAt(i);
            if(test1.containsKey(hold)){
                test1.put(hold, test1.get(hold) + 1);
            }else{
                test1.put(hold, 1);
                //System.out.println(holder1);
            }
        }
       return test1;
    }

    //Reverse the words in a given String
    public static String words(String str){
        String[] arr = str.split(" ");
        String hold = " ";
        for(int i = arr.length-1; i>= 0; --i){
            hold +=  arr[i] + " ";
        }
        return hold;
    }

    //Checking if 2 Strings are anagram of each other
    public static boolean anagram(String one, String two){
        char[] on = one.toCharArray();
        char[] tw = two.toCharArray();
        Arrays.sort(on);
        Arrays.sort(tw);

        for(int i=0; i < on.length; ++i){
            for(int j = 0; j < tw.length; ++j){
                if(on[i]==tw[j]){

                    return true;
                }else {
                    return false;
                }
            }
        }
            return false;
    }

    //Palindrome in java
    public static boolean palindrome(String one){
        StringBuffer test = new StringBuffer(one);
        StringBuffer hold = test.reverse();
        StringBuffer hold1 = new StringBuffer(one);
        if(hold.compareTo(hold1) == 0){
            return true;
        }else {
            return false;
        }
    }
//    public static boolean palindrome(String two){
//       char[] tr = one.toCharArray();
//        char[] rt = two.toCharArray();
//        List<char[]> one1 = new ArrayList<char[]>(Arrays.asList(tr));
//        List<char[]> one2 = new ArrayList<char[]>(Arrays.asList(rt));
//        for(char[] c: one1){
//            if(one2.contains(c)){
//                return true;
//            }else{
//                return false;
//            }
//        }
//        return false;
//    }

    //Converting a String to an Integer
    public static int convert(String one){
        int hold = Integer.parseInt(one);
    return hold;
    }

    //Converting an int to a String
    public static String convert1(int one){
        String hold = " " + one;
        return hold;
    }

    //How do you remove a given character from String
    public static String remove(String word){
        String hold = word.replace("m", "");
        return hold;
    }

    //How do you remove a given character from String 1
    public static String remove1(String word){
        String hold = word.replace("m", "x");
        return hold;
    }

    //How do you remove a given character from String 2
    public static String remove2(String word){
        String hold = word.replaceAll("JAVA", "Scala");
        return hold;
    }

    //How do you count the number of words in String
    public static int count(String word){
        int dis = word.length();
        return dis;
    }





}
