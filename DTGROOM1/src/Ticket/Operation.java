package Ticket;
import java.util.Scanner;

public class Operation 

{

	public void show()
	{
	
	System.out.println("enter the number of test cases-----");
    Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
   int seats[]= new int[k]; 
   
   System.out.println("Enter the following seat no for  "+ k + " test cases");
	
	for(int i=0;i<seats.length;i++)
	{
	seats[i]=sc.nextInt();	
		
	}
	for(int i=0;i<seats.length;i++)
	{
	int div=seats[i]/12;
	if(seats[i]%12==0)
	{
		div--;
    }
		
	int f=13+(24*div);
	
	int front=f-seats[i];
	System.out.print(front+" ");
	int j=Math.abs(front-seats[i]);
	
	if(j==1||j==11)
	
		System.out.println("WS");
		
	else if(j==3||j==9)
			System.out.println("MS");
	
	else if(j==7||j==5)
			System.out.println("AS");
		
	
	
	}
	
	}
	

}
