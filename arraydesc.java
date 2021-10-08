package arraydesc;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.*; 
public class arraydesc {
public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=input.nextInt();
		int[] array = new int[n]; 
		System.out.println("Enter elements of array :");
		for(int i=0;i<n;i++)
		{
			array[i]=input.nextInt();
		}
		Arrays.sort(array);
		 
		for(int i=n;i>0;i--)
		{
			System.out.print(array[i-1]+" ");
		}
	}
}
