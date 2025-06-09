import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string:");
	String str=sc.nextLine();
	String str2="";
	for(int i=str.length()-1;i>=0;i--)
	{
		str2=str2+str.charAt(i);
	}
	System.out.println("Reversed string "+str2);
    }
}