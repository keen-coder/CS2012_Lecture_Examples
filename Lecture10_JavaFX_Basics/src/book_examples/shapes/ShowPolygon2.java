package book_examples.shapes;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class ShowPolygon2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Polyline polygon = new Polyline();
		pane.getChildren().add(polygon); 
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();
		
		list.add(0.0);
		list.add(0.0);
		list.add(300.0);
		list.add(250.0);
		list.add(150.0);
		list.add(450.0);
		list.add(75.0);
		
		
		
		
		Scene scene = new Scene(pane, 600, 700);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
