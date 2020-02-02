import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExamples {

	public static void main(String[] args) {
		Date date = new Date();
		
		//01.23.2020 22:14:32
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM.d.yyyy HH:mm:ss");
		System.out.println(sdf1.format(date));
	
		//Thursday 23 January 2020 22:17:54
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss");
		System.out.println(sdf2.format(date));
		
		//Thu, 23 Jan 2020 22:20:46 MSK
		SimpleDateFormat sdf3 = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		System.out.println(sdf3.format(date));
		
		//23 january 2020 Moscow Standard Time
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd MMMM yyyy zzzz");
		System.out.println(sdf4.format(date));
		
		//01.23.2020 10:27 PM (Moscow Standard Time)
		SimpleDateFormat sdf5 = new SimpleDateFormat("MM.d.yyyy h:mm a (zzzz)");
		System.out.println(sdf5.format(date));
		
		//22:30:33 (+03:00)
		SimpleDateFormat sdf6 = new SimpleDateFormat("HH:mm:ss (XXX)");
		System.out.println(sdf6.format(date));
		
		//2020.01.23 n.a. at 22:33:45 MSK
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		System.out.println(sdf7.format(date));
		
		
	}

}
