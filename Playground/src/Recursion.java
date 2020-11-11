public class Recursion {
    public static void main(String args[]){
        System.out.println(fact(5));

    }

    //factorial method
    public static long fact (long n){
        if(n <=1){
            return 1; //base case
        }else{
            return n * fact(n-1);
        } }
    }

