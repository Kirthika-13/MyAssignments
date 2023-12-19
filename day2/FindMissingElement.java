package week2.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] a = {1,4,3,2,8,6,7};
		int arrayLen = a.length;
		Arrays.sort(a);
		
	int sum1=0;
	for (int i=0; i<arrayLen; i++) {
		sum1=sum1+a[i];	
	}
	
	int sum2=0;
	for (int i=1;i<=8;i++) {
		sum2=sum2+i;		
	}
	
	//int missingelement = sum2-sum1;
	//System.out.println("The missing element is " +missingelement);
	System.out.println("The missing element is "+(sum2-sum1));	
	}
		
		
	}


