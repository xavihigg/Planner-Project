package com.planner;

import com.google.gson.*;

import com.planner.Model.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

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
            if (Account.events.get(i).getTitle().equals(eventOne)) {
                validOne = true;
                locationOne = i;
            }
            if (Account.events.get(i).getTitle().equals(eventTwo)) {
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

        Account.events.remove(locationOne);
        return "merge successful";
    }

    public String mergeTask(String eventOne, String eventTwo) {
        // Validate the inputs
        boolean validOne = false, validTwo = false;
        int locationOne = 0;
        int locationTwo = 0;
        for (int i = 0; i < Account.tasks.toArray().length; i++) {
            System.out.println(Account.tasks.get(i).getTaskName());
            if (Account.tasks.get(i).getTaskName().equals(eventOne)) {
                validOne = true;
                locationOne = i;
            }
            if (Account.tasks.get(i).getTaskName().equals(eventTwo)) {
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
}
