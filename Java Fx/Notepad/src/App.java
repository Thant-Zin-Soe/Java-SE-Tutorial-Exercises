import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class App extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		MenuBar menubar=new MenuBar();
		FileChooser choose =new FileChooser();
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
		
		
		
		BorderPane layout=new BorderPane();
		
		layout.setCenter(textArea);
		layout.setTop(menubar);
		
		
		
		Scene scene=new Scene(layout,600,400);
		stage.setScene(scene);
		stage.show();
		
		//exit item
		exit.setOnAction((e->{
			stage.close();
		}));
		
		//open item
		open.setOnAction((e->{
			File inputFile=choose.showOpenDialog(stage);
			try(BufferedReader br=new BufferedReader(new FileReader(inputFile)) ){
				String line;
				while((line=br.readLine())!= null) {
					textArea.appendText(line+"\n");
				}
				
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}));
		
		//save item
		save.setOnAction((e->{
		File outputFile=	choose.showSaveDialog(stage);
			
		}));
		
	}
	
}
