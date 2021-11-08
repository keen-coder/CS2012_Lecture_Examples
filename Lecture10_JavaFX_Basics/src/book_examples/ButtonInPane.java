package book_examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("New Button"));
		pane.getChildren().add(new Button("OK"));
		
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in a pane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	//Main method required forf Eclipse.
	public static void main(String[] args) {
		Application.launch(args);
	}
}