package de.htwberlin.gaestebuch.persistence;

import de.htwberlin.gaestebuch.web.api.Person;
import jakarta.persistence.*;


@Entity(name = "persons")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="first_Name",nullable = false)
    private String firstName;
    @Column(name="last_Name",nullable = false)
    private String lastName;
    @Column(name="is_invited")
    private Boolean invited;

    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;


    public PersonEntity(String firstName, String lastName, Boolean invited, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.invited = invited;
        this.gender = gender;
    }


    protected PersonEntity(){}

   /* public PersonEntity(String firstName, String lastName, boolean invited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.invited = invited;
        }
   */

    public Long getId(){
        return id;
    }


    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName= firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName= lastName;
    }

    public Boolean getInvited(){
        return invited;
    }

    public void setInvited(Boolean invited){
        this.invited=invited;
    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
