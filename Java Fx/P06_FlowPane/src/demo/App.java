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
		Button btnCreate=new Button("Create Button");
		
		
		FlowPane flowPane=new FlowPane();
		flowPane.setVgap(10);
		flowPane.setHgap(10);
		
		
		
		
		
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(tf,btnCreate);
		
		VBox vbox=new VBox();
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(hbox,flowPane);
		vbox.setPadding(new Insets(30,0,0,30));
		
		
		
		Scene scene=new Scene(vbox,500,300);
		stage.setScene(scene);
		stage.setTitle("Exercise");
		stage.show();
		
		btnCreate.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Button btnOutPut=new Button(tf.getText());
				tf.clear();
				flowPane.getChildren().add(btnOutPut);
				btnOutPut.setPrefSize(100, 50);
				btnOutPut.setMaxWidth(100);
			}
		});
	}
	
}
