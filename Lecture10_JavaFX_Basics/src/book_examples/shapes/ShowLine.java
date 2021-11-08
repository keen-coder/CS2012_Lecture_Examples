package book_examples.shapes;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class ShowLine extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a scene and place it in the stage
		Scene scene = new Scene(new LinePane(), 200, 200);
		primaryStage.setTitle("ShowLine"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

class LinePane extends Pane {

	public LinePane() {
		//Line name = new Line(startx, starty, endx, endy)
		Line line1 = new Line(10, 10, 150, 150);
		line1.setStrokeWidth(5);
		line1.setStroke(Color.BLUE);
		super.getChildren().add(line1);

		Line line2 = new Line(150, 10, 10, 150);
		line2.setStrokeWidth(5);
		line2.setStroke(Color.GREEN);
		super.getChildren().add(line2);
	}
}