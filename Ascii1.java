import java.util.*;
 
class Ascii
{
      public static void main(String args[])
    {
  
        String ch;
        int j;
       String test = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
       for (j = 0; j < test.length(); ++j ) {
           char ch = test.charAt( j );
                int k = (int) ch;
                    System.out.println(k);
}
    }
}
