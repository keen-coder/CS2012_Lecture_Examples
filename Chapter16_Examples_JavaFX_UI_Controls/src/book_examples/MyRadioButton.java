package book_examples;

import javafx.scene.control.RadioButton;

public class MyRadioButton extends RadioButton{
	private int buttonNumber;
	
	public MyRadioButton(String btText, int buttonNumber) {
		super(btText);
		this.buttonNumber = buttonNumber;
	}
	
	public int getButtonNumber() {
		return this.buttonNumber;
	}
	
	
	
	
	
}
