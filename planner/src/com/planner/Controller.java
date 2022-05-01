package com.planner;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.*;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Controller {

    public String getWeather(String city, String state) {
        String key = "62473edf8cdf5b5a3b62eeaf18ed5cd7";
        String exampleUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "," + state + "&appid="+ key;
        try {
            URL url = new URL(exampleUrl);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                System.out.println(informationString);

                JSONParser parse = new JSONParser();
                JsonArray dataObect = (JsonArray) parse.parse(String.valueOf(informationString));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "weather";
    }
}
