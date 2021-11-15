package book_examples.shapes;


import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipse extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a pane
		StackPane pane = new StackPane();

		Random r = new Random();

		for (int i = 0; i < 16; i++) {
			// Create an ellipse and add it to pane
//			int xRadius = r.nextInt(50) + 50; 
//			int yRadius = r.nextInt(50) + 50;
			
			//Ellipse name = new Ellipse(centerX, centerY, radiusX, radiusY); 	
			Ellipse e1 = new Ellipse(150, 100, 200, 100);
			e1.setFill(Color.color(Math.random(), Math.random(),
					Math.random()));
			//e1.setFill(Color.WHITE);
			e1.setRotate(i * 180 / 16);
			pane.getChildren().add(e1);
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 1000, 1000);
		primaryStage.setTitle("ShowEllipse"); // Set the stage title
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
