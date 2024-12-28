import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		ChoiceBox<String> box=new ChoiceBox<>();
		box.getItems().addAll("Apple","Banana","Orange");
		box.setValue("Apple");
		
		box.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println("Oversable Name:"+observable);
				System.out.println("Old Name:"+oldValue);
				System.out.println("New Name:"+newValue);
			}
		});
		
		HBox hbox=new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(box);
		
		Scene scene=new Scene(hbox,300,200);
		stage.setScene(scene);
		stage.show();
		
		
	}
}
