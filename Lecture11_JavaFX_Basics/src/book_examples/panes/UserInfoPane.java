package book_examples.panes;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class UserInfoPane extends GridPane {
	
	public UserInfoPane() {
		setupUserInfo();
	}
	
	private void setupUserInfo() {
		super.setAlignment(Pos.CENTER);
		super.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		super.setHgap(10);
		super.setVgap(10);
	   
	    // Place nodes in the pane
	    //Indexes are (col, row) NOT (row, col).
	    //pane_name.add(node, col_index, row_index);
		super.add(new Label("First Name:"), 0, 0);
		super.add(new TextField(), 1, 0);
		super.add(new Label("MI:"), 0, 1); 
		super.add(new TextField(), 1, 1);
		super.add(new Label("Last Name:"), 0, 2);
		super.add(new TextField(), 1, 2);
	    Button btAdd = new Button("Add Name");
	    super.add(btAdd, 1, 3);
	    GridPane.setHalignment(btAdd, HPos.RIGHT);
	}
	
	
	
}
