import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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
		ListView<String> list=new ListView<>();
//		list.getItems().add("Hello");
//		list.getItems().add("How are you");
//		list.getItems().add("What are you doing?");
		TextField input=new TextField();
		Button btn=new Button("Add");
		
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		hbox.getChildren().add(input);
		hbox.getChildren().add(btn);
		hbox.setAlignment(Pos.CENTER);
		
		ObservableList<String> fruit=FXCollections.observableArrayList();
		fruit.add("Banana");
		fruit.add("Apple");
		fruit.add("Orange");
		
		list.getItems().addAll(fruit);
		
		VBox vbox=new VBox();
		vbox.setSpacing(10);
		vbox.setPadding(new Insets(10,10,10,10));
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(hbox,list);
		
		Scene scene=new Scene(vbox,300,200);
		stage.setScene(scene);
		stage.show();
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				list.getItems().add(input.getText());
				input.clear();
			}
		});
	}

}
