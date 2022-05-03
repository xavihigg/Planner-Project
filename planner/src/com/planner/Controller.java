package com.planner;

import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.planner.Model.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import java.time.*;

public class Controller {
    static Account user;
    static JsonHandler classSaver;
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
        Event eventOneCopy = new Event();
        Event eventTwoCopy = new Event();
        String monthOne = "";

        int cord1 = 0;
        int cord2 = 0;
        int cord3 = 0;
        int cord4 = 0;

        for (int i = 0; i < CreateCalendar.january.size(); i++) {
            for (int j = 0; j < CreateCalendar.january.get(i).size(); j++) {
                if(CreateCalendar.january.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.january.get(i).get(j);
                    monthOne = "january";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.january.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.january.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.february.size(); i++) {
            for (int j = 0; j < CreateCalendar.february.get(i).size(); j++) {
                if(CreateCalendar.february.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.february.get(i).get(j);
                    monthOne = "february";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.february.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.february.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.march.size(); i++) {
            for (int j = 0; j < CreateCalendar.march.get(i).size(); j++) {
                if(CreateCalendar.march.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.march.get(i).get(j);
                    monthOne = "march";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.march.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.march.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.april.size(); i++) {
            for (int j = 0; j < CreateCalendar.april.get(i).size(); j++) {
                if(CreateCalendar.april.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.april.get(i).get(j);
                    monthOne = "april";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.april.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.april.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.april.size(); i++) {
            for (int j = 0; j < CreateCalendar.april.get(i).size(); j++) {
                if(CreateCalendar.april.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.april.get(i).get(j);
                    monthOne = "april";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.april.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.april.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.may.size(); i++) {
            for (int j = 0; j < CreateCalendar.may.get(i).size(); j++) {
                if(CreateCalendar.may.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.may.get(i).get(j);
                    monthOne = "january";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.may.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.may.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.june.size(); i++) {
            for (int j = 0; j < CreateCalendar.june.get(i).size(); j++) {
                if(CreateCalendar.june.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.june.get(i).get(j);
                    monthOne = "june";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.june.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.june.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.july.size(); i++) {
            for (int j = 0; j < CreateCalendar.july.get(i).size(); j++) {
                if(CreateCalendar.july.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.july.get(i).get(j);
                    monthOne = "july";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.july.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.july.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.august.size(); i++) {
            for (int j = 0; j < CreateCalendar.august.get(i).size(); j++) {
                if(CreateCalendar.august.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.august.get(i).get(j);
                    monthOne = "august";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.august.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.august.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.september.size(); i++) {
            for (int j = 0; j < CreateCalendar.september.get(i).size(); j++) {
                if(CreateCalendar.september.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.september.get(i).get(j);
                    monthOne = "september";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.september.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.september.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.october.size(); i++) {
            for (int j = 0; j < CreateCalendar.october.get(i).size(); j++) {
                if(CreateCalendar.october.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.october.get(i).get(j);
                    monthOne = "october";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.october.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.october.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.november.size(); i++) {
            for (int j = 0; j < CreateCalendar.november.get(i).size(); j++) {
                if(CreateCalendar.november.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.november.get(i).get(j);
                    monthOne = "november";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.november.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.november.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < CreateCalendar.december.size(); i++) {
            for (int j = 0; j < CreateCalendar.december.get(i).size(); j++) {
                if(CreateCalendar.december.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = CreateCalendar.december.get(i).get(j);
                    monthOne = "december";
                    cord1 = i;
                    cord2 = j;
                }
                if(CreateCalendar.december.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = CreateCalendar.december.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        if(!validOne && !validTwo) {
            return "Neither event exists";
        } else if (!validOne) {
            return eventOne + " does not exist";
        } else if (!validTwo) {
            return eventTwo + " does not exist";
        }

        eventTwoCopy.setTitle(eventTwoCopy.getTitle() + " & " + eventOneCopy.getTitle());
        eventTwoCopy.setDesc(eventTwoCopy.getDesc() + " & " + eventOneCopy.getDesc());

        switch(monthOne) {
            case "january":
                CreateCalendar.january.get(cord1).remove(cord2);
                break;
            case "february":
                CreateCalendar.february.get(cord1).remove(cord2);
                break;
            case "march":
                CreateCalendar.march.get(cord1).remove(cord2);
                break;
            case "april":
                CreateCalendar.april.get(cord1).remove(cord2);
                break;
            case "may":
                CreateCalendar.may.get(cord1).remove(cord2);
                break;
            case "june":
                CreateCalendar.june.get(cord1).remove(cord2);
                break;
            case "july":
                CreateCalendar.july.get(cord1).remove(cord2);
                break;
            case "august":
                CreateCalendar.august.get(cord1).remove(cord2);
                break;
            case "september":
                CreateCalendar.september.get(cord1).remove(cord2);
                break;
            case "october":
                CreateCalendar.october.get(cord1).remove(cord2);
                break;
            case "november":
                CreateCalendar.november.get(cord1).remove(cord2);
                break;
            case "december":
                CreateCalendar.december.get(cord1).remove(cord2);
                break;

        }

        System.out.println(CreateCalendar.january.get(cord3).get(cord4).getTitle());
        return "merge successful, the new name is: " + CreateCalendar.january.get(cord3).get(cord4).getTitle();
    }

    public String mergeTask(String taskOne, String taskTwo) {
        // Validate the inputs
        boolean validOne = false, validTwo = false;
        int locationOne = 0;
        int locationTwo = 0;
        for (int i = 0; i < Account.tasks.toArray().length; i++) {
            System.out.println(Account.tasks.get(i).getTaskName());
            if (Account.tasks.get(i).getTaskName().equals(taskOne)) {
                validOne = true;
                locationOne = i;
            }
            if (Account.tasks.get(i).getTaskName().equals(taskTwo)) {
                validTwo = true;
                locationTwo = i;
            }
        }

        if(!validOne && !validTwo) {
            return "Neither event exists";
        } else if (!validOne) {
            return taskOne + " does not exist";
        } else if (!validTwo) {
            return taskTwo + " does not exist";
        }

        String titleOne = Account.tasks.get(locationOne).getTaskName();
        String titleTwo = Account.tasks.get(locationTwo).getTaskName();

        String descOne = Account.tasks.get(locationOne).getTaskContent();
        String descTwo = Account.tasks.get(locationTwo).getTaskContent();

       Account.tasks.get(locationTwo).setTaskName(titleTwo + " & " + titleOne);
        Account.tasks.get(locationTwo).setTaskContent(descTwo + "\n" + descOne);


        Account.tasks.remove(locationOne);
        return "merge successful";
    }

    public String sortTasks() {
        ArrayList<Task>tasksCopy = (ArrayList<Task>) Account.tasks.clone();
        int length = tasksCopy.toArray().length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (Integer.parseInt(tasksCopy.get(j).getTaskDueDate()) > Integer.parseInt(tasksCopy.get(j + 1).getTaskDueDate())) {
                    Task temp = tasksCopy.get(j);
                    tasksCopy.set(j, tasksCopy.get(j + 1));
                    tasksCopy.set(j + 1, temp);
                }
            }
        }

        String output = tasksCopy.get(0).getTaskName();
        for (int i = 1; i < length; i++) {
            output = output + " -> " + tasksCopy.get(i).getTaskName();
        }
        return output;
    }

    public ArrayList<String> generateSchedule() {
        DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
        ArrayList<String> output = new ArrayList<String>();

        LocalDate now = LocalDate.now();
        int dayNum = Integer.parseInt(day.format(now));
        int target;

        switch(month.format(now)) {
            case "05":
                if (dayNum + 7 > CreateCalendar.january.size()) {
                    target = CreateCalendar.january.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.january.get(i).size(); j++) {
                        output.add(CreateCalendar.january.get(i).get(j).getTitle());
                    }
                }
                break;
            case "02":
                if (dayNum + 7 > CreateCalendar.february.size()) {
                    target = CreateCalendar.february.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.february.get(i).size(); j++) {
                        output.add(CreateCalendar.february.get(i).get(j).getTitle());
                    }
                }
                break;
            case "03":
                if (dayNum + 7 > CreateCalendar.march.size()) {
                    target = CreateCalendar.march.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.march.get(i).size(); j++) {
                        output.add(CreateCalendar.march.get(i).get(j).getTitle());
                    }
                }
                break;
            case "04":
                if (dayNum + 7 > CreateCalendar.april.size()) {
                    target = CreateCalendar.april.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.april.get(i).size(); j++) {
                        output.add(CreateCalendar.april.get(i).get(j).getTitle());
                    }
                }
                break;
            case "05":
                if (dayNum + 7 > CreateCalendar.may.size()) {
                    target = CreateCalendar.may.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.may.get(i).size(); j++) {
                        output.add(CreateCalendar.may.get(i).get(j).getTitle());
                    }
                }
                break;
            case "06":
                if (dayNum + 7 > CreateCalendar.june.size()) {
                    target = CreateCalendar.june.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.june.get(i).size(); j++) {
                        output.add(CreateCalendar.june.get(i).get(j).getTitle());
                    }
                }
                break;
            case "07":
                if (dayNum + 7 > CreateCalendar.july.size()) {
                    target = CreateCalendar.july.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.july.get(i).size(); j++) {
                        output.add(CreateCalendar.july.get(i).get(j).getTitle());
                    }
                }
                break;
            case "08":
                if (dayNum + 7 > CreateCalendar.august.size()) {
                    target = CreateCalendar.august.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.august.get(i).size(); j++) {
                        output.add(CreateCalendar.august.get(i).get(j).getTitle());
                    }
                }
                break;
            case "09":
                if (dayNum + 7 > CreateCalendar.september.size()) {
                    target = CreateCalendar.september.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.september.get(i).size(); j++) {
                        output.add(CreateCalendar.september.get(i).get(j).getTitle());
                    }
                }
                break;
            case "10":
                if (dayNum + 7 > CreateCalendar.october.size()) {
                    target = CreateCalendar.october.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.october.get(i).size(); j++) {
                        output.add(CreateCalendar.october.get(i).get(j).getTitle());
                    }
                }
                break;
            case "11":
                if (dayNum + 7 > CreateCalendar.november.size()) {
                    target = CreateCalendar.november.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.november.get(i).size(); j++) {
                        output.add(CreateCalendar.november.get(i).get(j).getTitle());
                    }
                }
                break;
            case "12":
                if (dayNum + 7 > CreateCalendar.december.size()) {
                    target = CreateCalendar.december.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < CreateCalendar.december.get(i).size(); j++) {
                        output.add(CreateCalendar.december.get(i).get(j).getTitle());
                    }
                }
                break;
        }
        return output;
    }

    public static boolean login(String username, String password){
        Account test = classSaver.accountReadFromFile(username);
        if(test != null){
            if(test.login(username,password)){
                user = test;
                System.out.println("logged into user:" + test.getusername());
                return true;
            }
            else
            {
                System.out.println("incorect username or password");
                return false;
            }
        }
        else{
            System.out.println("incorect username or password"); 
            return false;
        }
    }

    public static void logout(){
        if(user.logout()){
            user = null;
        }
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
        Gson gson = new Gson();
        classSaver.accountWriteToFile(gson.toJson(user),user.getusername());
        scanner.close();
    }

    public static void editAccount(String username, String password){
        user = new Account(username, password);
        Gson gson = new Gson();
        classSaver.accountWriteToFile(gson.toJson(user),user.getusername());
    }

    public static void deleteAccount(){
        String temp = user.getusername();
        user = null;
        Gson gson = new Gson();
        classSaver.accountWriteToFile(gson.toJson(user),temp);
        logout();
    }

    public static void deleteAccount(String username){
        Gson gson = new Gson();
        classSaver.accountWriteToFile(gson.toJson(null),username);
        logout();
    }

    public static boolean createProfile(String Occupation,String OccupationTitle,String Location){
        return(user.createProfile(Occupation,OccupationTitle,Location));
    }

    public static void editProfile(String Occupation,String OccupationTitle,String Location){
        user.editProfile(Occupation,OccupationTitle,Location);
    }

    public static String viewOccupation(){
        return user.viewOccupation();
    }

    public static String viewTitle(){
        return user.viewTitle();
    }

    public static String viewLocation(){
        return user.viewLocation();
    }

    public static void deleteProfile(){
        user.deleteProfile();
    }

    public static void deleteProfiel(){
        user.deleteProfile();
    }

    //////////////////// Will Y Use Cases ////////////////////////////////////////////

    // Pass task creation info to Model
//    public void createTask(String taskName, String taskContent, String taskDueDate)
//    {
//        model.createTask(taskName, taskContent, taskDueDate);
//    }
//
//    // Pass task editing info to Model
//    public void editTask(String taskInfo, char toEdit)
//    {
//        model.editTask(taskInfo, toEdit);
//    }
//
//    // Pass completion to Model
//    public void markTaskComplete()
//    {
//        model.markTaskComplete();
//    }
//
//    // Pass incompletion to Model
//    public void markTaskIncomplete()
//    {
//        model.markTaskIncomplete();
//    }
//
//    // Pass reminder info to Model
//    public void setReminder(String reminderCaption, String reminderContent, String timeString)
//    {
//        model.setReminder(reminderCaption, reminderContent, timeString);
//    }
//
//    // Pass deletion to Model
//    public boolean deleteReminder()
//    {
//        return model.deleteReminder();
//    }

    //////////////////// Will Y Use Cases ////////////////////////////////////////////

    // Pass task creation info to Model
    public void createTask(String taskName, String taskContent, String taskDueDate)
    {
        model.createTask(taskName, taskContent, taskDueDate);
    }

    // Pass task editing info to Model
    public void editTask(String taskInfo, char toEdit)
    {
        model.editTask(taskInfo, toEdit);
    }

    // Pass completion to Model
    public void markTaskComplete()
    {
        model.markTaskComplete();
    }

    // Pass incompletion to Model
    public void markTaskIncomplete()
    {
        model.markTaskIncomplete();
    }

    // Pass reminder info to Model
    public void setReminder(String reminderCaption, String reminderContent, String timeString)
    {
        model.setReminder(reminderCaption, reminderContent, timeString);
    }

    // Pass deletion to Model
    public boolean deleteReminder()
    {
        return model.deleteReminder();
    }
}
