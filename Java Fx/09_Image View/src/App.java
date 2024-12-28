import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.getItems().add("Smiling");
		comboBox.getItems().add("Crying");
		comboBox.setValue("Smiling");

		Image img1 = new Image("/img/smiling.png");
		Image img2 = new Image("/img/crying.png");
		ImageView imgView = new ImageView();
		imgView.setImage(img1);

		HBox hbox = new HBox();
		hbox.setSpacing(20);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(comboBox);
		hbox.getChildren().add(imgView);

		Scene scene = new Scene(hbox, 500, 400);
		stage.setScene(scene);
		stage.show();

		comboBox.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if (comboBox.getValue().equals("Smiling")) {
					imgView.setImage(img1);
				} else {
					imgView.setImage(img2);
				}
			}
		});
	}
}
