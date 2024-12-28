import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Button btn=new Button("Click Me");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				stage.close();
			}
		});
		StackPane layout=new StackPane();
		Scene scene=new Scene(layout,300,200);
		layout.getChildren().add(btn);
		stage.setScene(scene);
		stage.show();
		
	}
}
