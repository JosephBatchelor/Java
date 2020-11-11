import java.util.*;
public class Hashset {
    public static void main(String args []){
        //a set is a collection with new duplication's
        //hashset remove duplication within arrays / lists.
        String[] things = {"bob","apple","soup","bob","dog"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s", list);
        System.out.println();

        //creating a set  and past it through as a hashset
        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s", set);
    }
}
