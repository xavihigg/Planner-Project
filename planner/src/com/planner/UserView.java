package com.planner;

import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.planner.Controller;
import com.planner.Model.Account;
import com.planner.Model.Event;
import com.planner.Model.Task;

public class UserView {
    static Scanner scanner = new Scanner(System.in);

    static Controller controller = new Controller();

    public static void main(String[] args) {
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();

        task1.setTaskName("largest");
        task2.setTaskName("smallest");
        task3.setTaskName("yessir");
        task1.setTaskDueDate("21001203");
        task2.setTaskDueDate("20191103");
        task3.setTaskDueDate("20191105");

        Account.tasks.add(task1);
        Account.tasks.add(task2);
        Account.tasks.add(task3);

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
        mainMenu();
        exitProgram();
        System.out.println("thanks for using the program");
    }

    public static void mainMenu() {

        CreateCalendar cal = new CreateCalendar();
        Event event1 = new Event("help", "sadf", "asd", "asdf", "asdf");
        Event event2 = new Event("bye", "sadf", "asd", "asdf", "asdf");
        Event event3 = new Event("hello", "sadf", "asd", "asdf", "asdf");

        cal.january.get(3).add(event1);
        cal.january.get(3).add(event2);
        cal.january.get(3).add(event3);


        System.out.println("This is the main menu");
        System.out.println(" 1     CreateCalendar");
        System.out.println(" 2     Create Task");
        System.out.println(" 3     Create Category");
        System.out.println(" 4     Get Weather ");
        System.out.println(" 5     Merge event");
        System.out.println(" 6     Merge task");
        System.out.println(" 7     Sort tasks");
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
                case 5:
                    mergeEvent();
                    break;
                case 6:
                    mergeTask();
                    break;
                case 7:
                    sortTasks();
                    break;
                case 8:
                    generateSchedule();
                    break;
                default:
                    System.out.println("not a choice");
                    break;
            }
            System.out.println(" 1     CreateCalendar");
            System.out.println(" 2     Create Task");
            System.out.println(" 3     Create Category");
            System.out.println(" 4     Get Weather ");
            System.out.println(" 5     Merge event");
            System.out.println(" 6     Merge task");
            System.out.println(" 7     Sort tasks");
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
        System.out.println("Please enter the month in lowercase");
        String userChoice3 = scanner.nextLine();

        String output = controller.mergeTask(userChoice, userChoice2);
        System.out.println(output);
    }

    public static void sortTasks() {
        System.out.println(controller.sortTasks());
    }

    public static void generateSchedule() {
        ArrayList<String> output = controller.generateSchedule();
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }

    //////////////////// Will Y Use Cases ////////////////////////////////////////////

    // Gets user info to create a task
//    public static void createTask()
//    {
//        System.out.println("Please enter the name, content, and due date for this task: ");
//        System.out.print("Name: ");
//        String taskName = scanner.nextLine();
//        System.out.print("Content: ");
//        String taskContent = scanner.nextLine();
//        System.out.print("Due date (type 'none' if task not time sensitive): ");
//        String taskDueDate = scanner.nextLine();
//        if (taskDueDate.toUpperCase().toCharArray()[0] == 'N') {
//            taskDueDate = "whenever";
//        }
//
//        controller.createTask(taskName, taskContent, taskDueDate);
//    }
//
//    // Allows user to edit attributes of the task until opting to exit
//    public static void editTask()
//    {
//        char toEdit = 'A';
//
//        while (toEdit != 'Z') {
//            System.out.println("Would you like to edit the name, content, or due date of this task?");
//            System.out.print("Enter N, C, or D (Z to go back): ");
//            toEdit = scanner.nextLine().toUpperCase().toCharArray()[0];
//
//            switch (toEdit) {
//                case 'N': System.out.print("Enter a new name for this task: ");
//                    String taskName = scanner.nextLine();
//                    controller.editTask(taskName, toEdit);
//                    break;
//                case 'C': System.out.print("Enter new contents for this task: ");
//                    String taskContent = scanner.nextLine();
//                    controller.editTask(taskContent, toEdit);
//                    break;
//                case 'D': System.out.print("Enter a new due date for this task: ");
//                    String taskDueDate = scanner.nextLine();
//                    controller.editTask(taskDueDate, toEdit);
//                    break;
//                case 'Z': break;
//
//                default:  System.out.println("Please try again");
//                    break;
//            }
//        }
//        toEdit = 'A';
//    }
//
//    // Sets a task to be complete
//    public static void markTaskComplete()
//    {
//        System.out.println("This task has been completed!");
//        controller.markTaskComplete();
//    }
//
//    // Sets a task to be incomplete
//    public static void markTaskIncomplete()
//    {
//        System.out.println("Nevermind, this task has not been completed:(");
//        controller.markTaskIncomplete();
//    }
//
//    // Gets user info to set a reminder
//    public static void setReminder()
//    {
//        String timeString;
//
//        if (!SystemTray.isSupported()) {
//            System.err.println("System tray not supported! No reminder can be set");
//            return;
//        }
//
//        System.out.println("Please enter a caption and content for this reminder: ");
//        System.out.print("Caption: ");
//        String reminderCaption = scanner.nextLine();
//        System.out.print("Content: ");
//        String reminderContent = scanner.nextLine();
//
//        System.out.println("Please enter the time for this reminder to notify you: ");
//        boolean check = false;
//        do {
//            System.out.print("Format is 'M/d/yyyy h:mm AM/PM' (e.g., 4/24/2042 4:42 PM): ");
//            timeString = scanner.nextLine();
//
//            DateFormat dateParseTest = new SimpleDateFormat("M/d/yyyy h:mm a");
//            try {
//                dateParseTest.parse(timeString);
//                check = false;
//            } catch (ParseException e) {
//                System.out.println("Please try again");
//                check = true;
//            }
//        } while (check);
//
//        controller.setReminder(reminderCaption, reminderContent, timeString);
//    }
//
//    // Deletes a reminder
//    public static void deleteReminder()
//    {
//        boolean cancelled = controller.deleteReminder();
//        if(cancelled) {
//            System.out.println("The reminder has been deleted!");
//        }
//        else {
//            System.out.println("There is no reminder to delete!");
//        }
//    }
}