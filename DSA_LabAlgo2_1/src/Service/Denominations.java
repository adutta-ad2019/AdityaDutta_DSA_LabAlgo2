package Service;

import java.util.Arrays;

public class Denominations {
	public static void getDenominations(int arr[], int amt) {
		Arrays.sort(arr);
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=arr.length-1;i>-1;i--) {
			int qty=amt/arr[i];
			if(qty>0) {
				System.out.println(arr[i]+":"+qty);
				amt%=arr[i];
			}
				
		}
	}
}
