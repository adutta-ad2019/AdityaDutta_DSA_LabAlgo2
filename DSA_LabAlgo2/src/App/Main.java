package App;

import java.util.Scanner;

import Service.PayMoney;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size=sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter the values of array");
		for(int i=0;i<size;i++) 
			arr[i]=sc.nextInt();
		
		System.out.println("enter the total no of targets that need to be achieved");
		int noOfTargets=sc.nextInt();		
		for(int i=noOfTargets;i>0;i--) {
			System.out.println("enter the value of target");
			int target=sc.nextInt();
			int transactions=PayMoney.targetAchieved(arr,target);
			if(transactions!=-1) 
				System.out.println("Target achieved after "+transactions+ " transactions \n");
			else
				System.out.println("Given target is not achieved \n");

			
		}
	}

}
