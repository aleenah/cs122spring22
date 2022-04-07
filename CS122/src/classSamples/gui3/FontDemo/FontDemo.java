package classSamples.gui3.FontDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//************************************************************************
//  FontDemo.java       Author: Lewis/Loftus
//
//  Demonstrates the creation and use of fonts.
//************************************************************************

public class FontDemo extends Application {
	Text text1, text2, text3;
	Font font1, font2, font3;
	// --------------------------------------------------------------------
	// Displays three Text objects using various font styles.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		font1 = new Font("Courier", 36);
		font2 = Font.font("Times", FontWeight.BOLD, FontPosture.ITALIC, 28);
		font3 = Font.font("Arial", FontPosture.ITALIC, 14);

		text1 = new Text(30, 55, "Dream Big");
		text1.setFont(font1);
		text1.setUnderline(true);

		text2 = new Text(150, 110, "Know thyself!");
		text2.setFont(font2);
		text2.setFill(Color.GREEN);

		text3 = new Text(50, 150,
				"In theory, there is no difference " + "between theory\nand practice, but in practice there is.");
		text3.setFont(font3);
	
		//in class solution:
//		Button changeFont = new Button("Change font!");
//		changeFont.setOnAction((event)->{
//			text1.setFont(Font.font("American Typewriter", FontWeight.BOLD, 10));
//		});
		
		
		//my own solution:
		Button fontchanger = new Button("Change font!"); 
		fontchanger.setOnAction(this::processChangeFont); 

	
		Group root = new Group(text1, text2, text3, fontchanger);
		Scene scene = new Scene(root, 400, 200, Color.LIGHTCYAN);
		

		primaryStage.setTitle("Font Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//my own solution: 
	public void processChangeFont(ActionEvent event) {
		text1.setFont(font2);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}