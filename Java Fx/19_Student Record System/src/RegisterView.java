import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegisterView {
	
	Database db=new Database();

	public void show() {
		Label nameLabel=new Label("Name:");
		Label rollnoLabel=new Label("Roll Number");
		Label mobileLabel=new Label("Mobile");
		Label adressLabel=new Label("Adress");
		TextField nameField=new TextField();
		TextField rollnoField=new TextField();
		TextField mobileField=new TextField();
		TextField adressField=new TextField();
		Button saveBtn=new Button("Save");
		Text title=new Text("Wellcome to  the Registeration Form");
		saveBtn.setPrefSize(80, 40);
		
		GridPane layout=new GridPane();
		layout.setAlignment(Pos.CENTER);
		layout.setHgap(10);
		layout.setVgap(10);
		layout.add(title, 0, 0,2,1);
		layout.add(nameLabel, 0, 1);
		layout.add(nameField, 1, 1);
		layout.add(rollnoLabel, 0,2);
		layout.add(rollnoField, 1, 2);
		layout.add(mobileLabel, 0, 3);
		layout.add(mobileField, 1, 3);
		layout.add(adressLabel, 0, 4);
		layout.add(adressField, 1, 4);
		
		layout.add(saveBtn, 1, 5);
		
		Scene scene=new Scene(layout,400,300);
		Stage stage=new Stage();
		stage.setScene(scene);
		
		
		
		stage.show();
		
		saveBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String Name=nameField.getText();
				String RollNo=rollnoField.getText();				
				String Phone=mobileField.getText();
				String Adress=adressField.getText();
				
				
				
				if(Name.isEmpty()||RollNo.isEmpty()||Phone.isEmpty()||Adress.isEmpty()) {
					Alert alert=new Alert(AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("Input Error");
					alert.setContentText("Please fill all field");
					alert.show();
					return;
				}
				else {
					db.insertData(new Students(Name,RollNo,Phone,Adress));
					nameField.clear();
					rollnoField.clear();
					mobileField.clear();
					adressField.clear();
				}
			}
		});
	}
	
}
