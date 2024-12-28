
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Button btn1 = new Button("Button One");
		Button btn2 = new Button("Button Two");
		Button btn3 = new Button("Button Three");
		Button btn4 = new Button("Button Four");

		btn1.setMinWidth(100);
		btn2.setMinWidth(100);
		btn3.setMinWidth(100);
		btn4.setMinWidth(100);
		
		btn1.setPrefSize(100, 50);
		btn2.setPrefSize(100, 50);
		btn3.setPrefSize(100, 50);
		btn4.setPrefSize(100, 50);
		
		FlowPane layout = new FlowPane();
		layout.setHgap(10);
		layout.setVgap(10);
		layout.getChildren().addAll(btn1, btn2, btn3, btn4);
		
		Scene scene = new Scene(layout, 300, 200);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Flow Layout");
	}

}
