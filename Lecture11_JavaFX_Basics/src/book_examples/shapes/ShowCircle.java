package book_examples.shapes;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		Circle circle2 = new Circle();
		circle2.setCenterX(300);
		circle2.setCenterX(400);
		circle2.setRadius(75);
		
		Circle circle3 = new Circle();
		circle3.setRadius(25);
		circle3.setFill(Color.GREEN);
		
		Circle circle4 = new Circle();
		circle4.setRadius(10);
		//circle4.setFill(Color.BLUE);
		circle4.setStyle("-fx-fill: blue;");
		
		// Create a pane to hold the circle
		StackPane pane = new StackPane();
		pane.getChildren().add(circle2);
		pane.getChildren().add(circle);
		pane.getChildren().add(circle3);
		pane.getChildren().add(circle4);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setTitle("ShowCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	//Main method required to run in Eclipse.
	public static void main(String[] args) { 
		Application.launch(args);
	}
}
