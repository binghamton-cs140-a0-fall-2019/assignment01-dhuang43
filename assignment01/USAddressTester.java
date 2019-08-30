package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress streetaddress1 = new StreetUSAddress("112 Main Street", "4th Fl Apt 101B", "New York City", "NY", "11355");
		StreetUSAddress streetaddress2 = new StreetUSAddress("20 Walnut Street", " ", "Binghamton", "NY", "13905");
		
		System.out.println(streetaddress1);
		System.out.println(streetaddress2);
	
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
