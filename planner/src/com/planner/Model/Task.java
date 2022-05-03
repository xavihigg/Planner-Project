package com.planner.Model;

import com.planner.Model.*;
public class Task {

    private String taskName;
    private String taskContent;
    private String taskDueDate;
    private boolean isComplete = false;

    // Creates a task
    public void createTask(String tn, String tc, String tdd)
    {
        taskName = tn;
        taskContent = tc;
        taskDueDate = tdd;
    }

    // Edits attributes of the task
    public void editTask(String taskInfo, char toEdit)
    {  
        switch (toEdit) {
            case 'N':
                    taskName = taskInfo;
                    break;
            case 'C':
                    taskContent = taskInfo;
                    break;
            case 'D':
                    taskDueDate = taskInfo;
                    break;
            default:
                    break;
        }
    }

    // Sets the task to be complete
    public void markTaskComplete()
    {
        isComplete = true;
    }

    // Sets the task to be incomplete
    public void markTaskIncomplete()
    {
        isComplete = false;
    }

    // Getters
    public String getTaskName()
    {
        return taskName;
    }

    public String getTaskContent()
    {
        return taskContent;
    }

    public String getTaskDueDate()
    {
        return taskDueDate;
    }

    public boolean getIsComplete()
    {
        return isComplete;
    }

    // Setters
    public void setTaskName(String tn)
    {
        taskName = tn;
    }

    public void setTaskContent(String tc)
    {
        taskContent = tc;
    }

    void setTaskDueDate(String tdd)
    {
        taskDueDate = tdd;
    }
}