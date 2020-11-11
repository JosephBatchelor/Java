public class SomeMoreStringMethods {
    public static void main(String args[]){
        //index OF
        String s = "BuckyrobertsBuckyroberts";
        System.out.println(s.indexOf("k",5));

        String a,d,c;
        a = "bacon ";
        d = "monster ";
        c = "snap";
        //connecting words (.concat())
        System.out.println(a.concat(d.concat(c)));
        //replacing String values (.replace())
        System.out.println(a.replace("bacon","Fucking").concat(d.concat(c.replace("snap","Run"))));
        //prints String in uppercase (.Uppercase())
        System.out.println(a.replace("bacon","Fucking").toUpperCase().concat(d.concat(c.replace("snap","Run"))));
        //removing white space methods (.trim())
        String spaces = "     fucking annoying          ";
        System.out.println(spaces.toUpperCase().trim());

    }
}
