package com.planner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.planner.Model.*;
/**
 * Xavier Higgins Testing Use Cases
 */
class ControllerTest {


    @Test
    void getWeather() {
    }

    @Test
    void mergeEvent() {
        Calendar calendar = new Calendar();
        Category category = new Category("Sports", "green");
        Event event1 = new Event("title", "desc", "time", "daily", category);
        Event event2 = new Event("event2", "number 2", "time", "daily", category);
        Event event3 = new Event("event3", "number 3", "time", "daily", category);
        calendar.january.get(3).add(event1);
        calendar.january.get(3).add(event2);
        calendar.january.get(3).add(event3);
        assertEquals("event1 & event2", "event1 & event2");
    }

    @Test
    void mergeTask() {
    }

    @Test
    void sortTasks() {
    }

    @Test
    void generateSchedule() {
    }
}