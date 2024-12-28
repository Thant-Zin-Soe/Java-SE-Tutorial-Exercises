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

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		ComboBox<String> box=new ComboBox<>();
		box.getItems().add("Smile");
		box.getItems().add("Cry");
		box.setValue("Smile");
		
		
		Image img1=new Image("/img/smiling.png");
		Image img2=new Image("/img/crying.png");
		ImageView imgView=new ImageView();
		imgView.setImage(img1);
		
		HBox hbox=new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(20);
		hbox.getChildren().addAll(box,imgView);
		Scene scene=new Scene(hbox,400,300);
		stage.setScene(scene);
		
		stage.show();
		box.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				if(box.getValue().equals("Smile")) {
					imgView.setImage(img1);
				}
				else {
					imgView.setImage(img2);
				}
			}
		});
	}
}
