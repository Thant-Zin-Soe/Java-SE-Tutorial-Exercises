

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Label lbl=new Label("My First Java Fx app.");
		
		
		
		StackPane layout=new StackPane();
		layout.getChildren().add(lbl);
		
		
		Scene scene=new Scene(layout,300,200);
		
		stage.setScene(scene);
		stage.show();
	}
}
