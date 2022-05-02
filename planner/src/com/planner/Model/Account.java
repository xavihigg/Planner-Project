package com.planner.Model;

import com.planner.Model.*;

import java.util.ArrayList;


public class Account{
    public Profile profile; 
    public String userName; 
    public String password;

    public Account(){
        this.getUserName();
        this.getPassword();
    }

    public Account(String userName, String password){
        this.setUserName(userName);
        this.setPassword(password);
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public boolean login(String userNameAttempt, String passwordAttempt){
        return (userNameAttempt.equals(userName) && passwordAttempt.equals(password));
    }

    public boolean logout(){
        return true;
    }
    
    public void createProfile(String occupation, String occupationTitle, String location){
        if(profile == null){
            profile = new Profile();
            profile.createProfile(occupation, occupationTitle, location);
        }
        else{
            profile.editProfile(occupation, occupationTitle, location);
        }
    }
    
    public void editProfile(String occupation, String occupationTitle, String location){
        if(profile == null){
            profile = new Profile();
            profile.createProfile(occupation, occupationTitle, location);
        }
        else{
            profile.editProfile(occupation, occupationTitle, location);
        }
    }
    
    public void getProfile(){
        if(profile != null){
            profile.getProfile();
        }
        else{
            System.out.println("This account does not have a profile");
        }
    }
}