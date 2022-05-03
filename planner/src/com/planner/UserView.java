package com.planner;

import java.util.Scanner;

import com.planner.Controller;

public class UserView {
    static Scanner scanner = new Scanner(System.in);
    static Controller controller = new Controller();
    public static void main(String[] args) {
        int userChoice = 1;
        while(userChoice != 0){
            System.out.println("Welcome to Project Planner");
            System.out.println("Would you like to login or create an account? ");
            System.out.println(" 1     Login");
            System.out.println(" 2     Create Account");
            System.out.println(" 0     Exit");
            userChoice = Integer.parseInt(scanner.nextLine());
            switch (userChoice) {
                case 1:
                    if(login()){
                        mainMenu();
                    }
                    break;
                case 2:
                    createAccount();
                    mainMenu();
                    break;
                case 0:
                    System.out.println("thanks for using the program");
                    exitProgram();
                    break;
                default:
                    System.out.println("That was not a choice!");
            }
        }

    }

    public static void mainMenu() {
        System.out.println("test");
        int userChoice = 1; 
        while (userChoice != 0) {
            System.out.println("This is the main menu");
            System.out.println(" 1     Create Calendar");
            System.out.println(" 2     Create Task");
            System.out.println(" 3     Create Category");
            System.out.println(" 4     Get Weather ");
            System.out.println(" 5     Create Profile");
            System.out.println(" 6     Edit Profile");
            System.out.println(" 7     View Occupation");
            System.out.println(" 8     View Occupation Title");
            System.out.println(" 9     View Location ");
            System.out.println(" 10     Delete Profile");
            System.out.println(" 11     Edit Account");            
            System.out.println(" 12     Delete Account");
            System.out.println(" 0     Logout");
            userChoice = Integer.parseInt(scanner.nextLine());
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
                    //getWeather();
                    break;
                case 5:
                    createProfile();
                    break;
                case 6:
                    editProfile();
                    break;
                case 7:
                    viewOccupation();
                    break;
                case 8:
                    viewTitle();
                    break;
                case 9:
                    viewLocation();
                    break;
                case 10:
                    deleteProfile();
                    break;
                case 11:
                    editAccount();
                    break;
                case 12:
                    deleteAccount();
                    userChoice = 0;
                case 0:
                    logout();
                    break;
                default:
                    System.out.println("not a choice");
                    break;
            }

        }
    }

    public static boolean login(){
        String username;
        String password;
        System.out.println("Username?");
        username = scanner.nextLine();
        System.out.println("Password?");
        password = scanner.nextLine();
        return (controller.login(username,password));
    }

    public static void logout(){
        controller.logout();
    }

    public static void createAccount(){
        String username;
        String password;
        System.out.println("Username?");
        username = scanner.nextLine();
        System.out.println("Password?");
        password = scanner.nextLine();
        controller.createAccount(username,password);
    }

    public static void editAccount(){
        String username;
        String password;
        System.out.println("New Username?");
        username = scanner.nextLine();
        System.out.println("New Password?");
        password = scanner.nextLine();
        controller.editAccount(username,password);
    }

    public static void deleteAccount(){
        controller.deleteAccount();
    }

    public static void createProfile(){
        String Occupation;
        String OccupationTitle;
        String Location; 
        System.out.println("New Occupation?");
        Occupation = scanner.nextLine();
        System.out.println("New OccupationTitle?");
        OccupationTitle = scanner.nextLine();
        System.out.println("New Location?");
        Location = scanner.nextLine();
        if(!controller.createProfile(Occupation,OccupationTitle,Location)){
            System.out.println("Profile Already Exist");
        }
    }

    public static void editProfile(){
        String Occupation;
        String OccupationTitle;
        String Location; 
        System.out.println("New Occupation?");
        Occupation = scanner.nextLine();
        System.out.println("New OccupationTitle?");
        OccupationTitle = scanner.nextLine();
        System.out.println("New Location?");
        Location = scanner.nextLine();
        controller.editProfile(Occupation,OccupationTitle,Location);
    }

    public static void viewOccupation(){
        if(controller.viewOccupation().equals("null")){
            System.out.println("This user has not created a profile");
        }
        else{
            System.out.println("Occupation: " + controller.viewOccupation());
        }
    }

    public static void viewTitle(){
        if(controller.viewTitle().equals("null")){
            System.out.println("This user has not created a profile");
        }
        else{
            System.out.println("Occupation Title: " + controller.viewTitle());
        }
    }

    public static void  viewLocation(){
        if(controller.viewLocation().equals("null")){
            System.out.println("This user has not created a profile");
        }
        else{
            System.out.println("Location: " + controller.viewLocation());
        }
    }

    public static void deleteProfile(){
        controller.deleteProfiel();
    }

    public static void exitProgram(){

    }

}