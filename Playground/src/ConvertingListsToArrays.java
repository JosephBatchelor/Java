import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;

public class ConvertingListsToArrays {
    public static void main(String arg[]){
        // creating an array then changing the list
        String[] stuff = {"babies", "watermelong","melons","fudge"};
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

        thelist.add("pumpkin");
        thelist.addFirst("firstthing");

        //convert back to an array
        stuff = thelist.toArray(new String[thelist.size()]);

        for(String x : stuff){
            System.out.printf("%s ",x);
        }
    }
}
