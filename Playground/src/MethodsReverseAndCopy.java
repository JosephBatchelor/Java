import java.util.*;

public class MethodsReverseAndCopy {
    public static void main(String args[]){
    //create an array and convert to a list
        Character[] ray = {'p','w','n'};
        List<Character> l = Arrays.asList(ray);
        System.out.println("List is : ");
        output(l);

        //reverse and print out the list
        Collections.reverse(l);
        System.out.println("After reverse");
        output(l);

        //create new array and list
        Character[] newray = new Character[3];
        List<Character> listCopy = Arrays.asList(newray);

        //copy contents list into listcopy
        Collections.copy(listCopy, l);
        System.out.println("Copy list");
        output(listCopy);
        //fill collection with crap
        Collections.fill(l, 'x');
        System.out.println("After filling the list : ");
        output(l);
    }
    //output method
    private static void output(List<Character> thelist){

        for(Character thing : thelist){
            System.out.printf("%s", thing);
            System.out.println();
        }

    }

}
