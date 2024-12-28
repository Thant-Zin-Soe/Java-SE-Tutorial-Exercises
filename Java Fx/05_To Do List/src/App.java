import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {

		TextField tf = new TextField();
		Button btn = new Button("Add");
		
		Label lbl = new Label("Hello");

		HBox hbox = new HBox(tf, btn);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(10);

		VBox vbox = new VBox();
		vbox.setAlignment(Pos.TOP_CENTER);
		vbox.setPadding(new Insets(30, 0, 0, 0));
		vbox.setSpacing(10);
		vbox.getChildren().add(hbox);
		vbox.getChildren().add(lbl);

		Scene scene = new Scene(vbox, 300, 400);
		stage.setScene(scene);

		stage.setTitle("To Do List");
		stage.show();

		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				Label lbl = new Label(tf.getText());
				vbox.getChildren().add(lbl);
				
				tf.clear();
			}
		});
		
	}
}
