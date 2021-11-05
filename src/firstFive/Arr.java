package firstFive;

import java.util.*;

public class Arr {
    private static Integer[] array = {11, 11, 12, 13, 34, 23, 45, 34, 56, 67, 56};
    private static Integer[] array1 = {11, 11, 10, 13, 34, 23, 45, 34, 56, 67, 56};
    private static Integer[] array3 = {11, 1,  13, 34, 45, 34,  67, 56};
    private static int[] array2 = {9, 11, 12, 10, 34, 23, 10, 34, 56, 67, 56};

    public static void main(String[] args) {
        System.out.println(duplicate(array));
        System.out.println(contain(array1));
        System.out.println(unsorted(array2));
        System.out.println(pairs(array2));
        System.out.println(duplicates(array));
        System.out.println(intersection(array1, array3));
    }

    //How to find the missing number in integer array of 1 to 100
    public static int missing(int[] arr) {


        return 0;
    }

    //How to find duplicate number on Integer array in Java
    public static Set<Integer> duplicate(Integer[] arr) {
        int hold = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            set.add(arr[i]);
        }
        return set;
    }

    //How to check if array contains a number in Java
    public static boolean contain(Integer[] arr) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        for (int i = 0; i < list.size(); ++i) {
            if (list.contains(10)) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    //How to find largest and smallest number in unsorted array
    public static int unsorted(int[] arr){
        int largestNum = 0;
        int smallestNum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; ++i){
            if(arr[i] > largestNum){
                largestNum = arr[i];
                return largestNum;
            }else if(arr[i] < smallestNum){
                smallestNum = arr[i];
                return smallestNum;
            }
        }
        return 0;
    }

    //How to find all pairs on integer array whose sum is equal to given number
    public static boolean pairs(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; ++i){
            for(int j = i +1; j< arr.length; ++j){
                if(arr[i] + arr[j] == 20){
                    count += 1;
                    System.out.println(count);
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

//    //How to find repeated numbers in an array if it contains multiple duplicates
//    public static Map<Integer,Integer> repeated(Integer[] arr){
//        Map<Integer,Integer> hold = new HashMap<Integer,Integer>();
//        for(int i =0; i<arr.length; ++i){
//            hold.put(arr[i], hold.get(arr[i]) + 1);
//        }
//            return hold;
//    }

// How to remove duplicates from an integer array
   public static Set<Integer> duplicates(Integer[] arr){
        Set<Integer> hold = new HashSet<>(Arrays.asList(arr));
        for(int i =0; i<arr.length; ++i){
            hold.add(arr[i]);

        }
            return hold;
    }

   // Write a program to find intersection of two sorted arrays in Java?
   public static List<Integer> intersection(Integer[] arr, Integer[] arr1){
        List<Integer> inn = new ArrayList<>();
       for(int i =0; i<arr.length; ++i){
           for(int j =0; j<arr1.length; ++j){
               if(arr[i].compareTo(arr1[j])==0){
                   inn.add(arr1[j]);
                   break;
               }
           }
       }
       return inn;
   }
}
