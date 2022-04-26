import java.io.FilterInputStream;
import java.util.*;
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.text.*;

public class Reminder extends TimerTask {
    
    Scanner scan = new Scanner(new FilterInputStream(System.in){public void close(){}});
    protected Date time;
    protected String timeString;
    private String reminderCaption;
    private String reminderContent;

    // Gets user info to set a reminder and schedules the notification
    void setReminder()
    {  
        if (!SystemTray.isSupported()) {
            System.err.println("System tray not supported! No reminder can be set");
            return;
        }
        
        System.out.println("Please enter a caption and content for this reminder: ");
        System.out.print("Caption: ");
        reminderCaption = scan.nextLine();
        System.out.print("Content: ");
        reminderContent = scan.nextLine();

        System.out.println("Please enter the time for this reminder to notify you: ");
        boolean check = false;
        do {
            System.out.print("Format is 'M/d/yyyy h:mm AM/PM' (e.g., 4/24/2042 4:42 PM): ");
            timeString = scan.nextLine();

            DateFormat dateParseTest = new SimpleDateFormat("M/d/yyyy h:mm a");
            try {
                dateParseTest.parse(timeString);
                check = false;
            } catch (ParseException e) {
                System.out.println("Please try again");
                check = true;
            }
        } while (check);

        notifyUser();
    }

    // Deletes the reminder
    void deleteReminder()
    {
        if(this.cancel()) {
            System.out.println("This reminder has been removed!");
        }
        else {
            System.out.println("There is no reminder to delete!");
        }
    }

    // Internal method to schedule the reminder for a specific date and time
    private void notifyUser()
    {  
        DateFormat dateFormatter = new SimpleDateFormat("M/d/yyyy h:mm a");
        try {
            time = dateFormatter.parse(timeString);
            Timer timer = new Timer();
            timer.schedule(this, time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    } 

    // Internal method to trigger a Desktop notification with reminder info
    private void displayReminder(String caption, String text) throws AWTException
    {
        SystemTray tray = SystemTray.getSystemTray();

        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");

        TrayIcon trayIcon = new TrayIcon(image, "Tray Reminder");
        trayIcon.setImageAutoSize(true);
        tray.add(trayIcon);

        trayIcon.displayMessage(caption, text, MessageType.INFO);
    }

    // Execution method for TimerTask
    @Override
    public void run()
    {
        try {
            displayReminder(reminderCaption, reminderContent);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}