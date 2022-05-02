package com.planner;

import java.util.Scanner;
import java.awt.*;
import java.text.*;

import com.planner.Controller;

import javafx.util.converter.TimeStringConverter;

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

    // String output = controller.mergeEvent(userChoice, userChoice2);
    }

    public static void mergeTask() {

    }

    public static void sortTasks() {

    }

    public static void generateSchedule() {

    }

    //////////////////// Will Y Use Cases ////////////////////////////////////////////

    // Gets user info to create a task
    public static void createTask()
    {
        System.out.println("Please enter the name, content, and due date for this task: ");
        System.out.print("Name: ");
        String taskName = scanner.nextLine();
        System.out.print("Content: ");
        String taskContent = scanner.nextLine();
        System.out.print("Due date (type 'none' if task not time sensitive): ");
        String taskDueDate = scanner.nextLine();
        if (taskDueDate.toUpperCase().toCharArray()[0] == 'N') {
            taskDueDate = "whenever";
        }

        controller.createTask(taskName, taskContent, taskDueDate);
    }

    // Allows user to edit attributes of the task until opting to exit
    public static void editTask()
    {   
        char toEdit = 'A';

        while (toEdit != 'Z') {
            System.out.println("Would you like to edit the name, content, or due date of this task?");
            System.out.print("Enter N, C, or D (Z to go back): ");
            toEdit = scanner.nextLine().toUpperCase().toCharArray()[0];

            switch (toEdit) {
                case 'N': System.out.print("Enter a new name for this task: ");
                        String taskName = scanner.nextLine();
                        controller.editTask(taskName, toEdit);
                        break;
                case 'C': System.out.print("Enter new contents for this task: ");
                        String taskContent = scanner.nextLine();
                        controller.editTask(taskContent, toEdit);
                        break;
                case 'D': System.out.print("Enter a new due date for this task: ");
                        String taskDueDate = scanner.nextLine();
                        controller.editTask(taskDueDate, toEdit);
                        break;
                case 'Z': break;

                default:  System.out.println("Please try again");
                        break;
            }
        }
        toEdit = 'A';
    }

    // Sets a task to be complete
    public static void markTaskComplete()
    {
        System.out.println("This task has been completed!");
        controller.markTaskComplete();
    }

    // Sets a task to be incomplete
    public static void markTaskIncomplete()
    {
        System.out.println("Nevermind, this task has not been completed:(");
        controller.markTaskIncomplete();
    }

    // Gets user info to set a reminder
    public static void setReminder()
    {  
        String timeString;

        if (!SystemTray.isSupported()) {
            System.err.println("System tray not supported! No reminder can be set");
            return;
        }
        
        System.out.println("Please enter a caption and content for this reminder: ");
        System.out.print("Caption: ");
        String reminderCaption = scanner.nextLine();
        System.out.print("Content: ");
        String reminderContent = scanner.nextLine();

        System.out.println("Please enter the time for this reminder to notify you: ");
        boolean check = false;
        do {
            System.out.print("Format is 'M/d/yyyy h:mm AM/PM' (e.g., 4/24/2042 4:42 PM): ");
            timeString = scanner.nextLine();

            DateFormat dateParseTest = new SimpleDateFormat("M/d/yyyy h:mm a");
            try {
                dateParseTest.parse(timeString);
                check = false;
            } catch (ParseException e) {
                System.out.println("Please try again");
                check = true;
            }
        } while (check);

        controller.setReminder(reminderCaption, reminderContent, timeString);
    }

    // Deletes a reminder
    public static void deleteReminder()
    {
        boolean cancelled = controller.deleteReminder();
        if(cancelled) {
            System.out.println("The reminder has been deleted!");
        }
        else {
            System.out.println("There is no reminder to delete!");
        }
    }
}