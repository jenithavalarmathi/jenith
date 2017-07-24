import java.util.*;
 public class HCF 
{
    static int gcd(int m, int n)
    {
        int k=0, i, j;
        i = (m > n) ? m : n; 
        j = (m < n) ? m : n; 
 
        k = j;
        while(i % j != 0)
        {
            k = i % j;
            i = j;
            j = k;
        }
        return k;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
 
        System.out.println("The GCD of two numbers is: " + gcd(m, n));
        sc.close();    
    }
}
