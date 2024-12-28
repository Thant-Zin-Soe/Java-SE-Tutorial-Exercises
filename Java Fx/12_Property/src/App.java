import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class App {
	public static void main(String[] args) {
		StringProperty str1=new SimpleStringProperty();
		String fruit=str1.getValue();
		
		
		str1.addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> obj, String oldName, String newName) {
				System.out.println("Oversable Name:"+obj);
				System.out.println("Old Name:"+oldName);
				System.out.println("New Name:"+newName);
				
			}
		});
		
		str1.set("Apple");
		str1.set("Banana");
		
		System.out.println("//////////////////////////////////");
		
		IntegerProperty int1=new SimpleIntegerProperty();
		int number=int1.getValue();
		System.out.println(number);
		
		int1.addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> obj, Number oldName, Number newName) {
				System.out.println("Oversable Name:"+obj);
				System.out.println("Old Name:"+oldName);
				System.out.println("New Name:"+newName);
			}
		});
		
		int1.set(23);
		int1.set(45);
	}
}
