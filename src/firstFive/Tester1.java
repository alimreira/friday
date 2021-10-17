package firstFive;

import java.util.*;

public class Tester1 {
private static String song = "worrshipppers";
    private static String song1 = "raining";
    private static String song2 = "gniniar";
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

}
