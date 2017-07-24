import java.util.*;
 
class Ascii
{
      public static void main(String args[])
    {
  
        String ch;
        int i;
       String test = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
       for (i = 0; i < test.length(); ++i ) {
           char c = test.charAt( i );
                int j = (int) c;
                    System.out.println(j);
}
    }
}
