import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Button btn1 =new Button("Button One");
		btn1.setPrefSize(100, 50);
		btn1.setMinWidth(100);
		Button btn2 =new Button("Button Two");
		btn2.setPrefSize(100, 50);
		btn2.setMinWidth(100);
		Button btn3 =new Button("Button Three");
		btn3.setPrefSize(100, 50);
		btn3.setMinWidth(100);
		Button btn4 =new Button("Button Four");
		btn4.setPrefSize(100, 50);
		btn4.setMinWidth(100);
		
		
		
		FlowPane layout=new FlowPane();
		layout.setHgap(10);
		layout.setVgap(10);
		layout.getChildren().addAll(btn1,btn2,btn3,btn4);
		
		Scene scene=new Scene(layout,350,400);
		stage.setScene(scene);
		stage.setTitle("FlowLayout");
		stage.show();
	}
}
