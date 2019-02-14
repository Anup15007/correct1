import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class ReversedSort {
	
	public static int[] getSorted(int array[])
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>(array.length);
		int rev=0;
		
		
			for(int j=0;j<array.length;j++)
		{
			rev=0;
			while(array[j]>0)
			{
				rev = (rev*10) + (array[j]%10);
				array[j] = array[j]/10;
			}
			
			a1.add(rev);
		}
		
		int array1[] = new int[array.length];
		int k=0;
		Collections.sort(a1);
		for(Integer s : a1)
		{
			array1[k++] = s;
			
		}
		
		return array1;

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Integers you wanna enter:");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the integers:");
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		
		int array2[]  = getSorted(array);
		System.out.println("The Sorted Integers are:");
		for(int k=0;k<array2.length;k++)
		{
			System.out.println(array2[k]+" ");
		}
		
	}

}
