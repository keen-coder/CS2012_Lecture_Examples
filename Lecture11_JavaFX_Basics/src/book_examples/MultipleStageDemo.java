package book_examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX program which shows how to create multiple stages (windows).
 */
public class MultipleStageDemo extends Application{
	@Override 
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Scene scene = new Scene(new StackPane(new Button("OK")), 300, 300);

		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		Stage stage = new Stage(); // Create a new stage
		stage.setTitle("Second Stage"); // Set the stage title
		
		// Set a scene with a button in a StackPane, to the stage.
		stage.setScene(new Scene(new StackPane(new Button("New Stage")), 250, 250));        
		stage.show(); // Display the stage
	}

	//Main method required to run in Eclipse.
	public static void main(String[] args) {
		Application.launch(args);
	}
}
