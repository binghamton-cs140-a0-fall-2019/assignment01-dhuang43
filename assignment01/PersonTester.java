package assignment01;
import java.time.LocalDate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {
	public static void main(String[] args) {
		StreetUSAddress streetaddress = new StreetUSAddress("20 Walnut Street", " ", "Binghamton", "NY", "13905");
		DateAndPlaceOfBirth object = new DateAndPlaceOfBirth(1999, 3, 18, "New York City", "New York", "USA");
		Person student = new Person ("Jason", "Lee", "123-45-6789", object, streetaddress);
		System.out.println(student);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

