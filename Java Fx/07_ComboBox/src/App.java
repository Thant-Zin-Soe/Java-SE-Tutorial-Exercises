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
		ComboBox<String> fruit=new ComboBox<>();
		fruit.getItems().add("Apple");
		fruit.getItems().add("Banana");
		fruit.getItems().add("Orange");
		fruit.getItems().add("Leamon");
		fruit.setValue("Apple");
		
		Label lbl=new Label("Apple");
		
		HBox layout=new HBox();
		layout.setAlignment(Pos.CENTER);
		layout.setSpacing(15);
		layout.getChildren().addAll(fruit,lbl);
		
		fruit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				lbl.setText(fruit.getValue());
			}
		});
		
		Scene scene= new Scene(layout,400,300);
		stage.setScene(scene);
		stage.show();
	}
}
