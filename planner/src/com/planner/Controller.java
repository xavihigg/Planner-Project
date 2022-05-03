package com.planner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.planner.Model.Account;
import com.planner.Model.Task;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
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

//    public String mergeEvent (String eventOne, String eventTwo) {
//        // Validate the inputs
//        boolean validOne = false, validTwo = false;
//        int locationOne, locationTwo;
//        for (int i = 0; i < Account.events.toArray().length; i++) {
//            if (Account.events.get(i).equals(eventOne)) {
//                validOne = true;
//                locationOne = i;
//            }
//            if (Account.events.get(i).equals(eventTwo)) {
//                validTwo = true;
//                locationTwo = i;
//            }
//        }
//
//        if(!validOne && !validTwo) {
//            return "Neither event exists";
//        } else if (!validOne) {
//            return eventOne + " does not exist";
//        } else if (!validTwo) {
//            return eventTwo + " does not exist";
//        }
//
//
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

    public static boolean deleteTask(String deleteChoice) {
        ArrayList<Task> listOfTasks = Account.getTaskList();
        Iterator<Task> iterator = listOfTasks.iterator();
        Task check = iterator.next();
        while(iterator.hasNext()) {
            if(!check.getTaskName().equals(deleteChoice)) {
                check = iterator.next();
            }
        }
        if(check.getTaskName().equals(deleteChoice)) {
            listOfTasks.remove(check);
            Account.setTaskList(listOfTasks);
            return true;
        }
        return false;
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

    public boolean markTaskFavorite(String taskChoice) {
        ArrayList<Task> listOfTasks = Account.getTaskList();
        Iterator<Task> iterator = listOfTasks.iterator();
        Task check = iterator.next();
        while(iterator.hasNext()) {
            if(!check.getTaskName().equals(taskChoice)) {
                check = iterator.next();
            }
        }
        if(check.getTaskName().equals(taskChoice)) {
            check.markTaskAsFavorite();
            Account.setTaskList(listOfTasks);
            return true;
        }
        return false;
    }

    public boolean unmarkTaskFavorite(String taskChoice) {
        ArrayList<Task> listOfTasks = Account.getTaskList();
        Iterator<Task> iterator = listOfTasks.iterator();
        Task check = iterator.next();
        while(iterator.hasNext()) {
            if(!check.getTaskName().equals(taskChoice)) {
                check = iterator.next();
            }
        }
        if(check.getTaskName().equals(taskChoice)) {
            check.unmarkTaskAsFavorite();
            Account.setTaskList(listOfTasks);
            return true;
        }
        return false;
    }

    public boolean markTaskPriority(String taskChoice) {
        ArrayList<Task> listOfTasks = Account.getTaskList();
        Iterator<Task> iterator = listOfTasks.iterator();
        Task check = iterator.next();
        while(iterator.hasNext()) {
            if(!check.getTaskName().equals(taskChoice)) {
                check = iterator.next();
            }
        }
        if(check.getTaskName().equals(taskChoice)) {
            check.markTaskAsPriority();
            Account.setTaskList(listOfTasks);
            return true;
        }
        return false;
    }

    public boolean unmarkTaskPriority(String taskChoice) {
        ArrayList<Task> listOfTasks = Account.getTaskList();
        Iterator<Task> iterator = listOfTasks.iterator();
        Task check = iterator.next();
        while(iterator.hasNext()) {
            if(!check.getTaskName().equals(taskChoice)) {
                check = iterator.next();
            }
        }
        if(check.getTaskName().equals(taskChoice)) {
            check.unmarkTaskAsPriority();
            Account.setTaskList(listOfTasks);
            return true;
        }
        return false;
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
