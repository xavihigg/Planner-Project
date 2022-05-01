import java.io.*;
import java.time.*;
import java.util.Scanner;

public class Event {
	private String title;
	private String desc;
	private String time;
	private String daily;
	private String category;
	
	public Event() {
		this.getTitle();
		this.getDesc();
		this.getTime();
		this.getDaily();
		this.getCategory();
	}
	
	public Event(String title, String desc, String time, String daily, String Category) {
		this.setTitle(title);
		this.setDesc(desc);
		this.setTime(time);
		this.setDaily(daily);
		this.setCategory(Category);
	}
	
	private static int Days(String[] date) {
		int numbOfDays = 0;
		if(date[2].equals("01")) {
			numbOfDays = 31;
		}
		else if(date[2].equals("02")) {
			numbOfDays = 28;
		}
		else if(date[2].equals("03")) {
			numbOfDays = 31;
		}
		else if(date[2].equals("04")) {
			numbOfDays = 30;
		}
		else if(date[2].equals("05")) {
			numbOfDays = 31;
		}
		else if(date[2].equals("06")) {
			numbOfDays = 30;
		}
		else if(date[2].equals("07")) {
			numbOfDays = 31;
		}
		else if(date[2].equals("08")) {
			numbOfDays = 31;
		}
		else if(date[2].equals("09")) {
			numbOfDays = 30;
		}
		else if(date[2].equals("10")) {
			numbOfDays = 31;
		}
		else if(date[2].equals("11")) {
			numbOfDays = 30;
		}
		else if(date[2].equals("12")) {
			numbOfDays = 31;
		}	
		
		return numbOfDays;
	}
	
	private static void DisplayDay(String daySelected) {
		System.out.print("\n___________________________________________________");
		System.out.println("\n|12am\t\t\t\t\t       |"+daySelected +"|");
		System.out.println("|2am\t\t\t\t\t\t  |");
		System.out.println("|4am\t\t\t\t\t\t  |");
		System.out.println("|6am\t\t\t\t\t\t  |");
		System.out.println("|8am\t\t\t\t\t\t  |");
		System.out.println("|10am\t\t\t\t\t\t  |");
		System.out.println("|12pm\t\t\t\t\t\t  |");
		System.out.println("|2pm\t\t\t\t\t\t  |");
		System.out.println("|4pm\t\t\t\t\t\t  |");
		System.out.println("|6pm\t\t\t\t\t\t  |");
		System.out.println("|8pm\t\t\t\t\t\t  |");
		System.out.println("|10pm\t\t\t\t\t\t  |");
		System.out.println("|11pm\t\t\t\t\t\t  |");
		System.out.print("___________________________________________________");
	}
	
	public void createEvent(String timeSelected) {
		String input = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEvent title: ");
		input = scan.nextLine();
		
		String input2 = "";
		Scanner scan2 = new Scanner(System.in);
		System.out.print("\nDescription: ");
		input2 = scan2.nextLine();
		
		String input3 = "";
		Scanner scan3 = new Scanner(System.in);
		System.out.print("\nDuration of event (integer for min): ");
		while(!scan3.hasNextInt()) {
			scan3.next();
			System.out.print("\nDuration of event (integer for min): ");
		}
		input3 = scan3.next();
		
		String input4 = "";
		Scanner scan4 = new Scanner(System.in);
		System.out.print("\nIs this event a daily event? (Y/N): ");
		while(scan4.hasNext()) {
			input4 = scan4.next();
			if(input4.equalsIgnoreCase("Y") || input4.equalsIgnoreCase("N"))
				break;
			System.out.print("\nIs this event a daily event? (Y/N): ");
		}
		
		String input5 = "";
		Scanner scan5 = new Scanner(System.in);
		System.out.print("\nEvent category(optional): ");
		input5 = scan5.nextLine();
		
		CreateEvent description = new CreateEvent(input, input2, input3, input4, input5);

		scan.close();
		scan2.close();
		scan3.close();
		scan4.close();
		scan5.close();
		displayEvent(description, timeSelected);
	}
	
	public void displayEvent(CreateEvent description, String timeSelected) {
		System.out.print("\nEvent Created!");
		System.out.print("\n___________________________________________________");
		System.out.print("\n|Title: " +description.getTitle());
		System.out.print("\n|Description: " +description.getDesc());
		System.out.print("\n|Starting at "+timeSelected +" for " +description.getTime() +" minute(s).");
		System.out.print("\n|Category: " +description.getCategory());
		System.out.print("\n___________________________________________________");
		
		saveEvent(description);
	}
	
