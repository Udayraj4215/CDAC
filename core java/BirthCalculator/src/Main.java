import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
public static void main(String[] args) {
	String pattern = "dd/MM/yyyy";
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	String strDate = "14/09/2001";
	try {
		Date date = sdf.parse(strDate);
		System.out.println(date.toString());
	} catch (ParseException e) {
		e.printStackTrace();
	}
}
}
