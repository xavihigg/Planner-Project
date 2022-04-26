import java.util.Scanner;

public class Driver{
	public static void main(String[] args) {
		CreateCalendar calendar = new CreateCalendar();
		calendar.main(args);
		
		Scanner scan = new Scanner(System.in);
		String decision = "";
		System.out.print("\n\nWhat would you like to do?"
				+ "\n1: create an event."
				+ "\n2: delete an event."
				+ "\n3: edit an event."
				+ "\n4: create a category."
				+ "\n5: delete a category."
				+ "\n6: exit"
				+ "\n>> ");
		while(scan.hasNext()) {
			decision = scan.next();
			if(decision.equals("1")) {
				CreateEvent event = new CreateEvent();
				event.main(args);
			}
			if(decision.equals("2")) {
				DeleteEvent devent = new DeleteEvent();
				devent.main(args);
			}
			if(decision.equals("3")) {
				EditEvent edits = new EditEvent();
				edits.main(args);
			}
			if(decision.equals("4")) {
				CreateCategory category = new CreateCategory();
				category.main(args);
			}
			if(decision.equals("5")) {
				DeleteCategory dcategory = new DeleteCategory();
				dcategory.main(args);
			}
			if(decision.equals("6")) {
				System.out.print("Logging off..");
				break;
			}
			System.out.print("\n\nWhat would you like to do?"
					+ "\n1: create an event."
					+ "\n2: delete an event."
					+ "\n3: edit an event."
					+ "\n4: create a category."
					+ "\n5: delete a category."
					+ "\n6: exit"
					+ "\n>> ");
		}
		
		scan.close();
	}
}
