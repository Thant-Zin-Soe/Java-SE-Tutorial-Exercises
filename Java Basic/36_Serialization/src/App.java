import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class App {
	public static void main(String []args) {
		// TODO Auto-generated method stub
		Person person1=new Person(1,"Su Su");
		Person person2=new Person(2,"Kyaw Kyaw");
		Person person3=new Person(3,"Mg Mg");
		
		Person[]people={person1,person2,person3};
		
		File file=new File("D:\\people1.bin");
		
		try{
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(people);
			 
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
