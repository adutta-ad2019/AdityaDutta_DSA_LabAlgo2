package App;

import java.util.Scanner;

import Service.Denominations;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int size=sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<size;i++) 
			arr[i]=sc.nextInt();
		System.out.println("enter the amount you want to pay");
		int amt=sc.nextInt();		
		Denominations.getDenominations(arr,amt);
	}

}
