package week3.day1;

public class TextField extends WebElement {
	public void getText() {
		System.out.println("This is a text ->TextField class");

	}

	public static void main(String[] args) {
		TextField tf = new TextField();
		tf.click();
		tf.setText("Text2-TextField Class");
		tf.getClass();
	}

}
