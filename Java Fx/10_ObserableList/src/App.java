import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class App {
	public static void main(String[] args) {
		ObservableList<String> list=FXCollections.observableArrayList();
		
		list.add("Hello");
		list.add("What are you doing");
		
		for(String greet:list) {
			System.out.println(greet);
		}
	}
}
