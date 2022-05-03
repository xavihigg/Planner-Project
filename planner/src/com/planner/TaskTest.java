public class TaskTest {
    
    public static void main(String [] args) {
        createTaskTest();
        editTaskTestN();
        editTaskTestC();
        editTaskTestD();
        editTaskTestDefault();
        markTaskCompleteTest();
        markTaskIncompleteTest();
    }

    static Task t = new Task();

    public static void createTaskTest()
    {
        t.createTask("TaskTest", "This is a test", "Now");

        if ("TaskTest" == t.getTaskName()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        if ("This is a test" == t.getTaskContent()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        if ("Now" == t.getTaskDueDate()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    /* Whitebox testing this one */
    public static void editTaskTestN()
    {  
        t.editTask("NewTask", 'N');

        if ("NewTask" == t.getTaskName()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static void editTaskTestC()
    {  
        t.editTask("NewContent", 'C');

        if ("NewContent" == t.getTaskContent()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static void editTaskTestD()
    {  
        t.editTask("NewDate", 'D');

        if ("NewDate" == t.getTaskDueDate()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static void editTaskTestDefault()
    {  
        t.editTask("NewTest", 'A');

        if ("NewTask" == t.getTaskName()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void markTaskCompleteTest()
    {
        t.markTaskComplete();

        if (true == t.getIsComplete()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void markTaskIncompleteTest()
    {
        t.markTaskIncomplete();

        if (false == t.getIsComplete()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}