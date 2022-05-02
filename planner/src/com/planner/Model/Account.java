package com.planner.Model;

import java.util.ArrayList;


public class Account {
    public static ArrayList<Event> events = new ArrayList<Event>();
    public static ArrayList<Task> tasks = new ArrayList<Task>();


    public static ArrayList<Task> getTaskList() {
        return tasks;
    }

    public static void setTaskList(ArrayList<Task> listOfTasks) {
        tasks = listOfTasks;
    }
}
