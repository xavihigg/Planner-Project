import java.io.*;
import java.time.*;
import java.util.Scanner;

public class CreateEvent{
	private String title;
	private String desc;
	private String time;
	private String daily;
	private String category;
	
	public CreateEvent() {
		this.getTitle();
		this.getDesc();
		this.getTime();
		this.getDaily();
		this.getCategory();
	}
	
	public CreateEvent(String title, String desc, String time, String daily, String Category) {
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
	
	public void main(String[] args) {
		//object to get the current month
		MonthDay month = MonthDay.now();
		
		//turn month object into a string and split it into an array
		String str = month.toString();
		String[] date = str.split("-");
		
		//prompt user to select a day to create an event for
		System.out.print("\n\nPick a day to create an event(1-"+Days(date) +"): ");
		Scanner scan = new Scanner(System.in);
		String daySelected = null;
		while(scan.hasNext()) {
			daySelected = scan.next();
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
		while(scan.hasNext()) {
			timeSelected = scan.next();
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
		
		scan.close();
		scan2.close();
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
