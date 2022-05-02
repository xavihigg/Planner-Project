package com.planner;

import com.google.gson.*;

import com.planner.Model.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Controller {
    static Account user;
    public String getWeather(String city) {
        String key = "62473edf8cdf5b5a3b62eeaf18ed5cd7";
        String exampleUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + key+ "&units=imperial";
        String toReturn = null;
        try {
            URL url = new URL(exampleUrl);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                toReturn = "HttpResponseCode: " + responseCode + "";
                return toReturn;
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                JsonElement jsonElement = new JsonParser().parse(String.valueOf(informationString)); // Json Element from response
                JsonObject jsonObject = jsonElement.getAsJsonObject(); // Make response into json object
                JsonObject main = (JsonObject) jsonObject.get("main"); // Main is the ID where weather is held
                toReturn = String.valueOf(main.get("temp")); // Get the value for the temperature
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    public String mergeEvent(String eventOne, String eventTwo) {
        // Validate the inputs
        boolean validOne = false, validTwo = false;
        int locationOne = 0;
        int locationTwo = 0;
        for (int i = 0; i < Account.events.toArray().length; i++) {
            if (Account.events.get(i).equals(eventOne)) {
                validOne = true;
                locationOne = i;
            }
            if (Account.events.get(i).equals(eventTwo)) {
                validTwo = true;
                locationTwo = i;
            }
        }

        if(!validOne && !validTwo) {
            return "Neither event exists";
        } else if (!validOne) {
            return eventOne + " does not exist";
        } else if (!validTwo) {
            return eventTwo + " does not exist";
        }

        String titleOne = Account.events.get(locationOne).getTitle();
        String titleTwo = Account.events.get(locationTwo).getTitle();

        String descOne = Account.events.get(locationOne).getDesc();
        String descTwo = Account.events.get(locationTwo).getDesc();

        Account.events.get(locationTwo).setTitle(titleTwo + " & " + titleOne);
        Account.events.get(locationTwo).setDesc(descTwo + "\n" + descOne);

        //Account.events.get(locationOne).delete()
        return "merge successful";
    }

    public String mergeTask(String eventOne, String eventTwo) {
        // Validate the inputs
        boolean validOne = false, validTwo = false;
        int locationOne = 0;
        int locationTwo = 0;
        for (int i = 0; i < Account.tasks.toArray().length; i++) {
            if (Account.tasks.get(i).equals(eventOne)) {
                validOne = true;
                locationOne = i;
            }
            if (Account.tasks.get(i).equals(eventTwo)) {
                validTwo = true;
                locationTwo = i;
            }
        }

        if(!validOne && !validTwo) {
            return "Neither event exists";
        } else if (!validOne) {
            return eventOne + " does not exist";
        } else if (!validTwo) {
            return eventTwo + " does not exist";
        }

//        String titleOne = Account.tasks.get(locationOne).getTitle();
//        String titleTwo = Account.tasks.get(locationTwo).getTitle();
//
//        String descOne = Account.tasks.get(locationOne).getDesc();
//        String descTwo = Account.tasks.get(locationTwo).getDesc();
//
//        Account.tasks.get(locationTwo).setTitle(titleTwo + " & " + titleOne);
//        Account.tasks.get(locationTwo).setDesc(descTwo + "\n" + descOne);

        //Account.events.get(locationOne).delete()
        return "merge successful";
    }

    public static void sortTasks() {

    }
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        Account test = new Account("test","test");
        String username;
        String password;
        System.out.println("Username?");
        username = scanner.nextLine();
        System.out.println("Password?");
        password = scanner.nextLine();
        if(test.login(username,password)){
            user = test;
        }
        scanner.close();
    }
    
    public static void logout(){
        user = null;
    }
    
    public static void createAccount(){
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Username?");
        username = scanner.nextLine();
        System.out.println("Password?");
        password = scanner.nextLine();
        user = new Account(username, password);
        scanner.close();
    }
    
    public static void editAccount(){
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        System.out.println("New Username?");
        username = scanner.nextLine();
        System.out.println("New Password?");
        password = scanner.nextLine();
        user = new Account(username, password);
        scanner.close();
    }
    
    public static void deleteAccount(){
        logout();
    }
}
