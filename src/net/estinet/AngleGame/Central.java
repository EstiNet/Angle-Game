package net.estinet.AngleGame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Central extends Application{
	public static void main(String[] args){
		System.out.println("Angle-Game loading...");
		launch(args);
	}
	 @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Angle Game");
	        Button btn = new Button();
	        TextField tf = new TextField();
	        tf.setText("What's your name child?");
	        btn.setText("Start!");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Hello World!");
	            }
	        });
	        
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);
	        primaryStage.setScene(new Scene(root, 300, 250));
	        primaryStage.show();
	    }
}
