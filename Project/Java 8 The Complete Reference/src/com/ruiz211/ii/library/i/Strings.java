package com.ruiz211.ii.library.i;

public class Strings {

    public Strings() {
    }

    public static void main(String... doYourBest) {
        //The String Constructors
        String s = new String("Joseph");
        char[] c = {'a', 'e', 'i', 'o', 'u'};
        String letters = new String(c);
        System.out.println(s);
        System.out.println(c);

        //Try String API...

        //String Length
        System.out.println(letters.length());

        //String Concatenation
        System.out.println(s + c);

        //String Concatenation with Other Data Types
        System.out.println(String.valueOf(12));

        //String Conversion and toString( )


        //Character Extraction
        //charAt()
        System.out.println(s.charAt(2));

        //toCharArray()


        //String Comparison
        //equals() and equalsIgnoreCase()
        System.out.println(s.equals(c));

        //regionMatches()


        //startsWith() and endsWith()
        System.out.println(s.startsWith("J"));
        System.out.println(s.endsWith("h"));

        //compareTo()


        //Searching Strings


        //Modifying a String
        //substring()


        //concat()


        //replace()
        System.out.println(s.replace("J", "j"));


        //trim() and strip()


        //Data Conversion Using valueOf()
        //static String valueOf(double num)
        //static String valueOf(long num)
        //static String valueOf(Object ob)
        //static String valueOf(char chars[])


        //Changing the Case of Characters Within a String
        //String toLowerCase( )
        //String toUpperCase( )
    }
}
