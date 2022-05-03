package com.planner;

import junit.framework.*;
//William Fenlon
//white box testing
public class loginTest extends TestCase
{
    public static void main(String[] args){
        junit.textui.TestRunner.run(loginTest.class);
    }
        
    public void testLoginTestCorrectInfo()
    {
        assertEquals(true, Controller.login("test", "test"));
    }
    
    public void testLoginTestCorrectUserName()
    {
        assertEquals(false, Controller.login("test", "notTest"));
    }
    
    public void testLoginTestCorrectPassword()
    {
        assertEquals(false, Controller.login("notTest","test"));
    }
    
    public void testLoginTestNoCorrect()
    {
        assertEquals(false, Controller.login("notTest","notTest"));
    }
    
    public void testLoginTestBlankInfo()
    {
        assertEquals(false, Controller.login("",""));
    }
    
    public void testLoginTestCorrectUsernameBlankPassword()
    {
        assertEquals(false, Controller.login("test",""));
    }
    
    public void testLoginTestBlankUserNameCorrectPassword()
    {
        assertEquals(false, Controller.login("","test"));
    }
}





