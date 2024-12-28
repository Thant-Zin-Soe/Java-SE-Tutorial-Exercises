

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		//First Scene
		Label lb1=new Label("First Scene");
		TextField tf1=new TextField();
		tf1.setMaxWidth(200);
		Button btn1=new Button("Go to second Scene");
		
		VBox vbox=new VBox();
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(lb1,tf1,btn1);
		 Scene scene1=new Scene(vbox,300,200);
		 

			//Second Scene
			Label lb2=new Label("Second Scene");
			
			Button btn2=new Button("Go Back");
			
			HBox hbox=new HBox();
			hbox.setAlignment(Pos.CENTER);
			hbox.getChildren().addAll(lb2,btn2);
			 Scene scene2=new Scene(hbox,500,400);
			 
			 
			 //First Button Action
			 stage.setScene(scene1); 
			 btn1.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					stage.setScene(scene2);
				}
			});
			 
			 //Second Button Action
			stage.setScene(scene1);
			 btn2.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					stage.setScene(scene1);
				}
			});
			 
		////  Setting stage/////
			 
			
		stage.show();
	}
}
