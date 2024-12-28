

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		ChoiceBox<String> fruits=new ChoiceBox<>();
		fruits.getItems().add("Apple");
		fruits.getItems().add("Banana");
		fruits.getItems().add("Oramge");
		fruits.setValue("Apple");
		
		Label lb1=new Label("Old Value");
		Label lb2=new Label("New Value");
		
	
		
		VBox vbox=new VBox();
		vbox.setSpacing(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(fruits,lb1,lb2);
		
	
		
		Scene scene=new Scene(vbox,400,300);
		stage.setScene(scene);
		stage.show();
		
		fruits.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> ObserableValue, String oldValue, String newValue) {
				
				lb1.setText("Old Value->"+oldValue);
				lb2.setText("New Value->"+newValue);
			}
				
		});
	}
}
