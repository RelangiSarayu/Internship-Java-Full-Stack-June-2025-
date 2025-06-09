import java.util.*;
class AreaandPerimeter
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	int a=sc.nextInt();
	System.out.println("Enter b value");
	int b=sc.nextInt();
	System.out.println("Enter c value");
	int c=sc.nextInt();
	float peri=a+b+c;
	System.out.println("Enter height h:");
	int h=sc.nextInt();
	double area= (b*h)/2;
	System.out.println("perimeter of the Triangle is "+peri+" (sum of all sides)");
	System.out.println("Area of the triangle is "+area);
   }
}