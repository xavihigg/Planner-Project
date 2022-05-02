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
        System.out.println(" 0     Exit Program");
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
            System.out.println(" 0     Exit Program");
            userChoice = Integer.parseInt(scanner.nextLine());
        }
    }

    public static void exitProgram() {
        //save info here
    }
    //////////////////// Xavier Use Cases ////////////////////////////////////////////
    /**
     * This function will return the current weather for a specified city
     */
    public static void getWeather() {
        System.out.println("Please enter the name of the city");
        String userChoice = scanner.nextLine();
        String response = controller.getWeather(userChoice);
        if (response.equals("HttpResponseCode: 404")) {
            System.out.println("That city could not be found");
        } else {
            System.out.println("The weather in " + userChoice + " is " + response + "F");
        }
    }
    public static void mergeEvent() {
        System.out.println("Please enter the name of Event to merge");
        String userChoice = scanner.nextLine();
        System.out.println("Please enter the name of the Event to merge into");
        String userChoice2 = scanner.nextLine();

        String output = controller.mergeEvent(userChoice, userChoice2);
        System.out.println(output);
    }

    public static void mergeTask() {
        System.out.println("Please enter the name of Event to merge");
        String userChoice = scanner.nextLine();
        System.out.println("Please enter the name of the Event to merge into");
        String userChoice2 = scanner.nextLine();

        String output = controller.mergeTask(userChoice, userChoice2);
        System.out.println(output);
    }

    public static void sortTasks() {

    }

    public static void generateSchedule() {

    }
}