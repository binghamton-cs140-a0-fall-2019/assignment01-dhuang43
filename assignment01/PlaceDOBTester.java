package assignment01;
import java.time.LocalDate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth object1 = new DateAndPlaceOfBirth(1999, 3, 18, "New York City", "New York", "USA");
		DateAndPlaceOfBirth object2 = new DateAndPlaceOfBirth(1974, 7, 3, "Georgia", "Atlanta", "USA");
		DateAndPlaceOfBirth object3 = new DateAndPlaceOfBirth(1989, 11, 21, "Las Vagas", "California", "USA");
		DateAndPlaceOfBirth object4 = new DateAndPlaceOfBirth(1999, 3, 18, "GuangZhou", "China");
		DateAndPlaceOfBirth object5 = new DateAndPlaceOfBirth(1990, 7, 3, "Paris", "France");
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		System.out.println(object4);
		System.out.println(object5);

		// olderThan function:
		System.out.println(object2.olderThan(object3)); //olderThan function, Should print True
		System.out.println(object1.olderThan(object3));  //olderThan function, Should print False
		
		// youngerThan function:
		System.out.println(object5.youngerThan(object3)); //youngerThan function, Should print True
		System.out.println(object2.youngerThan(object4));  //youngerThan function, Should print False

		// hasSameBirthDateAs function:
		System.out.println(object1.hasSameBirthDateAs(object4)); //hasSameBirthDateAs function, Should print True
		System.out.println(object3.hasSameBirthDateAs(object5));  //hasSameBirthDateAs function, Should print False
			
		// hasSameBirthDayAs function:
		System.out.println(object2.hasSameBirthDayAs(object5)); // hasSameBirthDayAs function with same months and days but different years, Should print True
		System.out.println(object1.hasSameBirthDayAs(object4));  //hasSameBirthDayAs function with same months and days and same years, Should print True
		System.out.println(object1.hasSameBirthDayAs(object3)); // hasSameBirthDayAs function with different months and days and years, Should print False
		
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
