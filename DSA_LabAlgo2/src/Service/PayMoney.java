package Service;

public class PayMoney {
	public static int targetAchieved(int arr[], int target) {
		int transactions =-1;// denotes not possible
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>=target) {
				transactions=i+1;
				break;
			}
		}
		return transactions;
	}
}
