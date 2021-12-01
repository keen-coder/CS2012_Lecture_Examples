package book_examples;


import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo {
	
  @Override // Override the getPane() method in the super class
  protected BorderPane getPane() {
    BorderPane pane = super.getPane();
    
    VBox paneForRadioButtons = new VBox(20);
    paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5)); 
    //paneForRadioButtons.setStyle("-fx-border-color: green");
    paneForRadioButtons.setStyle
      ("-fx-border-width: 2px; -fx-border-color: green");
//    RadioButton rbRed = new RadioButton("Red");
//    RadioButton rbGreen = new RadioButton("Green");
//    RadioButton rbBlue = new RadioButton("Blue");
//    RadioButton rbBlack = new RadioButton("Black");
//    paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue, rbBlack);
//    pane.setLeft(paneForRadioButtons);
//	  rbRed.setToggleGroup(group);
//    rbGreen.setToggleGroup(group);
//    rbBlue.setToggleGroup(group);
//    rbBlack.setToggleGroup(group);
//    
//    rbBlack.setOnAction(e -> {
//    	if (rbBlack.isSelected()) {
//    		text.setFill(Color.BLACK);
//    	}
//    });
// 
//    
//    rbRed.setOnAction(e -> {
//      if (rbRed.isSelected()) {
//        text.setFill(Color.RED);
//      }
//    });
//    
//    rbGreen.setOnAction(e -> {
//      if (rbGreen.isSelected()) {
//        text.setFill(Color.GREEN);
//      }
//    });
//
//    rbBlue.setOnAction(e -> {
//      if (rbBlue.isSelected()) {
//        text.setFill(Color.BLUE);
//      }
//    });
    String[] buttonText = {"Red", "Green", "Blue", "Black", "Purple", "Gold"};
    Color[] colorValues = {Color.RED, Color.GREEN, Color.BLUE, Color.BLACK, Color.PURPLE, Color.GOLD};
    
    ToggleGroup group = new ToggleGroup();
    
    for(int i = 0 ; i < buttonText.length ; i++) {
    	MyRadioButton nextButton = new MyRadioButton(buttonText[i], i);
    	paneForRadioButtons.getChildren().add(nextButton);
    	nextButton.setToggleGroup(group);
    	nextButton.setOnAction(event -> {
    		if (nextButton.isSelected()) {
        		text.setFill(colorValues[nextButton.getButtonNumber()]);	
        	}
    	});
    }
    pane.setLeft(paneForRadioButtons);
    
    
//    
    
    return pane;
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
