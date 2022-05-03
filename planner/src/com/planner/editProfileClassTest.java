package com.planner;

import junit.framework.*;
//William Fenlon
/**
 * Write a description of class editProfileClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class editProfileClassTest extends TestCase
{
    public static void main(String[] args){
        junit.textui.TestRunner.run(editProfileClassTest.class);
    }

    public void testcreateUserAccount()
    {
        assertEquals(false, Controller.login("username", "password"));
        Controller.createAccount("username", "password");
        assertEquals(true, Controller.login("username", "password"));
        Controller.createProfile("1","2","3");
        Controller.editProfile("3","1","2");
        assertEquals("3",Controller.viewOccupation());
        assertEquals("1",Controller.viewTitle());
        assertEquals("2",Controller.viewLocation());
        Controller.deleteAccount("username");
    }
}

