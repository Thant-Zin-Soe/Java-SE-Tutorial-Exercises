import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class App {
	public static void main(String[] args) {
		IntegerProperty val1=new SimpleIntegerProperty();
		IntegerProperty val2=new SimpleIntegerProperty();
		
		val1.set(2);
		val2.set(4);

//		NumberBinding bind=val1.add(val2);
		NumberBinding bind=Bindings.add(val1, val2);
		System.out.println(bind.getValue());
		
		val1.set(10);
		System.out.println(bind.getValue());
		
		val2.set(21);
		System.out.println(bind.getValue());
	}
}
