package com.planner;

import com.google.gson.*;

import com.planner.Model.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
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
}
