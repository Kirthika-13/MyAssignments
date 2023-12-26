package week3.day1;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("Entered username ->Logintestdata class");
	}
	public void enterPassword() {
	System.out.println("Entered password ->Logintestdata class");
	}
	
	public static void main(String[] args) {
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterPassword();
		login.enterUsername();
		
		TestData test = new TestData();
		test.enterCredentials();
		test.navigateToHomePage();
	}
}
