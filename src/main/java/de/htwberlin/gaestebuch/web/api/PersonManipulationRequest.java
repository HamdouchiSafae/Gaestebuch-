package de.htwberlin.gaestebuch.web.api;

public class PersonManipulationRequest {

    private String firstName;
    private String lastName;
    private String gender;
    private boolean invited;

    public PersonManipulationRequest(String firstName, String lastName, String gender, boolean invited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.invited = invited;
    }

    public PersonManipulationRequest() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isInvited() {
        return invited;
    }

    public void setInvited(boolean invited) {
        this.invited = invited;
    }
}
