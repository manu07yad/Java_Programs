package palindrome;
import java.util.*;
public class palindrome
{
public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the number: ");
		 int n=input.nextInt();
		 int temp=n;
		 int rev=0;
		 while(temp!=0)
		 {
			 int rem=temp%10;
			 rev=rev*10+rem;
			 temp=temp/10;
	     }
		 if(rev==n)
		 {
			 System.out.println(n + " is palindrome.");
		 }
		 else
		 {
			 System.out.println(n + " is not palindrome.");
		 }
	}
}
