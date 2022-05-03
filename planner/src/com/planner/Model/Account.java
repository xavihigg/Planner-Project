package com.planner.Model;

import java.util.ArrayList;


public class Account{
    public static ArrayList<Task> tasks = new ArrayList<Task>();
    public static ArrayList<Category> categories = new ArrayList<Category>();
    public static Calendar calendar;
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
    
    public boolean createProfile(String occupation, String occupationTitle, String location){
        if(profile == null){
            profile = new Profile();
            profile.createProfile(occupation, occupationTitle, location);
            return true;
        }
        else{
            return false;
        }
    }
    
    public String viewOccupation(){
        if(profile == null){
            return "null";
        }
        return profile.getOccupation();
    }
    
    public String viewTitle(){
        if(profile == null){
            return "null";
        }
        return profile.getOccupationTitle();
    }
    
    public String viewLocation(){
        if(profile == null){
            return "null";
        }
        return profile.getLocation();
    }
    
    public void editProfile(String occupation, String occupationTitle, String location){
        profile.editProfile(occupation, occupationTitle, location);
    }
    
    public void deleteProfile(){
        profile = null;
    }
}
