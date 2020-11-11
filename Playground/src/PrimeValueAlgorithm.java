
import java.util.*;
public class PrimeValueAlgorithm {

    public static void main(String []args){
        Random Ran = new Random();
        ArrayList<Integer> Stack = new ArrayList();

        int Link = Ran.nextInt(51);
        int Prime = Link;
        int A = Link;
        int B = Ran.nextInt(51);
        int C = Ran.nextInt(51);
        int D = Ran.nextInt(51);
        int E = Ran.nextInt(51);
        int F = Ran.nextInt(51);
        int G = Ran.nextInt(51);
        int H = Ran.nextInt(51);

        Stack.add(A);
        Stack.add(B);
        Stack.add(C);
        Stack.add(D);
        Stack.add(E);
        Stack.add(F);
        Stack.add(G);
        Stack.add(H);

        System.out.println(Stack);
        Collections.shuffle(Stack);
        System.out.println(Stack);
        int i;
        for(i=0; i<= Stack.size(); i++){

            if(Stack.get(i) == Prime){
                System.out.println(i +". "+Prime+ " = "+Stack.get(i));
            break;
            }

           int j;
           for(j =0; j < Stack.size(); i++){
              int key = Stack.indexOf(j);
              int a = j-1;
              while(a > 0 && Stack.indexOf(a) > key) {
                  a = Stack.get(a);
                  i = i-1;
                  
              }
            }System.out.println(Stack);


        }
    }
}
