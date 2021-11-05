package firstFive;

public class Except {

    public static void main(String[] args) {
       // String str = null;
        //int hold = str.length();
        //System.out.println(hold);

        int count = 10;
        int divide =0;
        for(int i=-2; i<=4; ++i){
            divide = 6/i;
            System.out.println(i);
        }

        try{
            String str = null;
            int hold = str.length();
        }catch(NullPointerException e){
            System.out.println("Does not return a nullpointer exception");
        }
    }
}
