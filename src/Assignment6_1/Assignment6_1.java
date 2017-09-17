package Assignment6_1;
/*
 * Declare an integer array of size 10. 
 * Initialize using for loop with 1 to 10, 
 * and print all even numbers from an array.
 */

import java.util.Scanner; // Importing scanner Class
public class Assignment6_1 
{
	public static void main(String[] args) // Start of Main Class
	{
			int arr[]=new int[10];// Declaring an Integer array of size 10
			Scanner s=new Scanner(System.in); // Creating scanner object
			System.out.println("Enter elements in array");
			for(int i=0;i<arr.length;i++)
			{
			arr[i]=s.nextInt(); // User input for Array
			}			
			System.out.println("Entered elements of the array are:");
			for(int i=0;i<arr.length;i++)
			{
			System.out.println(arr[i]); //Showing Elements Entered in the array of Size 10
			}			
			System.out.println("Even Numbers in the array are:");
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0) //Checking elements in the array are even or not
			     System.out.println(arr[i]);// print even numbers in the array
			}			
			s.close();//Close of Scanner Class
	}// Close of Main Class
}	


