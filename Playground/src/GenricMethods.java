import java.util.*;
public class GenricMethods {
    public static void main(String args[]){

        Integer[] iray = {1,2,3,4};
        Character[] cray = {'b','u','c','y'};
        printMe(iray);
        printMe(cray);
    }
    //Overloading methods not good
//    private static void printMe(Integer[] i) {
//        for (Integer x : i) {
//            System.out.printf("%s ", x);
//            System.out.println();
//        }
//            }
//    private static void printMe(Character[] i){
//        for (Character x : i) {
//            System.out.printf("%s ", x);
//            System.out.println();
//
//        }

        //generic method
    public static <T> void printMe(T[] x){
        for(T b : x){
            System.out.printf("%s ",b);
            System.out.println();
        }
    }
    }
