import java.util.*;
public class GenricReturnTypes {
    public static void main(String args[]){


        System.out.println(max(99,12,1248));
        System.out.println(max("Apples","tots","lightsabers"));
    }

    public static <T extends Comparable<T>> T max (T a, T b ,T c){

        T m = a;
        if(b.compareTo(a) > 0){
            m = b;
        }

        if(c.compareTo(m) > 0){
            m = c;
        }

        return m;
    }
}
