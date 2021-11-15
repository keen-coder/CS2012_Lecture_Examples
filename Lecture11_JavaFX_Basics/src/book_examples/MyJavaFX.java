package book_examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple example of the structure of a JavaFX program.
 */
public class MyJavaFX extends Application {

	// Override the start method in the Application class.
	// The start() method becomes the new "main()" method of a JavaFX program.
	@Override 
	public void start(Stage primaryStage) {
		// Create a JavaFX Button.
		Button btOK = new Button("My First JavaFX Program");
		
		//Create a StackPane and add a button to it.
		StackPane pane = new StackPane();
		pane.getChildren().add(btOK);
		
		//Place the Pane into a JavaFX Scene.
		Scene scene = new Scene(pane, 200, 250);
		
		//Set the title of the primaryStage (the main window.)
		primaryStage.setTitle("MyJavaFX");
		
		//Attach the scene to the primary stage.
		primaryStage.setScene(scene); // Place the scene in the stage
		
		//Display the primaryStage 
		primaryStage.show();
	}
	
	//Main method required to run in Eclipse.
	public static void main(String[] args) { 
		Application.launch(args);
	}
}