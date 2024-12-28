import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Map<Integer,String>students=new HashMap<>();
		students.put(11, "Aung Aung");
		students.put(12, "Su Su");
		students.put(13,"Thu Thu");
		students.put(14, "Kyaw Kyaw");
		
		//System.out.println(students.get(11));
		Set<Integer>keys= students.keySet();
		for(Integer key:keys){
			System.out.println(key +":"+students.get(key));
		}
	}
}
