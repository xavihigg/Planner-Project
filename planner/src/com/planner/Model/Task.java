package com.planner.Model;

public class Task {

    private String taskName;
    private String taskContent;
    private String taskDueDate;
    private boolean isComplete = false;
    private boolean isPriorty = false;
    private boolean isFavorite = false;

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
    public void markTaskComplete()
    {
        isComplete = true;
    }

    // Sets the task to be incomplete
    public void markTaskIncomplete()
    {
        isComplete = false;
    }

    //Set the task to be a favorite
    public void markTaskAsFavorite() { isFavorite = true;}

    //Remove the task as a favorite
    public void unmarkTaskAsFavorite() { isFavorite = false;}

    //Set the task to be a priority
    public void markTaskAsPriority() { isPriorty = true;}

    //Remove the task as a priority
    public void unmarkTaskAsPriority() { isPriorty = false;}

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