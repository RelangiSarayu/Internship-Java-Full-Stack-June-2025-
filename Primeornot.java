import java.util.*;
class Primeornot
{
  static boolean findprime(int n)
  {
	int count=0;
	for(int i=1;i<n-1;i++)
	{
	   if(n%i==0)
	   {
	    count++;
	   }
	}
          
		if(count==2)
		{
		  return true;
		}
		else
		{
		  return false;
		}
    }
    public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value");
	int n=sc.nextInt();
	Boolean result=findprime(n);
	System.out.println(result);
     }
}