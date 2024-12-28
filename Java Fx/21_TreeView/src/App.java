import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		
		
		TreeItem<String> uk=new TreeItem<>("UK");
		TreeItem<String> manchaster=new TreeItem<>("Manchaster");
		TreeItem<String> london=new TreeItem<>("London");
		uk.getChildren().addAll(manchaster,london);
		
		TreeItem<String> mm=new TreeItem<>("Myanmar");
		TreeItem<String> mdy=new TreeItem<>("Mandalay");
		TreeItem<String> ygn=new TreeItem<>("Yangon");
		
		mm.getChildren().addAll(mdy,ygn);
		

		TreeItem<String> country=new TreeItem<String>("Country");
		country.getChildren().addAll(uk,mm);
		

		TreeView<String> treeView=new TreeView<>(country);
		treeView.setShowRoot(false);
		
		treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>() {

			
			@Override
			public void changed(ObservableValue<? extends TreeItem<String>> observable, TreeItem<String> oldValue,
					TreeItem<String> newValue) {
				if(oldValue!=null) {
					System.out.println(oldValue.getValue());
				}
				System.out.println(newValue.getValue());
			}
		});
		VBox vbox=new VBox();
		vbox.getChildren().add(treeView);
		
		Scene scene =new Scene(vbox,400,300);
		stage.setScene(scene);
		stage.show();
	
	}
}
