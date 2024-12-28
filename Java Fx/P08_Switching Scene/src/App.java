import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 

public class App extends Application{
	 public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage stage) throws Exception {
		
		Label lbl1=new Label("First Page");
		Button btn1=new Button("Go second Scene"); 
		Label lbl2=new Label("Second Page");
		Button btn2=new Button("Go Back");
		
		HBox hbox=new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(10);
		hbox.getChildren().addAll(lbl1,btn1);
		
		VBox vbox=new VBox();
		vbox.setSpacing(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(lbl2,btn2);
		Scene scene1=new Scene(hbox,300,200);
		stage.setScene(scene1);
		stage.show();
		
		Scene scene2=new Scene(vbox,500,400);
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				stage.setScene(scene2);;
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				stage.setScene(scene1);
			}
		});
		
	}

}
