
/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Profile{
    private String occupation;
    private String occupationTitle;
    private String location;

    public Profile(){
        this.getOccupation();
        this.getOccupationTitle();
        this.getLocation();
    }

    public Profile(String occupation, String occupationTitle, String location){
        editProfile(occupation, occupationTitle, location);
    }
    
    public void createProfile(String occupation, String occupationTitle, String location){
        editProfile(occupation, occupationTitle, location);
    }

    public void editProfile(String occupation, String occupationTitle, String location){
        setOccupation(occupation);
        setOccupationTitle(occupationTitle);
        setLocation(location);
    }

    private void setOccupation(String occupation){
        this.occupation = occupation;
    }

    private void setOccupationTitle(String occupationTitle){
        this.occupationTitle = occupationTitle;
    }

    private void setLocation(String location){
        this.location = location;
    }

    public String getOccupation(){
        return occupation;
    }

    public String getOccupationTitle(){
        return occupationTitle;
    }

    public String getLocation(){
        return location;
    }
    

}
