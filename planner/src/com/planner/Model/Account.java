package com.planner.Model;

import com.planner.Model.*;

import java.util.ArrayList;


public class Account{
    public Profile profile; 
    public String username; 
    public String password;

    public Account(){
        this.getusername();
        this.getPassword();
    }

    public Account(String username, String password){
        this.setusername(username);
        this.setPassword(password);
    }
    
    public void editAccount(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setusername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getusername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public boolean login(String usernameAttempt, String passwordAttempt){
        return (usernameAttempt.equals(username) && passwordAttempt.equals(password));
    }

    public boolean logout(){
        return true;
    }
    
    public void createProfile(String occupation, String occupationTitle, String location){
        profile = new Profile();
        profile.createProfile(occupation, occupationTitle, location);
    }
    
    public void editProfile(String occupation, String occupationTitle, String location){
        profile.editProfile(occupation, occupationTitle, location);
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