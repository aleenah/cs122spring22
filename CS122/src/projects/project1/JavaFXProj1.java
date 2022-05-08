package projects.project1;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;   

public class JavaFXProj1 extends GridPane {
	public final TextField input = new TextField();
	public Label result = new Label();
	public final LinkedList list = new LinkedList();

	public JavaFXProj1() {
		Label outputLabel = new Label("Output:");

		Button AddButton = new Button("ADD");
		AddButton.setOnAction(this::addItem);

		Button RemoveButton= new Button("REMOVE");
		RemoveButton.setOnAction(this::removeItem);

		Button ClearButton= new Button("CLEAR");
		ClearButton.setOnAction(this::clearList);

		setAlignment(Pos.CENTER);
		setHgap(20);
		setVgap(10);
		setStyle("-fx-background-color: hotpink");

		add(input, 1, 1);
		add(outputLabel, 0, 3);
		add(result, 1, 3);
		add(AddButton, 0, 1);
		add(RemoveButton, 2, 1);
		add(ClearButton, 3, 1);
	}

	public void addItem(ActionEvent event) {
		try {
		list.addToEnd(Integer.parseInt(input.getText()));
		result.setText(list.toString());
		}
		catch(NumberFormatException exception) {
		 result.setText("Please enter a different data type.");
		}
	}

	public void removeItem(ActionEvent event) {
		list.removeFirst();
		result.setText(list.toString());

	}

	public void clearList(ActionEvent event) {
		list.clear(); 
		result.setText(list.toString());

	}
}


