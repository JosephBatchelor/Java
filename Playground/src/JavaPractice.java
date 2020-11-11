import java.util.*;
public class JavaPractice {

    public static void main(String []args){

        DataStructures structure1 = new DataStructures("Stack", "Θ(n)");
        System.out.println(structure1.Name +" : "+ structure1.Complexity);

        DataStructures structure2 = new DataStructures("Queue", "Θ(n)");
        System.out.println(structure2.Name +" : "+ structure2.Complexity);

        DataStructures structure3 = new DataStructures("Singly-Linked List", "Θ(n)");
        System.out.println(structure3.Name +" : "+ structure3.Complexity);

        
    }

    static class DataStructures{
        String Name;
        String Complexity;


        DataStructures(String Name , String Complexity ){
            this.Name = Name;
            this.Complexity = Complexity;
        }
    }
}
