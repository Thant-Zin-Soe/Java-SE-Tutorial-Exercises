import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Button btn = new Button("Click Me");
		Label lbl = new Label("Hello");
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				if(lbl.getText().equals("Hello")) {
					lbl.setText("Hi");
				}
				else {
					lbl.setText("Hello");
				}
			}
		});

		VBox layout = new VBox();
		layout.setAlignment(Pos.CENTER);
		layout.setSpacing(10);
		layout.getChildren().addAll(btn, lbl);
		Scene scene = new Scene(layout, 300, 200);
		stage.setScene(scene);
		stage.show();
	}
}
