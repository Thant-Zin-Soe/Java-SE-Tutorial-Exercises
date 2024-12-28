package demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
		public void start(Stage stage) throws Exception {
		TextField tf=new TextField();
		Button createBtn=new Button("Create");
		
		
		HBox hbox=new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(30,0,0,30));
		hbox.getChildren().addAll(tf,createBtn);
		hbox.setSpacing(20);
		
		FlowPane flowPane=new FlowPane();
		flowPane.setHgap(10);
		flowPane.setVgap(10);
		
		VBox vbox=new VBox();
		vbox.getChildren().addAll(hbox,flowPane);
		vbox.setSpacing(10);
		vbox.setPadding(new Insets(30,0,0,30));
		
		
		
		Scene scene=new Scene(vbox,400,300);
		stage.setScene(scene);
		
		stage.show();
		
		createBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Button Cbtn=new Button(tf.getText());
				
				flowPane.getChildren().add(Cbtn);
				Cbtn.setPrefSize(100, 70);
				Cbtn.setMinWidth(100);
				
				
			}
		});
	}
}
