
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage stage) throws Exception {
		
		TextField id=new TextField();
		TextField name=new TextField();
		TextField price=new TextField();
		Button saveBtn=new Button("Save");
		Button deleteBtn=new Button("Delete");
		
		TableView<Product> tableView=new TableView<>();
		tableView.setMaxWidth(360);
		
		TableColumn<Product, String> idCol=new TableColumn<>("Produce ID");
		idCol.setPrefWidth(120);
		TableColumn<Product, String> nameCol=new TableColumn<>("Product Name");
		nameCol.setPrefWidth(120);
		TableColumn<Product, Integer> priceCol=new TableColumn<>("Product Price");
		priceCol.setPrefWidth(120);
		
		tableView.getColumns().add(idCol);
		tableView.getColumns().add(nameCol);
		tableView.getColumns().add(priceCol);
		
		
		idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
		

		tableView.getItems().add(new Product("A001","Laptop",540000));
		tableView.getItems().add(new Product("A002","Tablet",540000));
		tableView.getItems().add(new Product("A003","Phone",540000));
		tableView.getItems().add(new Product("A004","Desktop",540000));
		
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		
		hbox.getChildren().addAll(id,name,price,saveBtn,deleteBtn);
		
		
		VBox vbox=new VBox();
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(hbox,tableView);
		
		saveBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				tableView.getItems().add(new Product(id.getText(),name.getText(),Integer.parseInt(price.getText())));
				id.clear();
				name.clear();
				price.clear();
			}
		});
		
		deleteBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			ObservableList<Product> products=	tableView.getSelectionModel().getSelectedItems();
			tableView.getItems().removeAll(products);
			}
		});
		
		
		Scene scene=new Scene(vbox,700,500);
		stage.setScene(scene);
		stage.setTitle("TableView-Demo");
		stage.show();
		
		
	}

}
