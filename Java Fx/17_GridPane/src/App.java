
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Text text=new Text("Wellcome to login form.");
		Label name = new Label("Name:");
		Label pass = new Label("Password:");
		TextField nameField = new TextField();
		PasswordField passField = new PasswordField();
		Button loginBtn = new Button("Login");

		GridPane layout = new GridPane();
		layout.setAlignment(Pos.CENTER);
		layout.setHgap(15);
		layout.setVgap(15);
		layout.add(text, 0, 0,2,1);
		layout.add(name, 0, 1);
		layout.add(nameField, 1, 1);
		layout.add(pass, 0, 2);
		layout.add(passField, 1, 2);
		layout.add(loginBtn, 1, 3);
		loginBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				String name=nameField.getText();
				String pass=passField.getText();
				if(name.isEmpty()||pass.isEmpty()) {
					Alert alert=new Alert(AlertType.ERROR);
					alert.setTitle("Input Error");
					alert.setHeaderText(null);
					alert.setContentText("Error");
					//alert.showAndWait();
					alert.show();
					System.out.println("Continue.....");
					return;
				}
				else {
					System.out.println("Nmae:"+name+"  Password:"+pass);
				}
			}
		});
		
		
		Scene scene=new Scene(layout,400,300);
		stage.setScene(scene);

		stage.show();
	}
}
