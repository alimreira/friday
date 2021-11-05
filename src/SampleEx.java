public class SampleEx {

    public static void main(String[] args) {
        String str = null;
       // int STR1 = str.length();
        int a = 10;
//        for(int i = -3; i < 5; i++){
////            int b = 10/i;
//            System.out.println(b);
//        }
     //   System.out.println("I reached here");

        int b=0;
        int i =0;
//        try{
//            int STR1 = str.length();
//        }catch (NullPointerException e){
//            System.out.println("Continue to run program");
//        }
        try{
            for( i = -3; i < 5; i++){
           b = 10/i;
                System.out.println(b);
                //System.out.println("Exception occured at :" + i);
            }
        }catch(ArithmeticException e1){
            System.out.println(b);
           System.out.println("Exception occured at :" + i);
        }

    }
}
