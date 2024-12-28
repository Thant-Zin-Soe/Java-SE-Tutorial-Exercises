

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args){
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Label lb=new Label("Citizen");
		CheckBox checkBox=new CheckBox();
		TextField nrc=new TextField();
		nrc.setPromptText("Nrc Number");
		nrc.setDisable(true);
		
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(lb,checkBox,nrc);
		
		Scene scene=new Scene(hbox,400,300);
		stage.setScene(scene);
		stage.setTitle("Check-Demo");
		stage.show();
		
		checkBox.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				nrc.clear();
				nrc.setDisable(!checkBox.isSelected());
			}
		});
	}
}
