import java.util.Scanner;
import java.util.Random;

public class OddsGame {
public static void main(String args[]){
    Scanner Scan = new Scanner(System.in);
    Random Ran = new Random();

int Num = Ran.nextInt(5) + 1;
System.out.println("Pick a number between 1-5");
int user = Scan.nextInt();
if(user > 5){
    System.out.println("That's not between 1-5");
}

    System.out.println("You: "+ user);
    System.out.println("Computer: "+ Num);

    if(user == Num){
    System.out.println("Nice guess");
}else{
    System.out.println("Better luck next time");

}
}
}
