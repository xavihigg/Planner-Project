import java.util.Scanner;

public class Driver{
	public static void main(String[] args) {
		CreateCalendar calendar = new CreateCalendar();
		calendar.main(args);
		
		Scanner scan = new Scanner(System.in);
		String decision = "";
		System.out.print("\n\nWhat would you like to do?"
				+ "\n1: Event."
				+ "\n2: Category."
				+ "\n3: exit"
				+ "\n>> ");
		while(scan.hasNext()) {
			decision = scan.next();
			if(decision.equals("1")) {
				Event event = new Event();
				event.main(args);
			}
			if(decision.equals("2")) {
				Category category = new Category();
				category.main(args);
			}
			if(decision.equals("3")) {
				System.out.print("Logging off..");
				break;
			}
			System.out.print("\n\nWhat would you like to do?"
					+ "\n1: Event."
					+ "\n2: Category."
					+ "\n3: exit"
					+ "\n>> ");
		}
		
		scan.close();
	}
}
