package week3.day1;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		System.out.println("Common tasks are performed and completed ->Loginpage class");

	}
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		//lp.clickElement();
		//lp.findElement();
		lp.performCommonTasks();
		
		BasePage base = new BasePage();
		base.performCommonTasks();
	}

}
