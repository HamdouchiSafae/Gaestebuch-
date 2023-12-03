package de.htwberlin.gaestebuch.web.api;


import java.util.List;

public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private boolean invited;
    private List<Long> kids;

    public Person(long id, String firstName, String lastName, boolean invited, List<Long> kids) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.invited = invited;
        this.kids = kids;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public List<Long> getKids() {
        return kids;
    }

    public void setKids(List<Long> kids) {
        this.kids = kids;
    }

}

