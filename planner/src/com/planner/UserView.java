package com.planner;

import java.util.Scanner;

import com.planner.Controller;

public class UserView {
    static Scanner scanner = new Scanner(System.in);

    static Controller controller = new Controller();

    public static void main(String[] args) {
        System.out.println("Welcome to Project Planner");
        System.out.println("Would you like to login or create an account? ");
        System.out.println(" 1     Login");
        System.out.println(" 2     Create Account");

        int userChoice = Integer.parseInt(scanner.nextLine());

        switch (userChoice) {
            case 1:
                // login here
                break;
            case 2:
                // create account Here
                break;
            default:
                System.out.println("That was not a choice!");
        }
        mainmenu();
        exitProgram();
        System.out.println("thanks for using the program");
    }

    public static void mainmenu() {
        System.out.println("This is the main menu");
        System.out.println(" 1     CreateCalendar");
        System.out.println(" 2     Create Task");
        System.out.println(" 3     Create Category");
        System.out.println(" 4     Get Weather ");
        int userChoice = Integer.parseInt(scanner.nextLine());

        while (userChoice != 0) {
            switch (userChoice) {
                case 1:
                    // create calendar
                    break;
                case 2:
                    // create task
                    break;
                case 3:
                    // create category
                    break;
                case 4:
                    getWeather();
                    break;
                default:
                    System.out.println("not a choice");
                    break;
            }
            System.out.println(" 1     CreateCalendar");
            System.out.println(" 2     Create Task");
            System.out.println(" 3     Create Category");
            System.out.println(" 4     Get Weather ");
            userChoice = Integer.parseInt(scanner.nextLine());
        }
    }

    public static void exitProgram() {
        //save info here
    }

    public static void getWeather() {
        System.out.println("Please enter the name of the city");
        String userChoice = scanner.nextLine();
        System.out.println("Please enter the State Code");
        String input = scanner.nextLine();

        String weather = controller.getWeather(userChoice, input);
    }
}