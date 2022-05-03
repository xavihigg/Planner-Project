package com.planner;

import com.google.gson.*;
import com.google.gson.Gson;

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

        for (int i = 0; i < Calendar.january.size(); i++) {
            for (int j = 0; j < Calendar.january.get(i).size(); j++) {
                if(Calendar.january.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.january.get(i).get(j);
                    monthOne = "january";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.january.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.january.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.feburary.size(); i++) {
            for (int j = 0; j < Calendar.feburary.get(i).size(); j++) {
                if(Calendar.feburary.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.feburary.get(i).get(j);
                    monthOne = "february";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.feburary.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.feburary.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.march.size(); i++) {
            for (int j = 0; j < Calendar.march.get(i).size(); j++) {
                if(Calendar.march.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.march.get(i).get(j);
                    monthOne = "march";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.march.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.march.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.april.size(); i++) {
            for (int j = 0; j < Calendar.april.get(i).size(); j++) {
                if(Calendar.april.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.april.get(i).get(j);
                    monthOne = "april";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.april.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.april.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.april.size(); i++) {
            for (int j = 0; j < Calendar.april.get(i).size(); j++) {
                if(Calendar.april.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.april.get(i).get(j);
                    monthOne = "april";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.april.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.april.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.may.size(); i++) {
            for (int j = 0; j < Calendar.may.get(i).size(); j++) {
                if(Calendar.may.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.may.get(i).get(j);
                    monthOne = "january";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.may.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.may.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.june.size(); i++) {
            for (int j = 0; j < Calendar.june.get(i).size(); j++) {
                if(Calendar.june.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.june.get(i).get(j);
                    monthOne = "june";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.june.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.june.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.july.size(); i++) {
            for (int j = 0; j < Calendar.july.get(i).size(); j++) {
                if(Calendar.july.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.july.get(i).get(j);
                    monthOne = "july";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.july.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.july.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.august.size(); i++) {
            for (int j = 0; j < Calendar.august.get(i).size(); j++) {
                if(Calendar.august.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.august.get(i).get(j);
                    monthOne = "august";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.august.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.august.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.september.size(); i++) {
            for (int j = 0; j < Calendar.september.get(i).size(); j++) {
                if(Calendar.september.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.september.get(i).get(j);
                    monthOne = "september";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.september.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.september.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.october.size(); i++) {
            for (int j = 0; j < Calendar.october.get(i).size(); j++) {
                if(Calendar.october.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.october.get(i).get(j);
                    monthOne = "october";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.october.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.october.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.november.size(); i++) {
            for (int j = 0; j < Calendar.november.get(i).size(); j++) {
                if(Calendar.november.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.november.get(i).get(j);
                    monthOne = "november";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.november.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.november.get(i).get(j);
                    cord3 = i;
                    cord4 = j;
                }
            }
        }

        for (int i = 0; i < Calendar.december.size(); i++) {
            for (int j = 0; j < Calendar.december.get(i).size(); j++) {
                if(Calendar.december.get(i).get(j).getTitle().equals(eventOne)) {
                    validOne = true;
                    eventOneCopy = Calendar.december.get(i).get(j);
                    monthOne = "december";
                    cord1 = i;
                    cord2 = j;
                }
                if(Calendar.december.get(i).get(j).getTitle().equals(eventTwo)) {
                    validTwo = true;
                    eventTwoCopy = Calendar.december.get(i).get(j);
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
                Calendar.january.get(cord1).remove(cord2);
                break;
            case "february":
                Calendar.feburary.get(cord1).remove(cord2);
                break;
            case "march":
                Calendar.march.get(cord1).remove(cord2);
                break;
            case "april":
                Calendar.april.get(cord1).remove(cord2);
                break;
            case "may":
                Calendar.may.get(cord1).remove(cord2);
                break;
            case "june":
                Calendar.june.get(cord1).remove(cord2);
                break;
            case "july":
                Calendar.july.get(cord1).remove(cord2);
                break;
            case "august":
                Calendar.august.get(cord1).remove(cord2);
                break;
            case "september":
                Calendar.september.get(cord1).remove(cord2);
                break;
            case "october":
                Calendar.october.get(cord1).remove(cord2);
                break;
            case "november":
                Calendar.november.get(cord1).remove(cord2);
                break;
            case "december":
                Calendar.december.get(cord1).remove(cord2);
                break;

        }

        System.out.println(Calendar.january.get(cord3).get(cord4).getTitle());
        return "merge successful, the new name is: " + Calendar.january.get(cord3).get(cord4).getTitle();
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

        if (length == 0) {
            return "Array is Empty";
        }

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
            case "01":
                if (dayNum + 7 > Calendar.january.size()) {
                    target = Calendar.january.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.january.get(i).size(); j++) {
                        output.add(Calendar.january.get(i).get(j).getTitle());
                    }
                }
                break;
            case "02":
                if (dayNum + 7 > Calendar.feburary.size()) {
                    target = Calendar.feburary.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.feburary.get(i).size(); j++) {
                        output.add(Calendar.feburary.get(i).get(j).getTitle());
                    }
                }
                break;
            case "03":
                if (dayNum + 7 > Calendar.march.size()) {
                    target = Calendar.march.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.march.get(i).size(); j++) {
                        output.add(Calendar.march.get(i).get(j).getTitle());
                    }
                }
                break;
            case "04":
                if (dayNum + 7 > Calendar.april.size()) {
                    target = Calendar.april.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.april.get(i).size(); j++) {
                        output.add(Calendar.april.get(i).get(j).getTitle());
                    }
                }
                break;
            case "05":
                if (dayNum + 7 > Calendar.may.size()) {
                    target = Calendar.may.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.may.get(i).size(); j++) {
                        output.add(Calendar.may.get(i).get(j).getTitle());
                    }
                }
                break;
            case "06":
                if (dayNum + 7 > Calendar.june.size()) {
                    target = Calendar.june.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.june.get(i).size(); j++) {
                        output.add(Calendar.june.get(i).get(j).getTitle());
                    }
                }
                break;
            case "07":
                if (dayNum + 7 > Calendar.july.size()) {
                    target = Calendar.july.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.july.get(i).size(); j++) {
                        output.add(Calendar.july.get(i).get(j).getTitle());
                    }
                }
                break;
            case "08":
                if (dayNum + 7 > Calendar.august.size()) {
                    target = Calendar.august.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.august.get(i).size(); j++) {
                        output.add(Calendar.august.get(i).get(j).getTitle());
                    }
                }
                break;
            case "09":
                if (dayNum + 7 > Calendar.september.size()) {
                    target = Calendar.september.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.september.get(i).size(); j++) {
                        output.add(Calendar.september.get(i).get(j).getTitle());
                    }
                }
                break;
            case "10":
                if (dayNum + 7 > Calendar.october.size()) {
                    target = Calendar.october.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.october.get(i).size(); j++) {
                        output.add(Calendar.october.get(i).get(j).getTitle());
                    }
                }
                break;
            case "11":
                if (dayNum + 7 > Calendar.november.size()) {
                    target = Calendar.november.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.november.get(i).size(); j++) {
                        output.add(Calendar.november.get(i).get(j).getTitle());
                    }
                }
                break;
            case "12":
                if (dayNum + 7 > Calendar.december.size()) {
                    target = Calendar.december.size();
                } else {
                    target = dayNum + 7;
                }
                for (int i = dayNum; i < target; i++) {
                    for (int j = 0; j < Calendar.december.get(i).size(); j++) {
                        output.add(Calendar.december.get(i).get(j).getTitle());
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

    public static void createAccount(String username, String password){
        user = new Account(username, password);
        Gson gson = new Gson();
        classSaver.accountWriteToFile(gson.toJson(user),user.getusername());
    }

    public static void editAccount(String username, String password){
        deleteAccount();
        user = new Account(username, password);
        Gson gson = new Gson();
        classSaver.accountWriteToFile(gson.toJson(user),user.getusername());
    }

    public static void deleteAccount(){
        String temp = user.getusername();
        user = null;
        Gson gson = new Gson();
        classSaver.accountWriteToFile(gson.toJson(user),temp);
        //logout();
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
    //////////////////// Will Y Use Cases ////////////////////////////////////////////

    // Pass task creation info to Model
    public void createTask(String taskName, String taskContent, String taskDueDate)
    {
        Task test = new Task();
        test.createTask(taskName, taskContent, taskDueDate);
        Account.tasks.add(test);
    }

    // Pass task editing info to Model
    Task t = new Task();
    Reminder r = new Reminder();
    public void editTask(String taskInfo, char toEdit)
    {
        t.editTask(taskInfo, toEdit);
    }

    // Pass completion to Model
    public void markTaskComplete()
    {
        t.markTaskComplete();
    }

    // Pass incompletion to Model
    public void markTaskIncomplete()
    {
        t.markTaskIncomplete();
    }

    // Pass reminder info to Model
    public void setReminder(String reminderCaption, String reminderContent, String timeString)
    {
        r.setReminder(reminderCaption, reminderContent, timeString);
    }

    // Pass deletion to Model
    public boolean deleteReminder()
    {
        return r.deleteReminder();
    }
}
