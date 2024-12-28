import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Reader {

	public void read() throws FileNotFoundException, SQLException{
		int code=check();
		if(code==0){
			throw new FileNotFoundException("File ma shi br");
		}
		if(code==1){
			throw new SQLException("File ma twae br");
		}
	}
	public int check(){
		return 1;
	}
}
