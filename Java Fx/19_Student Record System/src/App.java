import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
	RegisterView regView=new RegisterView();
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Database db=new Database();
		db.connect();
		
		StudentList list=new StudentList();
		
		
		Button regBtn=new Button("Register");
		Button stdList=new Button("Student List");
		
		
		
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(regBtn,stdList);
		
		regBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				regView.show();
			}
		});
		
		Scene scene=new Scene(hbox,300,200);
		stage.setScene(scene);
		stage.show();
		
		stdList.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				try {
					list.show();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
	}
}
