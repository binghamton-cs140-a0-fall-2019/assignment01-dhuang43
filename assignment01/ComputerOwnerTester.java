package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class ComputerOwnerTester {
	public static void main(String[] args) {

		StreetUSAddress streetaddress = new StreetUSAddress("20 Walnut Street", " ", "Binghamton", "NY", "13905");
		DateAndPlaceOfBirth object = new DateAndPlaceOfBirth(1999, 3, 18, "New York City", "New York", "USA");
		Person student = new Person ("Jason", "Lee", "123-45-6789", object, streetaddress);
		Computer comp1 = new Computer("Lenovo", "Fast", 8, 100, true, 1000.0);
		Computer comp2 = new Computer("Dell", "Moderate", 6, 500, false, 750.0);
		Computer comp3 = new Computer("MacBook", "Fast", 10, 1500, true, 1200.0);
		Computer comp4 = new Computer("Acer", "Moderate", 8, 1200, false, 900.0);
		ComputerOwner owner = new ComputerOwner(student);
		//Adding the 4 computers to owner
		owner.addComputer(comp1);
		owner.addComputer(comp2);
		owner.addComputer(comp3);
		owner.addComputer(comp4);
		System.out.println(owner);
		//Removing 2 Computers from owner
		owner.removeComputer(1);
		owner.removeComputer(2);
		System.out.println(owner);
	}
}
