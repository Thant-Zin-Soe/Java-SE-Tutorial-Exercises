import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentList {
private 	Database db=new Database();
	private TableView<Students> tbView=new TableView<>();
	public void show() throws SQLException {
		
		tbView.setMaxWidth(480);
		
		TableColumn<Students, String> nameCol=new TableColumn<>("Name");
		TableColumn<Students, String> rollnoCol=new TableColumn<>("Roll no");
		TableColumn<Students, String> phoneCol=new TableColumn<>("Phone");
		TableColumn<Students, String> adressCol=new TableColumn<>("Address");
		
		nameCol.setPrefWidth(120);
		rollnoCol.setPrefWidth(120);
		phoneCol.setPrefWidth(120);
		adressCol.setPrefWidth(120);
		
		
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		rollnoCol.setCellValueFactory(new PropertyValueFactory<>("rollno"));
		phoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
		adressCol.setCellValueFactory(new PropertyValueFactory<>("adress"));
		
		
		tbView.getColumns().add(nameCol);
		tbView.getColumns().add(rollnoCol);
		tbView.getColumns().add(phoneCol);
		tbView.getColumns().add(adressCol);
		Button removeBtn=new Button("Remove");
		
		
		loadData();
		tbView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		HBox hbox=new HBox(removeBtn);
		hbox.setPadding(new Insets(15,15,15,15));
		
		VBox vbox=new VBox();
		vbox.setPadding(new Insets(15,15,15,15));
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(tbView,hbox);
		
		
		removeBtn.setOnAction(new  EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				ObservableList<Students> list= tbView.getSelectionModel().getSelectedItems();
				for(Students sd:list) {
					db.removeData(sd);
				}
				tbView.getItems().removeAll(list);
				
			}
		});

		
		
		Scene scene=new Scene(vbox,500,400);
		Stage stage=new Stage();
		stage.setScene(scene);
		stage.show();
		
				
	}
	public void loadData() {
		
		tbView.getItems().clear();
		
		ResultSet list=db.loadData();
		
		if(list!=null) {
			try {
				while(list.next()) {
					
					String name=list.getString("name");
					String rollno=list.getString("rollno");
					String phone=list.getString("phone");
					String adress=list.getString("adress");					
					tbView.getItems().add(new Students(name,rollno,phone,adress));
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		
	
	
}
