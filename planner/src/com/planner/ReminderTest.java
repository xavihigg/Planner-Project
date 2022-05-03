package com.planner;

import com.planner.Model.*;

public class ReminderTest {
    public static void main(String [] args) {
        setReminderTest();
        deleteReminderTest();
        System.exit(1);
    }

    static Reminder r = new Reminder();

    public static void setReminderTest()
    {
        r.setReminder("ReminderTest", "This is a test", "5/3/2027 4:51 AM");
    }

    public static void deleteReminderTest()
    {
        if(r.deleteReminder()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}