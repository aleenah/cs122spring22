package projects.project1;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class ListProject extends Application {
	public void start(Stage primaryStage)  {
		Scene scene = new Scene(new JavaFXProj1(), 600, 200);

		primaryStage.setTitle("Project 1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)  {
		launch(args);
	}
}
	
