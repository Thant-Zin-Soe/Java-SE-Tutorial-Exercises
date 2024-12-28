class Temp<T> {
	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}

public class App {
	public static void main(String[] args) {
			Temp<String> tmp1=new Temp<String>();
			Temp<Integer> tmp2=new Temp<Integer>();
			
			tmp1.setValue("Su Su");
			String name=tmp1.getValue();
			System.out.println("Name:"+name);
			
			tmp2.setValue(23);
			int ID=tmp2.getValue();
			System.out.println("ID:"+ID);
	}
}
