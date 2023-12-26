package week3.day1;

public class Button extends WebElement {

	public void submit() {
		System.out.println("Submitted -->Button class");

	}
	public static void main(String[] args) {
		Button bt=new Button();
		bt.click();
		bt.setText("Test1-Button Class");
		bt.submit();
	}

	}


