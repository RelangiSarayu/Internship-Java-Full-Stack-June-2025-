import java.util.*;
class Swap
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	int a=sc.nextInt();
	System.out.println("Enter b value");
	int b=sc.nextInt();
	System.out.println("Before swapping "+a+" "+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping "+a+" "+b);
  }
}