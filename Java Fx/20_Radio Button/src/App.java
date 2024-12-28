import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		
		
		RadioButton male=new RadioButton("Male");
		RadioButton female=new RadioButton("Female");
		RadioButton other=new RadioButton("Other");
		Button save=new Button("Save");
		
		
		ToggleGroup gender=new ToggleGroup();
		male.setToggleGroup(gender);
		female.setToggleGroup(gender);
		other.setToggleGroup(gender);
		male.setSelected(true);
		
		male.setUserData("Male");
		female.setUserData("Female");
		other.setUserData("Other");

		
		VBox vbox=new VBox();
		vbox.setSpacing(10);
		vbox.setPadding(new Insets(0,0,0,30));
		vbox.getChildren().addAll(male,female,other,save);
		
		Scene scene=new Scene(vbox,300,200);
		stage.setScene(scene);
		stage.show();
		save.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				System.out.println(gender.getSelectedToggle().getUserData());
			}
		});
	}
}