	private void saveEvent(CreateEvent description) {
		try {
			File saveEvent = new File("eventList.txt");
			if(!saveEvent.exists())
				saveEvent.createNewFile();
			
			FileWriter fw = new FileWriter(saveEvent.getName(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Title: " +description.getTitle() 
					+", Description: " +description.getDesc() 
					+", Duration: " +description.getTime() +" min(s)"
					+", Category: " +description.getCategory() +"\n");
			bw.close();
		}
		catch(IOException e) {
			System.out.print("Error occured");
			e.printStackTrace();
		}
	}
	
	private void getEventList() {
		try {
			File events = new File("eventList.txt");
			Scanner scan = new Scanner(events);
			String[] data = new String[100];
			int i = 0;
			while(scan.hasNextLine()) {
				data[i] = scan.nextLine();
				System.out.println(i +".. " +data[i]);
				i++;
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void fixInput(String input, Event details, String decision) {
		int fixed = 0;
		if(input.equals("1")) {
			fixed = 1;
		}else if(input.equals("2")) {
			fixed = 2;
		}else if(input.equals("3")) {
			fixed = 3;
		}else if(input.equals("4")) {
			fixed = 4;
		}else if(input.equals("5")) {
			fixed = 5;
		}else if(input.equals("6")) {
			fixed = 6;
		}else if(input.equals("7")) {
			fixed = 7;
		}else if(input.equals("8")) {
			fixed = 8;
		}else if(input.equals("9")) {
			fixed = 9;
		}else if(input.equals("10")) {
			fixed = 10;
		}else if(input.equals("11")) {
			fixed = 11;
		}else if(input.equals("12")) {
			fixed = 12;
		}else if(input.equals("13")) {
			fixed = 13;
		}else if(input.equals("14")) {
			fixed = 14;
		}else if(input.equals("15")) {
			fixed = 15;
		}else if(input.equals("16")) {
			fixed = 16;
		}else if(input.equals("17")) {
			fixed = 17;
		}else if(input.equals("18")) {
			fixed = 18;
		}else if(input.equals("19")) {
			fixed = 19;
		}else if(input.equals("20")) {
			fixed = 20;
		}else if(input.equals("21")) {
			fixed = 21;
		}else if(input.equals("22")) {
			fixed = 22;
		}else if(input.equals("23")) {
			fixed = 23;
		}else if(input.equals("24")) {
			fixed = 24;
		}else if(input.equals("25")) {
			fixed = 25;
		}else if(input.equals("26")) {
			fixed = 26;
		}else if(input.equals("27")) {
			fixed = 27;
		}else if(input.equals("28")) {
			fixed = 28;
		}else if(input.equals("29")) {
			fixed = 29;
		}else if(input.equals("30")) {
			fixed = 30;
		}else if(input.equals("31")) {
			fixed = 31;
		}else if(input.equals("32")) {
			fixed = 32;
		}else if(input.equals("33")) {
			fixed = 33;
		}else if(input.equals("34")) {
			fixed = 34;
		}else if(input.equals("35")) {
			fixed = 35;
		}else if(input.equals("36")) {
			fixed = 36;
		}else if(input.equals("37")) {
			fixed = 37;
		}else if(input.equals("38")) {
			fixed = 38;
		}else if(input.equals("39")) {
			fixed = 39;
		}else if(input.equals("40")) {
			fixed = 40;
		}else if(input.equals("41")) {
			fixed = 41;
		}else if(input.equals("42")) {
			fixed = 42;
		}else if(input.equals("43")) {
			fixed = 43;
		}else if(input.equals("44")) {
			fixed = 44;
		}else if(input.equals("45")) {
			fixed = 45;
		}else if(input.equals("46")) {
			fixed = 46;
		}else if(input.equals("47")) {
			fixed = 47;
		}else if(input.equals("48")) {
			fixed = 48;
		}else if(input.equals("49")) {
			fixed = 49;
		}else if(input.equals("50")) {
			fixed = 50;
		}else if(input.equals("51")) {
			fixed = 51;
		}else if(input.equals("52")) {
			fixed = 52;
		}else if(input.equals("53")) {
			fixed = 53;
		}else if(input.equals("54")) {
			fixed = 54;
		}else if(input.equals("55")) {
			fixed = 55;
		}else if(input.equals("56")) {
			fixed = 56;
		}else if(input.equals("57")) {
			fixed = 57;
		}else if(input.equals("58")) {
			fixed = 58;
		}else if(input.equals("59")) {
			fixed = 59;
		}else if(input.equals("60")) {
			fixed = 60;
		}else if(input.equals("61")) {
			fixed = 61;
		}else if(input.equals("62")) {
			fixed = 62;
		}else if(input.equals("63")) {
			fixed = 63;
		}else if(input.equals("64")) {
			fixed = 64;
		}else if(input.equals("65")) {
			fixed = 65;
		}else if(input.equals("66")) {
			fixed = 66;
		}else if(input.equals("67")) {
			fixed = 67;
		}else if(input.equals("68")) {
			fixed = 68;
		}else if(input.equals("69")) {
			fixed = 69;
		}else if(input.equals("70")) {
			fixed = 70;
		}else if(input.equals("71")) {
			fixed = 71;
		}else if(input.equals("72")) {
			fixed = 72;
		}else if(input.equals("73")) {
			fixed = 73;
		}else if(input.equals("74")) {
			fixed = 74;
		}else if(input.equals("75")) {
			fixed = 75;
		}else if(input.equals("76")) {
			fixed = 76;
		}else if(input.equals("77")) {
			fixed = 77;
		}else if(input.equals("78")) {
			fixed = 78;
		}else if(input.equals("79")) {
			fixed = 79;
		}else if(input.equals("80")) {
			fixed = 80;
		}else if(input.equals("81")) {
			fixed = 81;
		}else if(input.equals("82")) {
			fixed = 82;
		}else if(input.equals("83")) {
			fixed = 83;
		}else if(input.equals("84")) {
			fixed = 84;
		}else if(input.equals("85")) {
			fixed = 85;
		}else if(input.equals("86")) {
			fixed = 86;
		}else if(input.equals("87")) {
			fixed = 87;
		}else if(input.equals("88")) {
			fixed = 88;
		}else if(input.equals("89")) {
			fixed = 89;
		}else if(input.equals("90")) {
			fixed = 90;
		}else if(input.equals("91")) {
			fixed = 91;
		}else if(input.equals("92")) {
			fixed = 92;
		}else if(input.equals("93")) {
			fixed = 93;
		}else if(input.equals("94")) {
			fixed = 94;
		}else if(input.equals("95")) {
			fixed = 95;
		}else if(input.equals("96")) {
			fixed = 96;
		}else if(input.equals("97")) {
			fixed = 97;
		}else if(input.equals("98")) {
			fixed = 98;
		}else if(input.equals("99")) {
			fixed = 99;
		}else if(input.equals("100")) {
			fixed = 100;
		}
		
		if(decision.equalsIgnoreCase("D")) {
			deleteEvent(fixed);
		}
		if(decision.equalsIgnoreCase("E")) {
			editEvent(fixed, details);
		}
		
	}

	private void deleteEvent(int input) {
		try {
			String filename = "eventList.txt";
			Scanner scan = new Scanner(new File(filename));
			String[] data = new String[100];
			int i = 0;
			while(scan.hasNextLine()) {
				data[i] = scan.nextLine();
				i++;
			}

			scan.close();
			
			data[input] = null;
			FileWriter writer = new FileWriter(filename);
			for(int j = 0; j < 100; j++) {
				if(data[j]!= null) {
					writer.append(data[j]);
				}
			}
			writer.flush();
			System.out.print("\nEvent deleted!");
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void eventDetails(String numb, String decision) {
		System.out.println("\nEditing event..");
		
		String input = "";
		Scanner scan1 = new Scanner(System.in);
		System.out.print("\nEvent title: ");
		input = scan1.nextLine();
		
		String input2 = "";
		Scanner scan2 = new Scanner(System.in);
		System.out.print("\nDescription: ");
		input2 = scan2.nextLine();
		
		String input3 = "";
		Scanner scan3 = new Scanner(System.in);
		System.out.print("\nDuration of event (integer for min): ");
		while(!scan3.hasNextInt()) {
			scan3.next();
			System.out.print("\nDuration of event (integer for min): ");
		}
		input3 = scan3.next();
		
		String input4 = "";
		Scanner scan4 = new Scanner(System.in);
		System.out.print("\nIs this event a daily event? (Y/N): ");
		while(scan4.hasNext()) {
			input4 = scan4.next();
			if(input4.equalsIgnoreCase("Y") || input4.equalsIgnoreCase("N"))
				break;
			System.out.print("\nIs this event a daily event? (Y/N): ");
		}
		
		String input5 = "";
		Scanner scan5 = new Scanner(System.in);
		System.out.print("\nEvent category(optional): ");
		input5 = scan5.nextLine();
		
		Event details = new Event(input, input2, input3, input4, input5);
		
		scan1.close();
		scan2.close();
		scan3.close();
		scan4.close();
		scan5.close();
		fixInput(numb, details, decision);
	}

	private void editEvent(int input, Event details) {
		try {
			String filename = "eventList.txt";
			Scanner scan = new Scanner(new File(filename));
			String[] data = new String[100];
			int i = 0;
			while(scan.hasNextLine()) {
				data[i] = scan.nextLine();
				i++;
			}

			scan.close();
			
			String newline = "Title: " +details.getTitle() 
			+", Description: " +details.getDesc() 
			+", Duration: " +details.getTime() +" min(s)"
			+", Category: " +details.getCategory() +"\n";
			
			data[input] = newline;
			FileWriter writer = new FileWriter(filename);
			for(int j = 0; j < 100; j++) {
				if(data[j]!= null) {
					writer.append(data[j]);
				}
			}
			writer.flush();
			
			System.out.print("\nEvent edited!");
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWould you like to create, delete or edit an Event?(C/D/E): ");
		String decision = "";
		while(scan.hasNext()) {
			decision = scan.next();
			if(decision.equalsIgnoreCase("C") || decision.equalsIgnoreCase("D") || decision.equalsIgnoreCase("E"))
				break;
			System.out.print("\nWould you like to create, delete or edit an Event?(C/D/E): ");
		}
		
		if(decision.equalsIgnoreCase("C")) {
			MonthDay month = MonthDay.now();

			String str = month.toString();
			String[] date = str.split("-");
			
			System.out.print("\n\nPick a day to create an event(1-"+Days(date) +"): ");
			Scanner scan1 = new Scanner(System.in);
			String daySelected = null;
			while(scan1.hasNext()) {
				daySelected = scan1.next();
				if(daySelected.equals("1") || daySelected.equals("2") || daySelected.equals("3") ||
						daySelected.equals("4") || daySelected.equals("5") || daySelected.equals("6") ||
						daySelected.equals("7") || daySelected.equals("8") || daySelected.equals("9") ||
						daySelected.equals("10") || daySelected.equals("11") || daySelected.equals("12") ||
						daySelected.equals("13") || daySelected.equals("14") || daySelected.equals("15") ||
						daySelected.equals("16") || daySelected.equals("17") || daySelected.equals("18") ||
						daySelected.equals("19") || daySelected.equals("20") || daySelected.equals("21") ||
						daySelected.equals("22") || daySelected.equals("23") || daySelected.equals("24") ||
						daySelected.equals("25") || daySelected.equals("26") || daySelected.equals("27") ||
						daySelected.equals("28") || daySelected.equals("29") || daySelected.equals("30") ||
						daySelected.equals("31"))
					break;
				System.out.print("\n\nPick a day to create an event(1-"+Days(date) +"): ");
			}
			
			//calls the DisplayDay() method
			DisplayDay(daySelected);
			
			//Prompt user to pick a time slot
			System.out.print("\n\nPick a time slot for you're event(12am-11pm): ");
			Scanner scan2 = new Scanner(System.in);
			String timeSelected = null;
			while(scan2.hasNext()) {
				timeSelected = scan2.next();
				if(timeSelected.equals("12am") || timeSelected.equals("1am") || timeSelected.equals("2am") ||
						timeSelected.equals("3am") || timeSelected.equals("4am") || timeSelected.equals("5am") ||
						timeSelected.equals("6am") || timeSelected.equals("7am") || timeSelected.equals("8am") ||
						timeSelected.equals("9am") || timeSelected.equals("10am") || timeSelected.equals("11am") ||
						timeSelected.equals("12pm") || timeSelected.equals("1pm") || timeSelected.equals("2pm") ||
						timeSelected.equals("3pm") || timeSelected.equals("4pm") || timeSelected.equals("5pm") ||
						timeSelected.equals("6pm") || timeSelected.equals("7pm") || timeSelected.equals("8pm") ||
						timeSelected.equals("9pm") || timeSelected.equals("10pm") || timeSelected.equals("11pm")) {
					break;
				}
				System.out.print("\n\nPick a time slot for you're event(12am-11pm): ");
			}
			
			System.out.print("Creating event for " +timeSelected +": \n");
			//create the event at the time slot
			CreateEvent newEvent = new CreateEvent();
			newEvent.createEvent(timeSelected);
			
			scan1.close();
			scan2.close();
		}
		
		if(decision.equalsIgnoreCase("D")) {
			System.out.println("\nWhich event would you like to delete?(integer)");
			getEventList();
			System.out.print(">> ");
			
			Scanner scan3 = new Scanner(System.in);
			String input = "";
			while(!scan3.hasNextInt()) {
				scan3.next();
				System.out.println("\nWhich event would you like to delete?(integer)");
				getEventList();
				System.out.print(">> ");
			}
			input = scan3.next();
			scan3.close();
			
			Event details = new Event();
			fixInput(input, details, decision);
		}
		
		if(decision.equalsIgnoreCase("E")) {
			System.out.println("\nWhich event would you like to edit?(integer)");
			getEventList();
			System.out.print(">> ");
			
			Scanner scan4 = new Scanner(System.in);
			String input = "";
			while(!scan4.hasNextInt()) {
				scan4.next();
				System.out.println("\nWhich event would you like to edit?(integer)");
				getEventList();
				System.out.print(">> ");
			}
			input = scan4.next();
			
			Event event = new Event();
			event.eventDetails(input, decision);
			
			scan4.close();
		}
		
		scan.close();
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getDaily() {
		return daily;
	}
	
	public void setDaily(String daily) {
		this.daily = daily;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

