package com.planner.Model;

import java.time.*;
import java.util.*;
import com.planner.Model.*;

public class Event {
	private String title;
	private String desc;
	private String time;
	private String daily;
	private Category category;
	
	public Event() {
		
	}
	
	public Event(String title, String desc, String time, String daily) {
		this.setTitle(title);
		this.setDesc(desc);
		this.setTime(time);
		this.setDaily(daily);
	}
	
	public Event(String title, String desc, String time, String daily, Category Category) {
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
	
	public void createEvent(String timeSelected, String daySelected, String date, Calendar calendar) {
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
		System.out.print("\nDoes this event have a category?(Y/N): ");
		while(scan5.hasNext()) {
			input5 = scan5.next();
			if(input5.equalsIgnoreCase("Y") || input5.equalsIgnoreCase("N"))
				break;
			System.out.print("\nDoes this event have a category?(Y/N): ");
		}
		
		Event description = new Event();
		if(input5.equalsIgnoreCase("Y")) {
			Category category = new Category();
			description = new Event(input, input2, input3, input4, category);
		}
		if(input5.equalsIgnoreCase("N")) {
			description = new Event(input, input2, input3, input4);
		}
		
		if(date.equals("01")) {
			if(daySelected.equals("1"))
				calendar.january.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.january.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.january.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.january.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.january.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.january.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.january.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.january.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.january.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.january.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.january.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.january.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.january.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.january.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.january.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.january.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.january.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.january.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.january.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.january.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.january.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.january.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.january.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.january.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.january.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.january.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.january.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.january.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.january.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.january.get(30).add(description);
			if(daySelected.equals("31"))
				calendar.january.get(31).add(description);
		}
		if(date.equals("02")) {
			if(daySelected.equals("1"))
				calendar.feburary.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.feburary.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.feburary.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.feburary.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.feburary.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.feburary.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.feburary.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.feburary.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.feburary.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.feburary.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.feburary.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.feburary.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.feburary.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.feburary.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.feburary.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.feburary.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.feburary.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.feburary.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.feburary.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.feburary.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.feburary.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.feburary.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.feburary.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.feburary.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.feburary.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.feburary.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.feburary.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.feburary.get(28).add(description);
		}
		if(date.equals("03")) {
			if(daySelected.equals("1"))
				calendar.march.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.march.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.march.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.march.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.march.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.march.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.march.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.march.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.march.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.march.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.march.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.march.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.march.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.march.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.march.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.march.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.march.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.march.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.march.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.march.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.march.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.march.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.march.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.march.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.march.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.march.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.march.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.march.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.march.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.march.get(30).add(description);
			if(daySelected.equals("31"))
				calendar.march.get(31).add(description);
		}
		if(date.equals("04")) {
			if(daySelected.equals("1"))
				calendar.april.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.april.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.april.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.april.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.april.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.april.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.april.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.april.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.april.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.april.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.april.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.april.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.april.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.april.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.april.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.april.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.april.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.april.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.april.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.april.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.april.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.april.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.april.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.april.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.april.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.april.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.april.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.april.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.april.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.april.get(30).add(description);
		}
		if(date.equals("05")) {
			if(daySelected.equals("1"))
				calendar.may.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.may.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.may.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.may.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.may.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.may.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.may.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.may.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.may.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.may.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.may.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.may.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.may.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.may.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.may.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.may.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.may.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.may.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.may.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.may.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.may.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.may.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.may.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.may.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.may.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.may.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.may.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.may.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.may.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.may.get(30).add(description);
			if(daySelected.equals("31"))
				calendar.may.get(31).add(description);
		}
		if(date.equals("06")) {
			if(daySelected.equals("1"))
				calendar.june.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.june.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.june.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.june.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.june.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.june.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.june.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.june.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.june.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.june.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.june.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.june.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.june.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.june.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.june.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.june.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.june.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.june.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.june.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.june.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.june.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.june.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.june.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.june.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.june.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.june.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.june.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.june.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.june.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.june.get(30).add(description);
		}
		if(date.equals("07")) {
			if(daySelected.equals("1"))
				calendar.july.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.july.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.july.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.july.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.july.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.july.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.july.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.july.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.july.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.july.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.july.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.july.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.july.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.july.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.july.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.july.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.july.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.july.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.july.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.july.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.july.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.july.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.july.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.july.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.july.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.july.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.july.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.july.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.july.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.july.get(30).add(description);
			if(daySelected.equals("31"))
				calendar.july.get(31).add(description);
		}
		if(date.equals("08")) {
			if(daySelected.equals("1"))
				calendar.august.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.august.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.august.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.august.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.august.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.august.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.august.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.august.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.august.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.august.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.august.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.august.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.august.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.august.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.august.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.august.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.august.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.august.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.august.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.august.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.august.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.august.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.august.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.august.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.august.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.august.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.august.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.august.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.august.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.august.get(30).add(description);
			if(daySelected.equals("31"))
				calendar.august.get(31).add(description);
		}
		if(date.equals("09")) {
			if(daySelected.equals("1"))
				calendar.september.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.september.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.september.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.september.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.september.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.september.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.september.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.september.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.september.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.september.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.september.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.september.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.september.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.september.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.september.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.september.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.september.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.september.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.september.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.september.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.september.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.september.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.september.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.september.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.september.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.september.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.september.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.september.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.september.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.september.get(30).add(description);
		}
		if(date.equals("10")) {
			if(daySelected.equals("1"))
				calendar.october.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.october.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.october.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.october.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.october.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.october.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.october.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.october.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.october.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.october.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.october.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.october.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.october.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.october.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.october.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.october.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.october.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.october.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.october.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.october.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.october.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.october.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.october.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.october.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.october.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.october.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.october.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.october.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.october.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.october.get(30).add(description);
			if(daySelected.equals("31"))
				calendar.october.get(31).add(description);
		}
		if(date.equals("11")) {
			if(daySelected.equals("1"))
				calendar.november.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.november.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.november.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.november.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.november.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.november.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.november.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.november.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.november.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.november.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.november.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.november.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.november.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.november.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.november.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.november.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.november.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.november.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.november.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.november.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.november.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.november.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.november.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.november.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.november.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.november.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.november.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.november.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.november.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.november.get(30).add(description);
		}
		if(date.equals("12")) {
			if(daySelected.equals("1"))
				calendar.december.get(1).add(description);
			if(daySelected.equals("2"))
				calendar.december.get(2).add(description);
			if(daySelected.equals("3"))
				calendar.december.get(3).add(description);
			if(daySelected.equals("4"))
				calendar.december.get(4).add(description);
			if(daySelected.equals("5"))
				calendar.december.get(5).add(description);
			if(daySelected.equals("6"))
				calendar.december.get(6).add(description);
			if(daySelected.equals("7"))
				calendar.december.get(7).add(description);
			if(daySelected.equals("8"))
				calendar.december.get(8).add(description);
			if(daySelected.equals("9"))
				calendar.december.get(9).add(description);
			if(daySelected.equals("10"))
				calendar.december.get(10).add(description);
			if(daySelected.equals("11"))
				calendar.december.get(11).add(description);
			if(daySelected.equals("12"))
				calendar.december.get(12).add(description);
			if(daySelected.equals("13"))
				calendar.december.get(13).add(description);
			if(daySelected.equals("14"))
				calendar.december.get(14).add(description);
			if(daySelected.equals("15"))
				calendar.december.get(15).add(description);
			if(daySelected.equals("16"))
				calendar.december.get(16).add(description);
			if(daySelected.equals("17"))
				calendar.december.get(17).add(description);
			if(daySelected.equals("18"))
				calendar.december.get(18).add(description);
			if(daySelected.equals("19"))
				calendar.december.get(19).add(description);
			if(daySelected.equals("20"))
				calendar.december.get(20).add(description);
			if(daySelected.equals("21"))
				calendar.december.get(21).add(description);
			if(daySelected.equals("22"))
				calendar.december.get(22).add(description);
			if(daySelected.equals("23"))
				calendar.december.get(23).add(description);
			if(daySelected.equals("24"))
				calendar.december.get(24).add(description);
			if(daySelected.equals("25"))
				calendar.december.get(25).add(description);
			if(daySelected.equals("26"))
				calendar.december.get(26).add(description);
			if(daySelected.equals("27"))
				calendar.december.get(27).add(description);
			if(daySelected.equals("28"))
				calendar.december.get(28).add(description);
			if(daySelected.equals("29"))
				calendar.december.get(29).add(description);
			if(daySelected.equals("30"))
				calendar.december.get(30).add(description);
			if(daySelected.equals("31"))
				calendar.december.get(31).add(description);
		}
		
		scan.close();
		scan2.close();
		scan3.close();
		scan4.close();
		scan5.close();
		displayEvent(description, timeSelected);
	}
	
	public void displayEvent(Event description, String timeSelected) {
		System.out.print("\nEvent Created!");
		System.out.print("\n___________________________________________________");
		System.out.print("\n|Title: " +description.getTitle());
		System.out.print("\n|Description: " +description.getDesc());
		System.out.print("\n|Starting at "+timeSelected +" for " +description.getTime() +" minute(s).");
		System.out.print("\n|Category: " +description.getCategory());
		System.out.print("\n___________________________________________________");
	}

	private void getEvents(Calendar calendar, String date, String daySelected) {
		if(date.equals("1")) {
			if(daySelected.equals("1"))
				calendar.january.get(1);
			if(daySelected.equals("2"))
				calendar.january.get(2);
			if(daySelected.equals("3"))
				calendar.january.get(3);
			if(daySelected.equals("4"))
				calendar.january.get(4);
			if(daySelected.equals("5"))
				calendar.january.get(5);
			if(daySelected.equals("6"))
				calendar.january.get(6);
			if(daySelected.equals("7"))
				calendar.january.get(7);
			if(daySelected.equals("8"))
				calendar.january.get(8);
			if(daySelected.equals("9"))
				calendar.january.get(9);
			if(daySelected.equals("10"))
				calendar.january.get(10);
			if(daySelected.equals("11"))
				calendar.january.get(11);
			if(daySelected.equals("12"))
				calendar.january.get(12);
			if(daySelected.equals("13"))
				calendar.january.get(13);
			if(daySelected.equals("14"))
				calendar.january.get(14);
			if(daySelected.equals("15"))
				calendar.january.get(15);
			if(daySelected.equals("16"))
				calendar.january.get(16);
			if(daySelected.equals("17"))
				calendar.january.get(17);
			if(daySelected.equals("18"))
				calendar.january.get(18);
			if(daySelected.equals("19"))
				calendar.january.get(19);
			if(daySelected.equals("20"))
				calendar.january.get(20);
			if(daySelected.equals("21"))
				calendar.january.get(21);
			if(daySelected.equals("22"))
				calendar.january.get(22);
			if(daySelected.equals("23"))
				calendar.january.get(23);
			if(daySelected.equals("24"))
				calendar.january.get(24);
			if(daySelected.equals("25"))
				calendar.january.get(25);
			if(daySelected.equals("26"))
				calendar.january.get(26);
			if(daySelected.equals("27"))
				calendar.january.get(27);
			if(daySelected.equals("28"))
				calendar.january.get(28);
			if(daySelected.equals("29"))
				calendar.january.get(29);
			if(daySelected.equals("30"))
				calendar.january.get(30);
			if(daySelected.equals("31"))
				calendar.january.get(31);
		}
		if(date.equals("2")) {
			if(daySelected.equals("1"))
				calendar.feburary.get(1);
			if(daySelected.equals("2"))
				calendar.feburary.get(2);
			if(daySelected.equals("3"))
				calendar.feburary.get(3);
			if(daySelected.equals("4"))
				calendar.feburary.get(4);
			if(daySelected.equals("5"))
				calendar.feburary.get(5);
			if(daySelected.equals("6"))
				calendar.feburary.get(6);
			if(daySelected.equals("7"))
				calendar.feburary.get(7);
			if(daySelected.equals("8"))
				calendar.feburary.get(8);
			if(daySelected.equals("9"))
				calendar.feburary.get(9);
			if(daySelected.equals("10"))
				calendar.feburary.get(10);
			if(daySelected.equals("11"))
				calendar.feburary.get(11);
			if(daySelected.equals("12"))
				calendar.feburary.get(12);
			if(daySelected.equals("13"))
				calendar.feburary.get(13);
			if(daySelected.equals("14"))
				calendar.feburary.get(14);
			if(daySelected.equals("15"))
				calendar.feburary.get(15);
			if(daySelected.equals("16"))
				calendar.feburary.get(16);
			if(daySelected.equals("17"))
				calendar.feburary.get(17);
			if(daySelected.equals("18"))
				calendar.feburary.get(18);
			if(daySelected.equals("19"))
				calendar.feburary.get(19);
			if(daySelected.equals("20"))
				calendar.feburary.get(20);
			if(daySelected.equals("21"))
				calendar.feburary.get(21);
			if(daySelected.equals("22"))
				calendar.feburary.get(22);
			if(daySelected.equals("23"))
				calendar.feburary.get(23);
			if(daySelected.equals("24"))
				calendar.feburary.get(24);
			if(daySelected.equals("25"))
				calendar.feburary.get(25);
			if(daySelected.equals("26"))
				calendar.feburary.get(26);
			if(daySelected.equals("27"))
				calendar.feburary.get(27);
			if(daySelected.equals("28"))
				calendar.feburary.get(28);
		}
		if(date.equals("3")) {
			if(daySelected.equals("1"))
				calendar.march.get(1);
			if(daySelected.equals("2"))
				calendar.march.get(2);
			if(daySelected.equals("3"))
				calendar.march.get(3);
			if(daySelected.equals("4"))
				calendar.march.get(4);
			if(daySelected.equals("5"))
				calendar.march.get(5);
			if(daySelected.equals("6"))
				calendar.march.get(6);
			if(daySelected.equals("7"))
				calendar.march.get(7);
			if(daySelected.equals("8"))
				calendar.march.get(8);
			if(daySelected.equals("9"))
				calendar.march.get(9);
			if(daySelected.equals("10"))
				calendar.march.get(10);
			if(daySelected.equals("11"))
				calendar.march.get(11);
			if(daySelected.equals("12"))
				calendar.march.get(12);
			if(daySelected.equals("13"))
				calendar.march.get(13);
			if(daySelected.equals("14"))
				calendar.march.get(14);
			if(daySelected.equals("15"))
				calendar.march.get(15);
			if(daySelected.equals("16"))
				calendar.march.get(16);
			if(daySelected.equals("17"))
				calendar.march.get(17);
			if(daySelected.equals("18"))
				calendar.march.get(18);
			if(daySelected.equals("19"))
				calendar.march.get(19);
			if(daySelected.equals("20"))
				calendar.march.get(20);
			if(daySelected.equals("21"))
				calendar.march.get(21);
			if(daySelected.equals("22"))
				calendar.march.get(22);
			if(daySelected.equals("23"))
				calendar.march.get(23);
			if(daySelected.equals("24"))
				calendar.march.get(24);
			if(daySelected.equals("25"))
				calendar.march.get(25);
			if(daySelected.equals("26"))
				calendar.march.get(26);
			if(daySelected.equals("27"))
				calendar.march.get(27);
			if(daySelected.equals("28"))
				calendar.march.get(28);
			if(daySelected.equals("29"))
				calendar.march.get(29);
			if(daySelected.equals("30"))
				calendar.march.get(30);
			if(daySelected.equals("31"))
				calendar.march.get(31);
		}
		if(date.equals("4")) {
			if(daySelected.equals("1"))
				calendar.april.get(1);
			if(daySelected.equals("2"))
				calendar.april.get(2);
			if(daySelected.equals("3"))
				calendar.april.get(3);
			if(daySelected.equals("4"))
				calendar.april.get(4);
			if(daySelected.equals("5"))
				calendar.april.get(5);
			if(daySelected.equals("6"))
				calendar.april.get(6);
			if(daySelected.equals("7"))
				calendar.april.get(7);
			if(daySelected.equals("8"))
				calendar.april.get(8);
			if(daySelected.equals("9"))
				calendar.april.get(9);
			if(daySelected.equals("10"))
				calendar.april.get(10);
			if(daySelected.equals("11"))
				calendar.april.get(11);
			if(daySelected.equals("12"))
				calendar.april.get(12);
			if(daySelected.equals("13"))
				calendar.april.get(13);
			if(daySelected.equals("14"))
				calendar.april.get(14);
			if(daySelected.equals("15"))
				calendar.april.get(15);
			if(daySelected.equals("16"))
				calendar.april.get(16);
			if(daySelected.equals("17"))
				calendar.april.get(17);
			if(daySelected.equals("18"))
				calendar.april.get(18);
			if(daySelected.equals("19"))
				calendar.april.get(19);
			if(daySelected.equals("20"))
				calendar.april.get(20);
			if(daySelected.equals("21"))
				calendar.april.get(21);
			if(daySelected.equals("22"))
				calendar.april.get(22);
			if(daySelected.equals("23"))
				calendar.april.get(23);
			if(daySelected.equals("24"))
				calendar.april.get(24);
			if(daySelected.equals("25"))
				calendar.april.get(25);
			if(daySelected.equals("26"))
				calendar.april.get(26);
			if(daySelected.equals("27"))
				calendar.april.get(27);
			if(daySelected.equals("28"))
				calendar.april.get(28);
			if(daySelected.equals("29"))
				calendar.april.get(29);
			if(daySelected.equals("30"))
				calendar.april.get(30);
		}
		if(date.equals("5")) {
			if(daySelected.equals("1"))
				calendar.may.get(1);
			if(daySelected.equals("2"))
				calendar.may.get(2);
			if(daySelected.equals("3"))
				calendar.may.get(3);
			if(daySelected.equals("4"))
				calendar.may.get(4);
			if(daySelected.equals("5"))
				calendar.may.get(5);
			if(daySelected.equals("6"))
				calendar.may.get(6);
			if(daySelected.equals("7"))
				calendar.may.get(7);
			if(daySelected.equals("8"))
				calendar.may.get(8);
			if(daySelected.equals("9"))
				calendar.may.get(9);
			if(daySelected.equals("10"))
				calendar.may.get(10);
			if(daySelected.equals("11"))
				calendar.may.get(11);
			if(daySelected.equals("12"))
				calendar.may.get(12);
			if(daySelected.equals("13"))
				calendar.may.get(13);
			if(daySelected.equals("14"))
				calendar.may.get(14);
			if(daySelected.equals("15"))
				calendar.may.get(15);
			if(daySelected.equals("16"))
				calendar.may.get(16);
			if(daySelected.equals("17"))
				calendar.may.get(17);
			if(daySelected.equals("18"))
				calendar.may.get(18);
			if(daySelected.equals("19"))
				calendar.may.get(19);
			if(daySelected.equals("20"))
				calendar.may.get(20);
			if(daySelected.equals("21"))
				calendar.may.get(21);
			if(daySelected.equals("22"))
				calendar.may.get(22);
			if(daySelected.equals("23"))
				calendar.may.get(23);
			if(daySelected.equals("24"))
				calendar.may.get(24);
			if(daySelected.equals("25"))
				calendar.may.get(25);
			if(daySelected.equals("26"))
				calendar.may.get(26);
			if(daySelected.equals("27"))
				calendar.may.get(27);
			if(daySelected.equals("28"))
				calendar.may.get(28);
			if(daySelected.equals("29"))
				calendar.may.get(29);
			if(daySelected.equals("30"))
				calendar.may.get(30);
			if(daySelected.equals("31"))
				calendar.may.get(31);
		}
		if(date.equals("6")) {
			if(daySelected.equals("1"))
				calendar.june.get(1);
			if(daySelected.equals("2"))
				calendar.june.get(2);
			if(daySelected.equals("3"))
				calendar.june.get(3);
			if(daySelected.equals("4"))
				calendar.june.get(4);
			if(daySelected.equals("5"))
				calendar.june.get(5);
			if(daySelected.equals("6"))
				calendar.june.get(6);
			if(daySelected.equals("7"))
				calendar.june.get(7);
			if(daySelected.equals("8"))
				calendar.june.get(8);
			if(daySelected.equals("9"))
				calendar.june.get(9);
			if(daySelected.equals("10"))
				calendar.june.get(10);
			if(daySelected.equals("11"))
				calendar.june.get(11);
			if(daySelected.equals("12"))
				calendar.june.get(12);
			if(daySelected.equals("13"))
				calendar.june.get(13);
			if(daySelected.equals("14"))
				calendar.june.get(14);
			if(daySelected.equals("15"))
				calendar.june.get(15);
			if(daySelected.equals("16"))
				calendar.june.get(16);
			if(daySelected.equals("17"))
				calendar.june.get(17);
			if(daySelected.equals("18"))
				calendar.june.get(18);
			if(daySelected.equals("19"))
				calendar.june.get(19);
			if(daySelected.equals("20"))
				calendar.june.get(20);
			if(daySelected.equals("21"))
				calendar.june.get(21);
			if(daySelected.equals("22"))
				calendar.june.get(22);
			if(daySelected.equals("23"))
				calendar.june.get(23);
			if(daySelected.equals("24"))
				calendar.june.get(24);
			if(daySelected.equals("25"))
				calendar.june.get(25);
			if(daySelected.equals("26"))
				calendar.june.get(26);
			if(daySelected.equals("27"))
				calendar.june.get(27);
			if(daySelected.equals("28"))
				calendar.june.get(28);
			if(daySelected.equals("29"))
				calendar.june.get(29);
			if(daySelected.equals("30"))
				calendar.june.get(30);
		}
		if(date.equals("7")) {
			if(daySelected.equals("1"))
				calendar.july.get(1);
			if(daySelected.equals("2"))
				calendar.july.get(2);
			if(daySelected.equals("3"))
				calendar.july.get(3);
			if(daySelected.equals("4"))
				calendar.july.get(4);
			if(daySelected.equals("5"))
				calendar.july.get(5);
			if(daySelected.equals("6"))
				calendar.july.get(6);
			if(daySelected.equals("7"))
				calendar.july.get(7);
			if(daySelected.equals("8"))
				calendar.july.get(8);
			if(daySelected.equals("9"))
				calendar.july.get(9);
			if(daySelected.equals("10"))
				calendar.july.get(10);
			if(daySelected.equals("11"))
				calendar.july.get(11);
			if(daySelected.equals("12"))
				calendar.july.get(12);
			if(daySelected.equals("13"))
				calendar.july.get(13);
			if(daySelected.equals("14"))
				calendar.july.get(14);
			if(daySelected.equals("15"))
				calendar.july.get(15);
			if(daySelected.equals("16"))
				calendar.july.get(16);
			if(daySelected.equals("17"))
				calendar.july.get(17);
			if(daySelected.equals("18"))
				calendar.july.get(18);
			if(daySelected.equals("19"))
				calendar.july.get(19);
			if(daySelected.equals("20"))
				calendar.july.get(20);
			if(daySelected.equals("21"))
				calendar.july.get(21);
			if(daySelected.equals("22"))
				calendar.july.get(22);
			if(daySelected.equals("23"))
				calendar.july.get(23);
			if(daySelected.equals("24"))
				calendar.july.get(24);
			if(daySelected.equals("25"))
				calendar.july.get(25);
			if(daySelected.equals("26"))
				calendar.july.get(26);
			if(daySelected.equals("27"))
				calendar.july.get(27);
			if(daySelected.equals("28"))
				calendar.july.get(28);
			if(daySelected.equals("29"))
				calendar.july.get(29);
			if(daySelected.equals("30"))
				calendar.july.get(30);
			if(daySelected.equals("31"))
				calendar.july.get(31);
		}
		if(date.equals("8")) {
			if(daySelected.equals("1"))
				calendar.august.get(1);
			if(daySelected.equals("2"))
				calendar.august.get(2);
			if(daySelected.equals("3"))
				calendar.august.get(3);
			if(daySelected.equals("4"))
				calendar.august.get(4);
			if(daySelected.equals("5"))
				calendar.august.get(5);
			if(daySelected.equals("6"))
				calendar.august.get(6);
			if(daySelected.equals("7"))
				calendar.august.get(7);
			if(daySelected.equals("8"))
				calendar.august.get(8);
			if(daySelected.equals("9"))
				calendar.august.get(9);
			if(daySelected.equals("10"))
				calendar.august.get(10);
			if(daySelected.equals("11"))
				calendar.august.get(11);
			if(daySelected.equals("12"))
				calendar.august.get(12);
			if(daySelected.equals("13"))
				calendar.august.get(13);
			if(daySelected.equals("14"))
				calendar.august.get(14);
			if(daySelected.equals("15"))
				calendar.august.get(15);
			if(daySelected.equals("16"))
				calendar.august.get(16);
			if(daySelected.equals("17"))
				calendar.august.get(17);
			if(daySelected.equals("18"))
				calendar.august.get(18);
			if(daySelected.equals("19"))
				calendar.august.get(19);
			if(daySelected.equals("20"))
				calendar.august.get(20);
			if(daySelected.equals("21"))
				calendar.august.get(21);
			if(daySelected.equals("22"))
				calendar.august.get(22);
			if(daySelected.equals("23"))
				calendar.august.get(23);
			if(daySelected.equals("24"))
				calendar.august.get(24);
			if(daySelected.equals("25"))
				calendar.august.get(25);
			if(daySelected.equals("26"))
				calendar.august.get(26);
			if(daySelected.equals("27"))
				calendar.august.get(27);
			if(daySelected.equals("28"))
				calendar.august.get(28);
			if(daySelected.equals("29"))
				calendar.august.get(29);
			if(daySelected.equals("30"))
				calendar.august.get(30);
			if(daySelected.equals("31"))
				calendar.august.get(31);
		}
		if(date.equals("9")) {
			if(daySelected.equals("1"))
				calendar.september.get(1);
			if(daySelected.equals("2"))
				calendar.september.get(2);
			if(daySelected.equals("3"))
				calendar.september.get(3);
			if(daySelected.equals("4"))
				calendar.september.get(4);
			if(daySelected.equals("5"))
				calendar.september.get(5);
			if(daySelected.equals("6"))
				calendar.september.get(6);
			if(daySelected.equals("7"))
				calendar.september.get(7);
			if(daySelected.equals("8"))
				calendar.september.get(8);
			if(daySelected.equals("9"))
				calendar.september.get(9);
			if(daySelected.equals("10"))
				calendar.september.get(10);
			if(daySelected.equals("11"))
				calendar.september.get(11);
			if(daySelected.equals("12"))
				calendar.september.get(12);
			if(daySelected.equals("13"))
				calendar.september.get(13);
			if(daySelected.equals("14"))
				calendar.september.get(14);
			if(daySelected.equals("15"))
				calendar.september.get(15);
			if(daySelected.equals("16"))
				calendar.september.get(16);
			if(daySelected.equals("17"))
				calendar.september.get(17);
			if(daySelected.equals("18"))
				calendar.september.get(18);
			if(daySelected.equals("19"))
				calendar.september.get(19);
			if(daySelected.equals("20"))
				calendar.september.get(20);
			if(daySelected.equals("21"))
				calendar.september.get(21);
			if(daySelected.equals("22"))
				calendar.september.get(22);
			if(daySelected.equals("23"))
				calendar.september.get(23);
			if(daySelected.equals("24"))
				calendar.september.get(24);
			if(daySelected.equals("25"))
				calendar.september.get(25);
			if(daySelected.equals("26"))
				calendar.september.get(26);
			if(daySelected.equals("27"))
				calendar.september.get(27);
			if(daySelected.equals("28"))
				calendar.september.get(28);
			if(daySelected.equals("29"))
				calendar.september.get(29);
			if(daySelected.equals("30"))
				calendar.september.get(30);
		}
		if(date.equals("10")) {
			if(daySelected.equals("1"))
				calendar.october.get(1);
			if(daySelected.equals("2"))
				calendar.october.get(2);
			if(daySelected.equals("3"))
				calendar.october.get(3);
			if(daySelected.equals("4"))
				calendar.october.get(4);
			if(daySelected.equals("5"))
				calendar.october.get(5);
			if(daySelected.equals("6"))
				calendar.october.get(6);
			if(daySelected.equals("7"))
				calendar.october.get(7);
			if(daySelected.equals("8"))
				calendar.october.get(8);
			if(daySelected.equals("9"))
				calendar.october.get(9);
			if(daySelected.equals("10"))
				calendar.october.get(10);
			if(daySelected.equals("11"))
				calendar.october.get(11);
			if(daySelected.equals("12"))
				calendar.october.get(12);
			if(daySelected.equals("13"))
				calendar.october.get(13);
			if(daySelected.equals("14"))
				calendar.october.get(14);
			if(daySelected.equals("15"))
				calendar.october.get(15);
			if(daySelected.equals("16"))
				calendar.october.get(16);
			if(daySelected.equals("17"))
				calendar.october.get(17);
			if(daySelected.equals("18"))
				calendar.october.get(18);
			if(daySelected.equals("19"))
				calendar.october.get(19);
			if(daySelected.equals("20"))
				calendar.october.get(20);
			if(daySelected.equals("21"))
				calendar.october.get(21);
			if(daySelected.equals("22"))
				calendar.october.get(22);
			if(daySelected.equals("23"))
				calendar.october.get(23);
			if(daySelected.equals("24"))
				calendar.october.get(24);
			if(daySelected.equals("25"))
				calendar.october.get(25);
			if(daySelected.equals("26"))
				calendar.october.get(26);
			if(daySelected.equals("27"))
				calendar.october.get(27);
			if(daySelected.equals("28"))
				calendar.october.get(28);
			if(daySelected.equals("29"))
				calendar.october.get(29);
			if(daySelected.equals("30"))
				calendar.october.get(30);
			if(daySelected.equals("31"))
				calendar.october.get(31);
		}
		if(date.equals("11")) {
			if(daySelected.equals("1"))
				calendar.november.get(1);
			if(daySelected.equals("2"))
				calendar.november.get(2);
			if(daySelected.equals("3"))
				calendar.november.get(3);
			if(daySelected.equals("4"))
				calendar.november.get(4);
			if(daySelected.equals("5"))
				calendar.november.get(5);
			if(daySelected.equals("6"))
				calendar.november.get(6);
			if(daySelected.equals("7"))
				calendar.november.get(7);
			if(daySelected.equals("8"))
				calendar.november.get(8);
			if(daySelected.equals("9"))
				calendar.november.get(9); 
			if(daySelected.equals("10"))
				calendar.november.get(10);
			if(daySelected.equals("11"))
				calendar.november.get(11);
			if(daySelected.equals("12"))
				calendar.november.get(12);
			if(daySelected.equals("13"))
				calendar.november.get(13);
			if(daySelected.equals("14"))
				calendar.november.get(14);
			if(daySelected.equals("15"))
				calendar.november.get(15);
			if(daySelected.equals("16"))
				calendar.november.get(16);
			if(daySelected.equals("17"))
				calendar.november.get(17);
			if(daySelected.equals("18"))
				calendar.november.get(18);
			if(daySelected.equals("19"))
				calendar.november.get(19);
			if(daySelected.equals("20"))
				calendar.november.get(20);
			if(daySelected.equals("21"))
				calendar.november.get(21);
			if(daySelected.equals("22"))
				calendar.november.get(22);
			if(daySelected.equals("23"))
				calendar.november.get(23);
			if(daySelected.equals("24"))
				calendar.november.get(24);
			if(daySelected.equals("25"))
				calendar.november.get(25);
			if(daySelected.equals("26"))
				calendar.november.get(26);
			if(daySelected.equals("27"))
				calendar.november.get(27);
			if(daySelected.equals("28"))
				calendar.november.get(28);
			if(daySelected.equals("29"))
				calendar.november.get(29);
			if(daySelected.equals("30"))
				calendar.november.get(30);
		}
		if(date.equals("12")) {
			if(daySelected.equals("1"))
				calendar.december.get(1);
			if(daySelected.equals("2"))
				calendar.december.get(2);
			if(daySelected.equals("3"))
				calendar.december.get(3);
			if(daySelected.equals("4"))
				calendar.december.get(4);
			if(daySelected.equals("5"))
				calendar.december.get(5);
			if(daySelected.equals("6"))
				calendar.december.get(6);
			if(daySelected.equals("7"))
				calendar.december.get(7);
			if(daySelected.equals("8"))
				calendar.december.get(8);
			if(daySelected.equals("9"))
				calendar.december.get(9);
			if(daySelected.equals("10"))
				calendar.december.get(10);
			if(daySelected.equals("11"))
				calendar.december.get(11);
			if(daySelected.equals("12"))
				calendar.december.get(12);
			if(daySelected.equals("13"))
				calendar.december.get(13);
			if(daySelected.equals("14"))
				calendar.december.get(14);
			if(daySelected.equals("15"))
				calendar.december.get(15);
			if(daySelected.equals("16"))
				calendar.december.get(16);
			if(daySelected.equals("17"))
				calendar.december.get(17);
			if(daySelected.equals("18"))
				calendar.december.get(18);
			if(daySelected.equals("19"))
				calendar.december.get(19);
			if(daySelected.equals("20"))
				calendar.december.get(20);
			if(daySelected.equals("21"))
				calendar.december.get(21);
			if(daySelected.equals("22"))
				calendar.december.get(22);
			if(daySelected.equals("23"))
				calendar.december.get(23);
			if(daySelected.equals("24"))
				calendar.december.get(24);
			if(daySelected.equals("25"))
				calendar.december.get(25);
			if(daySelected.equals("26"))
				calendar.december.get(26);
			if(daySelected.equals("27"))
				calendar.december.get(27);
			if(daySelected.equals("28"))
				calendar.december.get(28);
			if(daySelected.equals("29"))
				calendar.december.get(29);
			if(daySelected.equals("30"))
				calendar.december.get(30);
			if(daySelected.equals("31"))
				calendar.december.get(31);
		}
	}
	
	private void deleteEvent(Calendar calendar, String date, String input) {
		if(date.equals("01")) {
			if(input.equals("1"))
				calendar.january.get(1).remove(1);
			if(input.equals("2"))
				calendar.january.get(2).remove(2);
			if(input.equals("3"))
				calendar.january.get(3).remove(3);
			if(input.equals("4"))
				calendar.january.get(4).remove(4);
			if(input.equals("5"))
				calendar.january.get(5).remove(5);
			if(input.equals("6"))
				calendar.january.get(6).remove(6);
			if(input.equals("7"))
				calendar.january.get(7).remove(7);
			if(input.equals("8"))
				calendar.january.get(8).remove(8);
			if(input.equals("9"))
				calendar.january.get(9).remove(9);
			if(input.equals("10"))
				calendar.january.get(10).remove(10);
			if(input.equals("11"))
				calendar.january.get(11).remove(11);
			if(input.equals("12"))
				calendar.january.get(12).remove(12);
			if(input.equals("13"))
				calendar.january.get(13).remove(13);
			if(input.equals("14"))
				calendar.january.get(14).remove(14);
			if(input.equals("15"))
				calendar.january.get(15).remove(15);
			if(input.equals("16"))
				calendar.january.get(16).remove(16);
			if(input.equals("17"))
				calendar.january.get(17).remove(17);
			if(input.equals("18"))
				calendar.january.get(18).remove(18);
			if(input.equals("19"))
				calendar.january.get(19).remove(19);
			if(input.equals("20"))
				calendar.january.get(20).remove(20);
			if(input.equals("21"))
				calendar.january.get(21).remove(21);
			if(input.equals("22"))
				calendar.january.get(22).remove(22);
			if(input.equals("23"))
				calendar.january.get(23).remove(23);
			if(input.equals("24"))
				calendar.january.get(24).remove(24);
			if(input.equals("25"))
				calendar.january.get(25).remove(25);
			if(input.equals("26"))
				calendar.january.get(26).remove(26);
			if(input.equals("27"))
				calendar.january.get(27).remove(27);
			if(input.equals("28"))
				calendar.january.get(28).remove(28);
			if(input.equals("29"))
				calendar.january.get(29).remove(29);
			if(input.equals("30"))
				calendar.january.get(30).remove(30);
			if(input.equals("31"))
				calendar.january.get(31).remove(31);
		}
		if(date.equals("02")) {
			if(input.equals("1"))
				calendar.feburary.get(1).remove(1);
			if(input.equals("2"))
				calendar.feburary.get(2).remove(2);
			if(input.equals("3"))
				calendar.feburary.get(3).remove(3);
			if(input.equals("4"))
				calendar.feburary.get(4).remove(4);
			if(input.equals("5"))
				calendar.feburary.get(5).remove(5);
			if(input.equals("6"))
				calendar.feburary.get(6).remove(6);
			if(input.equals("7"))
				calendar.feburary.get(7).remove(7);
			if(input.equals("8"))
				calendar.feburary.get(8).remove(8);
			if(input.equals("9"))
				calendar.feburary.get(9).remove(9);
			if(input.equals("10"))
				calendar.feburary.get(10).remove(10);
			if(input.equals("11"))
				calendar.feburary.get(11).remove(11);
			if(input.equals("12"))
				calendar.feburary.get(12).remove(12);
			if(input.equals("13"))
				calendar.feburary.get(13).remove(13);
			if(input.equals("14"))
				calendar.feburary.get(14).remove(14);
			if(input.equals("15"))
				calendar.feburary.get(15).remove(15);
			if(input.equals("16"))
				calendar.feburary.get(16).remove(16);
			if(input.equals("17"))
				calendar.feburary.get(17).remove(17);
			if(input.equals("18"))
				calendar.feburary.get(18).remove(18);
			if(input.equals("19"))
				calendar.feburary.get(19).remove(19);
			if(input.equals("20"))
				calendar.feburary.get(20).remove(20);
			if(input.equals("21"))
				calendar.feburary.get(21).remove(21);
			if(input.equals("22"))
				calendar.feburary.get(22).remove(22);
			if(input.equals("23"))
				calendar.feburary.get(23).remove(23);
			if(input.equals("24"))
				calendar.feburary.get(24).remove(24);
			if(input.equals("25"))
				calendar.feburary.get(25).remove(25);
			if(input.equals("26"))
				calendar.feburary.get(26).remove(26);
			if(input.equals("27"))
				calendar.feburary.get(27).remove(27);
			if(input.equals("28"))
				calendar.feburary.get(28).remove(28);
		}
		if(date.equals("03")) {
			if(input.equals("1"))
				calendar.march.get(1).remove(1);
			if(input.equals("2"))
				calendar.march.get(2).remove(2);
			if(input.equals("3"))
				calendar.march.get(3).remove(3);
			if(input.equals("4"))
				calendar.march.get(4).remove(4);
			if(input.equals("5"))
				calendar.march.get(5).remove(5);
			if(input.equals("6"))
				calendar.march.get(6).remove(6);
			if(input.equals("7"))
				calendar.march.get(7).remove(7);
			if(input.equals("8"))
				calendar.march.get(8).remove(8);
			if(input.equals("9"))
				calendar.march.get(9).remove(9);
			if(input.equals("10"))
				calendar.march.get(10).remove(10);
			if(input.equals("11"))
				calendar.march.get(11).remove(11);
			if(input.equals("12"))
				calendar.march.get(12).remove(12);
			if(input.equals("13"))
				calendar.march.get(13).remove(13);
			if(input.equals("14"))
				calendar.march.get(14).remove(14);
			if(input.equals("15"))
				calendar.march.get(15).remove(15);
			if(input.equals("16"))
				calendar.march.get(16).remove(16);
			if(input.equals("17"))
				calendar.march.get(17).remove(17);
			if(input.equals("18"))
				calendar.march.get(18).remove(18);
			if(input.equals("19"))
				calendar.march.get(19).remove(19);
			if(input.equals("20"))
				calendar.march.get(20).remove(20);
			if(input.equals("21"))
				calendar.march.get(21).remove(21);
			if(input.equals("22"))
				calendar.march.get(22).remove(22);
			if(input.equals("23"))
				calendar.march.get(23).remove(23);
			if(input.equals("24"))
				calendar.march.get(24).remove(24);
			if(input.equals("25"))
				calendar.march.get(25).remove(25);
			if(input.equals("26"))
				calendar.march.get(26).remove(26);
			if(input.equals("27"))
				calendar.march.get(27).remove(27);
			if(input.equals("28"))
				calendar.march.get(28).remove(28);
			if(input.equals("29"))
				calendar.march.get(29).remove(29);
			if(input.equals("30"))
				calendar.march.get(30).remove(30);
			if(input.equals("31"))
				calendar.march.get(31).remove(31);
		}
		if(date.equals("04")) {
			if(input.equals("1"))
				calendar.april.get(1).remove(1);
			if(input.equals("2"))
				calendar.april.get(2).remove(2);
			if(input.equals("3"))
				calendar.april.get(3).remove(3);
			if(input.equals("4"))
				calendar.april.get(4).remove(4);
			if(input.equals("5"))
				calendar.april.get(5).remove(5);
			if(input.equals("6"))
				calendar.april.get(6).remove(6);
			if(input.equals("7"))
				calendar.april.get(7).remove(7);
			if(input.equals("8"))
				calendar.april.get(8).remove(8);
			if(input.equals("9"))
				calendar.april.get(9).remove(9);
			if(input.equals("10"))
				calendar.april.get(10).remove(10);
			if(input.equals("11"))
				calendar.april.get(11).remove(11);
			if(input.equals("12"))
				calendar.april.get(12).remove(12);
			if(input.equals("13"))
				calendar.april.get(13).remove(13);
			if(input.equals("14"))
				calendar.april.get(14).remove(14);
			if(input.equals("15"))
				calendar.april.get(15).remove(15);
			if(input.equals("16"))
				calendar.april.get(16).remove(16);
			if(input.equals("17"))
				calendar.april.get(17).remove(17);
			if(input.equals("18"))
				calendar.april.get(18).remove(18);
			if(input.equals("19"))
				calendar.april.get(19).remove(19);
			if(input.equals("20"))
				calendar.april.get(20).remove(20);
			if(input.equals("21"))
				calendar.april.get(21).remove(21);
			if(input.equals("22"))
				calendar.april.get(22).remove(22);
			if(input.equals("23"))
				calendar.april.get(23).remove(23);
			if(input.equals("24"))
				calendar.april.get(24).remove(24);
			if(input.equals("25"))
				calendar.april.get(25).remove(25);
			if(input.equals("26"))
				calendar.april.get(26).remove(26);
			if(input.equals("27"))
				calendar.april.get(27).remove(27);
			if(input.equals("28"))
				calendar.april.get(28).remove(28);
			if(input.equals("29"))
				calendar.april.get(29).remove(29);
			if(input.equals("30"))
				calendar.april.get(30).remove(30);
		}
		if(date.equals("05")) {
			if(input.equals("1"))
				calendar.may.get(1).remove(1);
			if(input.equals("2"))
				calendar.may.get(2).remove(2);
			if(input.equals("3"))
				calendar.may.get(3).remove(3);
			if(input.equals("4"))
				calendar.may.get(4).remove(4);
			if(input.equals("5"))
				calendar.may.get(5).remove(5);
			if(input.equals("6"))
				calendar.may.get(6).remove(6);
			if(input.equals("7"))
				calendar.may.get(7).remove(7);
			if(input.equals("8"))
				calendar.may.get(8).remove(8);
			if(input.equals("9"))
				calendar.may.get(9).remove(9);
			if(input.equals("10"))
				calendar.may.get(10).remove(10);
			if(input.equals("11"))
				calendar.may.get(11).remove(11);
			if(input.equals("12"))
				calendar.may.get(12).remove(12);
			if(input.equals("13"))
				calendar.may.get(13).remove(13);
			if(input.equals("14"))
				calendar.may.get(14).remove(14);
			if(input.equals("15"))
				calendar.may.get(15).remove(15);
			if(input.equals("16"))
				calendar.may.get(16).remove(16);
			if(input.equals("17"))
				calendar.may.get(17).remove(17);
			if(input.equals("18"))
				calendar.may.get(18).remove(18);
			if(input.equals("19"))
				calendar.may.get(19).remove(19);
			if(input.equals("20"))
				calendar.may.get(20).remove(20);
			if(input.equals("21"))
				calendar.may.get(21).remove(21);
			if(input.equals("22"))
				calendar.may.get(22).remove(22);
			if(input.equals("23"))
				calendar.may.get(23).remove(23);
			if(input.equals("24"))
				calendar.may.get(24).remove(24);
			if(input.equals("25"))
				calendar.may.get(25).remove(25);
			if(input.equals("26"))
				calendar.may.get(26).remove(26);
			if(input.equals("27"))
				calendar.may.get(27).remove(27);
			if(input.equals("28"))
				calendar.may.get(28).remove(28);
			if(input.equals("29"))
				calendar.may.get(29).remove(29);
			if(input.equals("30"))
				calendar.may.get(30).remove(30);
			if(input.equals("31"))
				calendar.may.get(31).remove(31);
		}
		if(date.equals("06")) {
			if(input.equals("1"))
				calendar.june.get(1).remove(1);
			if(input.equals("2"))
				calendar.june.get(2).remove(2);
			if(input.equals("3"))
				calendar.june.get(3).remove(3);
			if(input.equals("4"))
				calendar.june.get(4).remove(4);
			if(input.equals("5"))
				calendar.june.get(5).remove(5);
			if(input.equals("6"))
				calendar.june.get(6).remove(6);
			if(input.equals("7"))
				calendar.june.get(7).remove(7);
			if(input.equals("8"))
				calendar.june.get(8).remove(8);
			if(input.equals("9"))
				calendar.june.get(9).remove(9);
			if(input.equals("10"))
				calendar.june.get(10).remove(10);
			if(input.equals("11"))
				calendar.june.get(11).remove(11);
			if(input.equals("12"))
				calendar.june.get(12).remove(12);
			if(input.equals("13"))
				calendar.june.get(13).remove(13);
			if(input.equals("14"))
				calendar.june.get(14).remove(14);
			if(input.equals("15"))
				calendar.june.get(15).remove(15);
			if(input.equals("16"))
				calendar.june.get(16).remove(16);
			if(input.equals("17"))
				calendar.june.get(17).remove(17);
			if(input.equals("18"))
				calendar.june.get(18).remove(18);
			if(input.equals("19"))
				calendar.june.get(19).remove(19);
			if(input.equals("20"))
				calendar.june.get(20).remove(20);
			if(input.equals("21"))
				calendar.june.get(21).remove(21);
			if(input.equals("22"))
				calendar.june.get(22).remove(22);
			if(input.equals("23"))
				calendar.june.get(23).remove(23);
			if(input.equals("24"))
				calendar.june.get(24).remove(24);
			if(input.equals("25"))
				calendar.june.get(25).remove(25);
			if(input.equals("26"))
				calendar.june.get(26).remove(26);
			if(input.equals("27"))
				calendar.june.get(27).remove(27);
			if(input.equals("28"))
				calendar.june.get(28).remove(28);
			if(input.equals("29"))
				calendar.june.get(29).remove(29);
			if(input.equals("30"))
				calendar.june.get(30).remove(30);
		}
		if(date.equals("07")) {
			if(input.equals("1"))
				calendar.july.get(1).remove(1);
			if(input.equals("2"))
				calendar.july.get(2).remove(2);
			if(input.equals("3"))
				calendar.july.get(3).remove(3);
			if(input.equals("4"))
				calendar.july.get(4).remove(4);
			if(input.equals("5"))
				calendar.july.get(5).remove(5);
			if(input.equals("6"))
				calendar.july.get(6).remove(6);
			if(input.equals("7"))
				calendar.july.get(7).remove(7);
			if(input.equals("8"))
				calendar.july.get(8).remove(8);
			if(input.equals("9"))
				calendar.july.get(9).remove(9);
			if(input.equals("10"))
				calendar.july.get(10).remove(10);
			if(input.equals("11"))
				calendar.july.get(11).remove(11);
			if(input.equals("12"))
				calendar.july.get(12).remove(12);
			if(input.equals("13"))
				calendar.july.get(13).remove(13);
			if(input.equals("14"))
				calendar.july.get(14).remove(14);
			if(input.equals("15"))
				calendar.july.get(15).remove(15);
			if(input.equals("16"))
				calendar.july.get(16).remove(16);
			if(input.equals("17"))
				calendar.july.get(17).remove(17);
			if(input.equals("18"))
				calendar.july.get(18).remove(18);
			if(input.equals("19"))
				calendar.july.get(19).remove(19);
			if(input.equals("20"))
				calendar.july.get(20).remove(20);
			if(input.equals("21"))
				calendar.july.get(21).remove(21);
			if(input.equals("22"))
				calendar.july.get(22).remove(22);
			if(input.equals("23"))
				calendar.july.get(23).remove(23);
			if(input.equals("24"))
				calendar.july.get(24).remove(24);
			if(input.equals("25"))
				calendar.july.get(25).remove(25);
			if(input.equals("26"))
				calendar.july.get(26).remove(26);
			if(input.equals("27"))
				calendar.july.get(27).remove(27);
			if(input.equals("28"))
				calendar.july.get(28).remove(28);
			if(input.equals("29"))
				calendar.july.get(29).remove(29);
			if(input.equals("30"))
				calendar.july.get(30).remove(30);
			if(input.equals("31"))
				calendar.july.get(31).remove(31);
		}
		if(date.equals("08")) {
			if(input.equals("1"))
				calendar.august.get(1).remove(1);
			if(input.equals("2"))
				calendar.august.get(2).remove(2);
			if(input.equals("3"))
				calendar.august.get(3).remove(3);
			if(input.equals("4"))
				calendar.august.get(4).remove(4);
			if(input.equals("5"))
				calendar.august.get(5).remove(5);
			if(input.equals("6"))
				calendar.august.get(6).remove(6);
			if(input.equals("7"))
				calendar.august.get(7).remove(7);
			if(input.equals("8"))
				calendar.august.get(8).remove(8);
			if(input.equals("9"))
				calendar.august.get(9).remove(9);
			if(input.equals("10"))
				calendar.august.get(10).remove(10);
			if(input.equals("11"))
				calendar.august.get(11).remove(11);
			if(input.equals("12"))
				calendar.august.get(12).remove(12);
			if(input.equals("13"))
				calendar.august.get(13).remove(13);
			if(input.equals("14"))
				calendar.august.get(14).remove(14);
			if(input.equals("15"))
				calendar.august.get(15).remove(15);
			if(input.equals("16"))
				calendar.august.get(16).remove(16);
			if(input.equals("17"))
				calendar.august.get(17).remove(17);
			if(input.equals("18"))
				calendar.august.get(18).remove(18);
			if(input.equals("19"))
				calendar.august.get(19).remove(19);
			if(input.equals("20"))
				calendar.august.get(20).remove(20);
			if(input.equals("21"))
				calendar.august.get(21).remove(21);
			if(input.equals("22"))
				calendar.august.get(22).remove(22);
			if(input.equals("23"))
				calendar.august.get(23).remove(23);
			if(input.equals("24"))
				calendar.august.get(24).remove(24);
			if(input.equals("25"))
				calendar.august.get(25).remove(25);
			if(input.equals("26"))
				calendar.august.get(26).remove(26);
			if(input.equals("27"))
				calendar.august.get(27).remove(27);
			if(input.equals("28"))
				calendar.august.get(28).remove(28);
			if(input.equals("29"))
				calendar.august.get(29).remove(29);
			if(input.equals("30"))
				calendar.august.get(30).remove(30);
			if(input.equals("31"))
				calendar.august.get(31).remove(31);
		}
		if(date.equals("09")) {
			if(input.equals("1"))
				calendar.september.get(1).remove(1);
			if(input.equals("2"))
				calendar.september.get(2).remove(2);
			if(input.equals("3"))
				calendar.september.get(3).remove(3);
			if(input.equals("4"))
				calendar.september.get(4).remove(4);
			if(input.equals("5"))
				calendar.september.get(5).remove(5);
			if(input.equals("6"))
				calendar.september.get(6).remove(6);
			if(input.equals("7"))
				calendar.september.get(7).remove(7);
			if(input.equals("8"))
				calendar.september.get(8).remove(8);
			if(input.equals("9"))
				calendar.september.get(9).remove(9);
			if(input.equals("10"))
				calendar.september.get(10).remove(10);
			if(input.equals("11"))
				calendar.september.get(11).remove(11);
			if(input.equals("12"))
				calendar.september.get(12).remove(12);
			if(input.equals("13"))
				calendar.september.get(13).remove(13);
			if(input.equals("14"))
				calendar.september.get(14).remove(14);
			if(input.equals("15"))
				calendar.september.get(15).remove(15);
			if(input.equals("16"))
				calendar.september.get(16).remove(16);
			if(input.equals("17"))
				calendar.september.get(17).remove(17);
			if(input.equals("18"))
				calendar.september.get(18).remove(18);
			if(input.equals("19"))
				calendar.september.get(19).remove(19);
			if(input.equals("20"))
				calendar.september.get(20).remove(20);
			if(input.equals("21"))
				calendar.september.get(21).remove(21);
			if(input.equals("22"))
				calendar.september.get(22).remove(22);
			if(input.equals("23"))
				calendar.september.get(23).remove(23);
			if(input.equals("24"))
				calendar.september.get(24).remove(24);
			if(input.equals("25"))
				calendar.september.get(25).remove(25);
			if(input.equals("26"))
				calendar.september.get(26).remove(26);
			if(input.equals("27"))
				calendar.september.get(27).remove(27);
			if(input.equals("28"))
				calendar.september.get(28).remove(28);
			if(input.equals("29"))
				calendar.september.get(29).remove(29);
			if(input.equals("30"))
				calendar.september.get(30).remove(30);
		}
		if(date.equals("10")) {
			if(input.equals("1"))
				calendar.october.get(1).remove(1);
			if(input.equals("2"))
				calendar.october.get(2).remove(2);
			if(input.equals("3"))
				calendar.october.get(3).remove(3);
			if(input.equals("4"))
				calendar.october.get(4).remove(4);
			if(input.equals("5"))
				calendar.october.get(5).remove(5);
			if(input.equals("6"))
				calendar.october.get(6).remove(6);
			if(input.equals("7"))
				calendar.october.get(7).remove(7);
			if(input.equals("8"))
				calendar.october.get(8).remove(8);
			if(input.equals("9"))
				calendar.october.get(9).remove(9);
			if(input.equals("10"))
				calendar.october.get(10).remove(10);
			if(input.equals("11"))
				calendar.october.get(11).remove(11);
			if(input.equals("12"))
				calendar.october.get(12).remove(12);
			if(input.equals("13"))
				calendar.october.get(13).remove(13);
			if(input.equals("14"))
				calendar.october.get(14).remove(14);
			if(input.equals("15"))
				calendar.october.get(15).remove(15);
			if(input.equals("16"))
				calendar.october.get(16).remove(16);
			if(input.equals("17"))
				calendar.october.get(17).remove(17);
			if(input.equals("18"))
				calendar.october.get(18).remove(18);
			if(input.equals("19"))
				calendar.october.get(19).remove(19);
			if(input.equals("20"))
				calendar.october.get(20).remove(20);
			if(input.equals("21"))
				calendar.october.get(21).remove(21);
			if(input.equals("22"))
				calendar.october.get(22).remove(22);
			if(input.equals("23"))
				calendar.october.get(23).remove(23);
			if(input.equals("24"))
				calendar.october.get(24).remove(24);
			if(input.equals("25"))
				calendar.october.get(25).remove(25);
			if(input.equals("26"))
				calendar.october.get(26).remove(26);
			if(input.equals("27"))
				calendar.october.get(27).remove(27);
			if(input.equals("28"))
				calendar.october.get(28).remove(28);
			if(input.equals("29"))
				calendar.october.get(29).remove(29);
			if(input.equals("30"))
				calendar.october.get(30).remove(30);
			if(input.equals("31"))
				calendar.october.get(31).remove(31);
		}
		if(date.equals("11")) {
			if(input.equals("1"))
				calendar.november.get(1).remove(1);
			if(input.equals("2"))
				calendar.november.get(2).remove(2);
			if(input.equals("3"))
				calendar.november.get(3).remove(3);
			if(input.equals("4"))
				calendar.november.get(4).remove(4);
			if(input.equals("5"))
				calendar.november.get(5).remove(5);
			if(input.equals("6"))
				calendar.november.get(6).remove(6);
			if(input.equals("7"))
				calendar.november.get(7).remove(7);
			if(input.equals("8"))
				calendar.november.get(8).remove(8);
			if(input.equals("9"))
				calendar.november.get(9).remove(9);
			if(input.equals("10"))
				calendar.november.get(10).remove(10);
			if(input.equals("11"))
				calendar.november.get(11).remove(11);
			if(input.equals("12"))
				calendar.november.get(12).remove(12);
			if(input.equals("13"))
				calendar.november.get(13).remove(13);
			if(input.equals("14"))
				calendar.november.get(14).remove(14);
			if(input.equals("15"))
				calendar.november.get(15).remove(15);
			if(input.equals("16"))
				calendar.november.get(16).remove(16);
			if(input.equals("17"))
				calendar.november.get(17).remove(17);
			if(input.equals("18"))
				calendar.november.get(18).remove(18);
			if(input.equals("19"))
				calendar.november.get(19).remove(19);
			if(input.equals("20"))
				calendar.november.get(20).remove(20);
			if(input.equals("21"))
				calendar.november.get(21).remove(21);
			if(input.equals("22"))
				calendar.november.get(22).remove(22);
			if(input.equals("23"))
				calendar.november.get(23).remove(23);
			if(input.equals("24"))
				calendar.november.get(24).remove(24);
			if(input.equals("25"))
				calendar.november.get(25).remove(25);
			if(input.equals("26"))
				calendar.november.get(26).remove(26);
			if(input.equals("27"))
				calendar.november.get(27).remove(27);
			if(input.equals("28"))
				calendar.november.get(28).remove(28);
			if(input.equals("29"))
				calendar.november.get(29).remove(29);
			if(input.equals("30"))
				calendar.november.get(30).remove(30);
		}
		if(date.equals("12")) {
			if(input.equals("1"))
				calendar.december.get(1).remove(1);
			if(input.equals("2"))
				calendar.december.get(2).remove(2);
			if(input.equals("3"))
				calendar.december.get(3).remove(3);
			if(input.equals("4"))
				calendar.december.get(4).remove(4);
			if(input.equals("5"))
				calendar.december.get(5).remove(5);
			if(input.equals("6"))
				calendar.december.get(6).remove(6);
			if(input.equals("7"))
				calendar.december.get(7).remove(7);
			if(input.equals("8"))
				calendar.december.get(8).remove(8);
			if(input.equals("9"))
				calendar.december.get(9).remove(9);
			if(input.equals("10"))
				calendar.december.get(10).remove(10);
			if(input.equals("11"))
				calendar.december.get(11).remove(11);
			if(input.equals("12"))
				calendar.december.get(12).remove(12);
			if(input.equals("13"))
				calendar.december.get(13).remove(13);
			if(input.equals("14"))
				calendar.december.get(14).remove(14);
			if(input.equals("15"))
				calendar.december.get(15).remove(15);
			if(input.equals("16"))
				calendar.december.get(16).remove(16);
			if(input.equals("17"))
				calendar.december.get(17).remove(17);
			if(input.equals("18"))
				calendar.december.get(18).remove(18);
			if(input.equals("19"))
				calendar.december.get(19).remove(19);
			if(input.equals("20"))
				calendar.december.get(20).remove(20);
			if(input.equals("21"))
				calendar.december.get(21).remove(21);
			if(input.equals("22"))
				calendar.december.get(22).remove(22);
			if(input.equals("23"))
				calendar.december.get(23).remove(23);
			if(input.equals("24"))
				calendar.december.get(24).remove(24);
			if(input.equals("25"))
				calendar.december.get(25).remove(25);
			if(input.equals("26"))
				calendar.december.get(26).remove(26);
			if(input.equals("27"))
				calendar.december.get(27).remove(27);
			if(input.equals("28"))
				calendar.december.get(28).remove(28);
			if(input.equals("29"))
				calendar.december.get(29).remove(29);
			if(input.equals("30"))
				calendar.december.get(30).remove(30);
			if(input.equals("31"))
				calendar.december.get(31).remove(31);
		}
	}

	private void editEvent(Calendar calendar, String date, String daySelected, String uInput) {
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
		System.out.print("\nDoes this event have a category?(Y/N): ");
		while(scan5.hasNext()) {
			input5 = scan5.next();
			if(input5.equalsIgnoreCase("Y") || input5.equalsIgnoreCase("N"))
				break;
			System.out.print("\nDoes this event have a category?(Y/N): ");
		}
		
		Event details = new Event();
		if(input5.equalsIgnoreCase("Y")) {
			Category category = new Category();
			details = new Event(input, input2, input3, input4, category);
		}
		if(input5.equalsIgnoreCase("N")) {
			details = new Event(input, input2, input3, input4);
		}
		
		if(date.equals("01")) {
			if(uInput.equals("1"))
				calendar.january.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.january.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.january.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.january.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.january.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.january.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.january.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.january.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.january.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.january.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.january.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.january.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.january.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.january.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.january.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.january.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.january.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.january.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.january.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.january.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.january.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.january.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.january.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.january.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.january.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.january.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.january.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.january.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.january.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.january.get(30).set(30, details);
			if(uInput.equals("31"))
				calendar.january.get(31).set(31, details);
		}
		if(date.equals("02")) {
			if(uInput.equals("1"))
				calendar.feburary.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.feburary.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.feburary.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.feburary.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.feburary.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.feburary.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.feburary.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.feburary.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.feburary.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.feburary.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.feburary.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.feburary.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.feburary.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.feburary.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.feburary.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.feburary.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.feburary.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.feburary.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.feburary.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.feburary.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.feburary.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.feburary.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.feburary.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.feburary.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.feburary.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.feburary.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.feburary.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.feburary.get(28).set(28, details);
		}
		if(date.equals("03")) {
			if(uInput.equals("1"))
				calendar.march.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.march.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.march.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.march.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.march.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.march.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.march.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.march.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.march.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.march.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.march.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.march.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.march.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.march.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.march.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.march.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.march.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.march.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.march.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.march.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.march.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.march.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.march.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.march.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.march.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.march.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.march.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.march.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.march.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.march.get(30).set(30, details);
			if(uInput.equals("31"))
				calendar.march.get(31).set(31, details);
		}
		if(date.equals("04")) {
			if(uInput.equals("1"))
				calendar.april.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.april.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.april.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.april.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.april.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.april.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.april.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.april.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.april.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.april.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.april.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.april.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.april.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.april.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.april.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.april.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.april.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.april.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.april.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.april.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.april.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.april.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.april.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.april.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.april.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.april.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.april.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.april.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.april.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.april.get(30).set(30, details);
		}
		if(date.equals("05")) {
			if(uInput.equals("1"))
				calendar.may.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.may.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.may.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.may.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.may.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.may.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.may.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.may.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.may.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.may.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.may.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.may.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.may.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.may.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.may.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.may.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.may.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.may.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.may.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.may.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.may.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.may.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.may.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.may.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.may.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.may.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.may.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.may.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.may.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.may.get(30).set(30, details);
			if(uInput.equals("31"))
				calendar.may.get(31).set(31, details);
		}
		if(date.equals("06")) {
			if(uInput.equals("1"))
				calendar.june.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.june.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.june.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.june.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.june.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.june.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.june.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.june.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.june.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.june.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.june.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.june.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.june.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.june.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.june.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.june.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.june.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.june.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.june.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.june.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.june.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.june.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.june.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.june.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.june.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.june.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.june.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.june.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.june.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.june.get(30).set(30, details);
		}
		if(date.equals("07")) {
			if(uInput.equals("1"))
				calendar.july.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.july.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.july.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.july.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.july.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.july.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.july.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.july.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.july.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.july.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.july.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.july.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.july.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.july.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.july.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.july.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.july.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.july.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.july.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.july.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.july.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.july.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.july.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.july.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.july.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.july.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.july.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.july.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.july.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.july.get(30).set(30, details);
			if(uInput.equals("31"))
				calendar.july.get(31).set(31, details);
		}
		if(date.equals("08")) {
			if(uInput.equals("1"))
				calendar.august.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.august.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.august.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.august.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.august.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.august.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.august.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.august.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.august.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.august.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.august.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.august.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.august.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.august.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.august.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.august.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.august.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.august.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.august.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.august.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.august.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.august.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.august.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.august.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.august.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.august.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.august.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.august.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.august.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.august.get(30).set(30, details);
			if(uInput.equals("31"))
				calendar.august.get(31).set(31, details);
		}
		if(date.equals("09")) {
			if(uInput.equals("1"))
				calendar.september.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.september.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.september.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.september.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.september.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.september.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.september.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.september.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.september.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.september.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.september.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.september.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.september.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.september.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.september.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.september.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.september.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.september.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.september.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.september.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.september.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.september.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.september.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.september.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.september.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.september.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.september.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.september.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.september.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.september.get(30).set(30, details);
		}
		if(date.equals("10")) {
			if(uInput.equals("1"))
				calendar.october.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.october.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.october.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.october.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.october.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.october.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.october.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.october.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.october.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.october.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.october.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.october.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.october.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.october.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.october.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.october.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.october.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.october.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.october.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.october.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.october.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.october.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.october.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.october.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.october.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.october.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.october.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.october.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.october.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.october.get(30).set(30, details);
			if(uInput.equals("31"))
				calendar.october.get(31).set(31, details);
		}
		if(date.equals("11")) {
			if(uInput.equals("1"))
				calendar.november.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.november.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.november.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.november.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.november.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.november.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.november.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.november.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.november.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.november.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.november.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.november.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.november.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.november.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.november.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.november.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.november.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.november.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.november.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.november.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.november.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.november.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.november.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.november.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.november.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.november.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.november.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.november.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.november.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.november.get(30).set(30, details);
		}
		if(date.equals("12")) {
			if(uInput.equals("1"))
				calendar.december.get(1).set(1, details);
			if(uInput.equals("2"))
				calendar.december.get(2).set(2, details);
			if(uInput.equals("3"))
				calendar.december.get(3).set(3, details);
			if(uInput.equals("4"))
				calendar.december.get(4).set(4, details);
			if(uInput.equals("5"))
				calendar.december.get(5).set(5, details);
			if(uInput.equals("6"))
				calendar.december.get(6).set(6, details);
			if(uInput.equals("7"))
				calendar.december.get(7).set(7, details);
			if(uInput.equals("8"))
				calendar.december.get(8).set(8, details);
			if(uInput.equals("9"))
				calendar.december.get(9).set(9, details);
			if(uInput.equals("10"))
				calendar.december.get(10).set(10, details);
			if(uInput.equals("11"))
				calendar.december.get(11).set(11, details);
			if(uInput.equals("12"))
				calendar.december.get(12).set(12, details);
			if(uInput.equals("13"))
				calendar.december.get(13).set(13, details);
			if(uInput.equals("14"))
				calendar.december.get(14).set(14, details);
			if(uInput.equals("15"))
				calendar.december.get(15).set(15, details);
			if(uInput.equals("16"))
				calendar.december.get(16).set(16, details);
			if(uInput.equals("17"))
				calendar.december.get(17).set(17, details);
			if(uInput.equals("18"))
				calendar.december.get(18).set(18, details);
			if(uInput.equals("19"))
				calendar.december.get(19).set(19, details);
			if(uInput.equals("20"))
				calendar.december.get(20).set(20, details);
			if(uInput.equals("21"))
				calendar.december.get(21).set(21, details);
			if(uInput.equals("22"))
				calendar.december.get(22).set(22, details);
			if(uInput.equals("23"))
				calendar.december.get(23).set(23, details);
			if(uInput.equals("24"))
				calendar.december.get(24).set(24, details);
			if(uInput.equals("25"))
				calendar.december.get(25).set(25, details);
			if(uInput.equals("26"))
				calendar.december.get(26).set(26, details);
			if(uInput.equals("27"))
				calendar.december.get(27).set(27, details);
			if(uInput.equals("28"))
				calendar.december.get(28).set(28, details);
			if(uInput.equals("29"))
				calendar.december.get(29).set(29, details);
			if(uInput.equals("30"))
				calendar.december.get(30).set(30, details);
			if(uInput.equals("31"))
				calendar.december.get(31).set(31, details);
		}
		
		scan1.close();
		scan2.close();
		scan3.close();
		scan4.close();
		scan5.close();
	}
	
	public void main(String[] args) {
		Calendar calendar = new Calendar();
		
		MonthDay month = MonthDay.now();

		String str = month.toString();
		String[] date = str.split("-");
		
		String daySelected = null;
		
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
			System.out.print("\n\nPick a day to create an event(1-"+Days(date) +"): ");
			Scanner scan1 = new Scanner(System.in);
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
			createEvent(timeSelected, daySelected, date[2], calendar);
			
			scan1.close();
			scan2.close();
		}
		
		if(decision.equalsIgnoreCase("D")) {
			System.out.println("\nWhich event would you like to delete?(integer)");
			getEvents(calendar, date[2], daySelected);
			System.out.print(">> ");
			
			Scanner scan3 = new Scanner(System.in);
			String input = "";
			while(!scan3.hasNextInt()) {
				scan3.next();
				System.out.println("\nWhich event would you like to delete?(integer)");
				getEvents(calendar, date[2], daySelected);
				System.out.print(">> ");
			}
			input = scan3.next();
			scan3.close();
			
			deleteEvent(calendar, date[2], input);
		}
		
		if(decision.equalsIgnoreCase("E")) {
			System.out.println("\nWhich event would you like to edit?(integer)");
			getEvents(calendar, date[2], daySelected);
			System.out.print(">> ");
			
			Scanner scan4 = new Scanner(System.in);
			String input = "";
			while(!scan4.hasNextInt()) {
				scan4.next();
				System.out.println("\nWhich event would you like to edit?(integer)");
				getEvents(calendar, date[2], daySelected);
				System.out.print(">> ");
			}
			input = scan4.next();
			
			editEvent(calendar, date[2],daySelected, input);
			
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}

