package com.planner;

import junit.framework.*;
//William Fenlon
/**
 * Write a description of class createUserAccountTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class createUserAccountTest extends TestCase
{
    public static void main(String[] args){
        junit.textui.TestRunner.run(createUserAccountTest.class);
    }

    public void testcreateUserAccount()
    {
        assertEquals(false, Controller.login("username", "password"));
        Controller.createAccount("username", "password");
        assertEquals(true, Controller.login("username", "password"));
        Controller.deleteAccount("username");
    }
}

