import java.io.*;
class Lcm
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,max,min,k,lcm=1;
System.out.print("Enter the 1st number : ");
i=Integer.parseInt(br.readLine());
System.out.print("Enter the 2nd number : ");
j=Integer.parseInt(br.readLine());
if(i>j)
{
max=i;
min=j;
}
else
{
max=j;
min=i;
}
for(int m=1;m<=min;m++)
   {
    i=max*m; 
    if(i%min==0) 
     {
      lcm=i; 
      break; 
     }
    }
System.out.println("L.C.M. = "+lcm);
}
}
