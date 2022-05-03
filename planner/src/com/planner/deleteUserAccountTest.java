package com.planner;

import junit.framework.*;
//William Fenlon
/**
 * Write a description of class deleteUserAccountTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deleteUserAccountTest extends TestCase
{
    public static void main(String[] args){
        junit.textui.TestRunner.run(deleteUserAccountTest.class);
    }
    
    public void testdeleteUserAccount()
    {
        assertEquals(false, Controller.login("username", "password"));
        Controller.createAccount("username", "password");
        assertEquals(true, Controller.login("username", "password"));
        Controller.deleteAccount("username");
        assertEquals(false, Controller.login("username", "password"));
    }
}
