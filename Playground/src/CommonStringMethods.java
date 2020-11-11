public class CommonStringMethods {
    public static void main(String args []){
        String[] words = {"funk","chunk","furry","baconator"};

        //startWith
        for(String w : words){
            if(w.startsWith("fu")){
                System.out.println(w + " starts with fu");
            }
        }
        System.out.println("\n");
        //endsWith
        for(String w : words){
            if(w.endsWith("nk")){
                System.out.println(w + " ends with nk");
            }
        }

    }
}
