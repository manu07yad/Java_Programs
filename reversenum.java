package reversenum;

import java.util.Scanner;

public class reversenum {

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
		 System.out.println("Reverse of "+n+" is: "+ rev);

	}

}
