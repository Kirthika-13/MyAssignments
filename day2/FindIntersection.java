package week2.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		
		int arrayLen = a.length;
		System.out.println("The total Length of the array is :"+arrayLen);
		int arrayLen2 = b.length;
		System.out.println("The total Length of the array is :"+arrayLen2);
		
		for (int i=0; i<arrayLen; i++) {
			for (int j=0; j<arrayLen2; j++) {
				if (a[i]==b[j]) {
					System.out.println(b[j]);
				}
			}
		}
	}

}
