package week3.day1;

public class RadioButton extends Button {
	
	public void selectradioButton() {
		System.out.println("Button clicked -> RadioButton class");

	}

	public static void main(String[] args) {
	RadioButton rb = new RadioButton();
	rb.click();
	rb.setText("Text4 - RadioButton class");
	rb.submit();
	rb.selectradioButton();

	}

}
