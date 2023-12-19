package week2.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=123;
		int input = num;
		
		int output=0;
		while(num!=0) {
			output= output*10 + num%10;
			num = num/10;
			
		}
		if(input==output) {
			System.out.println(input+ " is a Palindrome Number");
		}
		else {
			System.out.println(input+ " is a not a Palindrome Number");
		}
	}

}
