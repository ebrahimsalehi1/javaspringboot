package com.ebi.salehi.fx.TestHosco;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * Hello world!
 *
 */
public class App extends Application
{
	Button button;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Title of window");
		button = new Button();
		button.setText("Click me");
		
		StackPane pane = new StackPane();
		pane.getChildren().add(button);
		
		Scene scene =new Scene(pane,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
