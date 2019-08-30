package assignment01;

public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate date1 = SimpleDate.of(2017, 3, 21);
		SimpleDate date2 = SimpleDate.of(2017, 3, 20);
		SimpleDate date3 = SimpleDate.of(1999, 11, 21);
		//Testing SimpleDates with same years and months but different days
		System.out.println("2017/3/21 is not before 2017/3/20, Should print false");
		System.out.println(date1.before(date2));
		System.out.println("2017/3/20 is before 2017/3/21, Should print true");
		System.out.println(date2.before(date1));
		//Testing SimpleDates with different years, months, and days
		System.out.println("1999/11/21 is before 2017/3/21, Should print true");
		System.out.println(date3.before(date1));
	}
}
