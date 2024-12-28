import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		MenuBar menubar=new MenuBar();
		Menu file=new Menu("File");
		MenuItem open=new MenuItem("Open");
		MenuItem save=new MenuItem("Save");
		MenuItem exit=new MenuItem("Exit");
		
		Menu window=new Menu("Window");
		Menu show=new Menu("Show");
		CheckMenuItem cmt=new CheckMenuItem("Search Form");
		cmt.setSelected(true);
		
		
		show.getItems().add(cmt);
		window.getItems().add(show);
		
		
				
		
		Menu help=new Menu("Help");
		menubar.getMenus().addAll(file,help,window);
		file.getItems().add(open);
		file.getItems().add(save);
		file.getItems().add(exit);
		
		
		TextArea textArea=new TextArea();
		
		TextField tf=new TextField();
		Button btn=new Button("Button");
		
		HBox hbox=new HBox();
		hbox.setSpacing(15);
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.getChildren().addAll(tf,btn);
		
		BorderPane layout=new BorderPane();
		
		layout.setCenter(textArea);
		layout.setTop(menubar);
		layout.setBottom(hbox);
		
		cmt.setOnAction((e)->{
			if(cmt.isSelected()) {
				layout.setBottom(hbox);
			}
			else {
				layout.getChildren().remove(hbox);
			}
		});
		
		
		Scene scene=new Scene(layout,350,200);
		stage.setScene(scene);
		stage.show();
		
		
		
	}
	
	
}
