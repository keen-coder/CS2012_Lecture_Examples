package book_examples;



import java.util.Random;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class NodeStyleRotateDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		Button btOK = new Button("OK");
		//JavaFX CSS
		btOK.setStyle("-fx-border-color: blue; -fx-text-fill: firebrick;");
		//btOK.setOpacity(0.25);    
		btOK.setRotate(-75);
		//pane.setRotate(45);
		pane.setStyle("-fx-border-color: red; -fx-background-color: lightgrey; -fx-border-width: 20");

		Circle circle = new Circle(0, 0, 25);
		circle.setFill(Color.GREEN);
		pane.getChildren().add(btOK);
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("NodeStyleRotateDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
