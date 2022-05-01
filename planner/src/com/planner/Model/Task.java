import java.io.FilterInputStream;
import java.util.*;

public class Task {

    Scanner scan = new Scanner(new FilterInputStream(System.in){public void close(){}});
    private String taskName;
    private String taskContent;
    private String taskDueDate;
    private boolean isComplete = false;
    private char toEdit = 'A';

    // Gets user info to create a task
    void createTask()
    {
        System.out.println("Please enter the name, content, and due date for this task: ");
        System.out.print("Name: ");
        taskName = scan.nextLine();
        System.out.print("Content: ");
        taskContent = scan.nextLine();
        System.out.print("Due date (type 'none' if task not time sensitive): ");
        taskDueDate = scan.nextLine();
        if (taskDueDate.toUpperCase().toCharArray()[0] == 'N') {
            taskDueDate = "whenever";
        }
    }

    // Allows user to edit attributes of the task until opting to exit
    void editTask()
    {   
        while (toEdit != 'Z') {
            System.out.println("Would you like to edit the name, content, or due date of this task?");
            System.out.print("Enter N, C, or D (Z to go back): ");
            toEdit = scan.nextLine().toUpperCase().toCharArray()[0];

            switch (toEdit) {
                case 'N': System.out.print("Enter a new name for this task: ");
                        taskName = scan.nextLine();
                        break;
                case 'C': System.out.print("Enter new contents for this task: ");
                        taskContent = scan.nextLine();
                        break;
                case 'D': System.out.print("Enter a new due date for this task: ");
                        taskDueDate = scan.nextLine();
                        break;
                case 'Z': break;

                default:  System.out.println("Please try again");
                        break;
            }
        }
        toEdit = 'A';
    }

    // Sets the task to be complete
    void markTaskComplete()
    {
        System.out.println("This task has been completed!");
        isComplete = true;
    }

    // Sets the task to be incomplete
    void markTaskIncomplete()
    {
        System.out.println("Nevermind, this task has not been completed:(");
        isComplete = false;
    }
 
    // Example print method; format may be changed later
    public void printTask()
    {
        System.out.println(taskName + " -> " + taskContent + " BY " + taskDueDate);
        System.out.println("Complete?... " + isComplete);
    }
}