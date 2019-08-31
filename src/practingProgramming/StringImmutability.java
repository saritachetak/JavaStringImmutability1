package practingProgramming;

public class StringImmutability {
    public static void main(String[] args) {
        String s ="HELLO";
        String s1 =s+"java";
        System.out.println(s.toLowerCase());
        System.out.println(s1);
        String s3=new String("world");
        String s4="hello";
        System.out.println(s4.toUpperCase());

           String s6=s+"world";
           s6=s;
        System.out.println(s6);
        System.out.println(s.hashCode());
        System.out.println(s4.hashCode());
        String str=s+s4;
        System.out.println(str +"hash code value is  = " +str.hashCode());
        System.out.println("using comparing metod   the values is=" +s.equals(s3));
        System.out.println("using equels method comparing the objects is=" +s.equalsIgnoreCase(s4));













    }
}
