/*
 * Copyright 2015 EstiNet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.estinet.AngleGame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import net.estinet.AngleGame.levels.Lvl1;

public class Central extends Application{
	Lvl1 lvl1 = new Lvl1();
	public static void main(String[] args){
		System.out.println("Angle-Game loading...");
		launch(args);
	}
	@Override
	    public void start(Stage primaryStage) {
		 	GridPane grid = new GridPane();
		 	grid.setAlignment(Pos.CENTER);
		 	grid.setHgap(10);
		 	grid.setVgap(10);
		 	grid.setPadding(new Insets(25, 25, 25, 25));
		 
	        primaryStage.setTitle("Angle Game");
	        Button btn = new Button();
	        TextField tf = new TextField();
	        tf.setText("What's your name child?");
	        btn.setText("Start!");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	            	StaticStorage.name = tf.getText();
	                System.out.println("And his name is " + tf.getText() + ". Not John Cena.");
	                System.out.println("Initiating next stage.");
	                lvl1.initialize();
	                primaryStage.close();
	            }
	        });
	        
	        StackPane root = new StackPane();
	        grid.add(btn, 0, 1);
	        grid.add(tf, 0, 2);
	        root.getChildren().add(grid);
	        primaryStage.setScene(new Scene(root, 300, 250));
	        primaryStage.show();
	    }
}
