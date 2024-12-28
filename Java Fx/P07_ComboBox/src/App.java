import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		 
		
		ComboBox<String> fruits=new ComboBox<>();
		fruits.getItems().add("Apple");
		fruits.getItems().add("Orange");
		fruits.getItems().add("Lemon");
		fruits.setValue("Apple");
		
		Label lbl=new Label("Apple");
		
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(fruits,lbl);
		
		Scene scene=new Scene(hbox,400,200);
		stage.setScene(scene);
		stage.setTitle("ComBboBox");
		stage.show();
		
		fruits.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				lbl.setText(fruits.getValue());
			}
		});
	}
}
