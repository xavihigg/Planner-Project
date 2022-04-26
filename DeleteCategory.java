import java.io.*;
import java.util.*;

public class DeleteCategory {
	private void getCategoryList() {
		try {
			File events = new File("categoryList.txt");
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

	private void fixInput(String input) {
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
		
		deleteCategory(fixed);
	}
	
	private void deleteCategory(int input) {
		try {
			String filename = "categoryList.txt";
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
	
	public void main(String[] args) {
		System.out.println("\nWhich category would you like to delete?(integer)");
		getCategoryList();
		System.out.print(">> ");
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.println("\nWhich category would you like to delete?(integer)");
			getCategoryList();
			System.out.print(">> ");
		}
		input = scan.next();
		scan.close();
		
		fixInput(input);
	}
}
