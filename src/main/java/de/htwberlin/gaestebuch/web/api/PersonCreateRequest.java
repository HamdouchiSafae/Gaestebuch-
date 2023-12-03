package de.htwberlin.gaestebuch.web.api;

public class PersonCreateRequest {

    private String firstName;
    private String lastName;
    private boolean invited;

    public PersonCreateRequest(String firstName, String lastName, boolean invited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.invited = invited;
    }

    public PersonCreateRequest() {}

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

    public boolean isInvited() {
        return invited;
    }

    public void setInvited(boolean invited) {
        this.invited = invited;
    }
}
