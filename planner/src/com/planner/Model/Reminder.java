import java.util.*;
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.text.*;

public class Reminder extends TimerTask {
    
    protected Date time;
    protected String timeString;
    private String reminderCaption;
    private String reminderContent;

    // Sets reminder and schedules the notification
    void setReminder(String rcap, String rcont, String timestr)
    {  
        reminderCaption = rcap;
        reminderContent = rcont;
        timeString = timestr;
      
        notifyUser();
    }

    // Deletes the reminder. Returns status
    boolean deleteReminder()
    {
        return this.cancel();
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