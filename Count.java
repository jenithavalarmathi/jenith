import java.util.*;
import java.io.*;
public class Count {
    
 public static void main(String[] args)throws IOException {
    String test ;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    test=br.readLine();
    count(test);

  }
  public static void count(String x){
    char[] ch = x.toCharArray();
    int letter = 0;
    int space = 0;
    int num = 0;
    int other = 0;
    for(int i = 0; i < x.length(); i++){
      if(Character.isLetter(ch[i])){
        letter ++ ;
      }
      else if(Character.isDigit(ch[i])){
        num ++ ;
      }
      else{
        other ++;
      }
    }
    
    System.out.println("letter: " + letter);
    System.out.println("number: " + num);
    System.out.println("other: " + other);
      }
}
