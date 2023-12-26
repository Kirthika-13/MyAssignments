package week3.day1;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("CheckBox button clicked - CheckBoxButton class");

	}

	public static void main(String[] args) {
		CheckBoxButton cb= new CheckBoxButton();
		cb.click();
		cb.setText("Text3 - CheckBoxButton class");
		cb.submit();
		cb.clickCheckButton();
		

	}

}
