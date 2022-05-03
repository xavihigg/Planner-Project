package com.planner.Model;

public class Task {

    private String taskName;
    private String taskContent;
    private String taskDueDate;
    private boolean isComplete = false;

    // Creates a task
    void createTask(String tn, String tc, String tdd)
    {
        taskName = tn;
        taskContent = tc;
        taskDueDate = tdd;
    }

    // Edits attributes of the task
    void editTask(String taskInfo, char toEdit)
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
    void markTaskComplete()
    {
        isComplete = true;
    }

    // Sets the task to be incomplete
    void markTaskIncomplete()
    {
        isComplete = false;
    }

    // Getters
    String getTaskName()
    {
        return taskName;
    }

    String getTaskContent()
    {
        return taskContent;
    }

    String getTaskDueDate()
    {
        return taskDueDate;
    }

    boolean getIsComplete()
    {
        return isComplete;
    }

    // Setters
    void setTaskName(String tn)
    {
        taskName = tn;
    }

    void setTaskContent(String tc)
    {
        taskContent = tc;
    }

    void setTaskDueDate(String tdd)
    {
        taskDueDate = tdd;
    }
}