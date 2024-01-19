/*package de.htwberlin.gaestebuch.persistence;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity(name = "reviews")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", updatable = false, nullable = false)
    private Long id;
    
    @Column(name="Name",nullable = false)
    private String name;
    
    @Column(name = "Review", nullable = false)     //Liste von Reviews 
    private String review;
     // isSubmited
    @Column(name = "isSubmitted", nullable = false)
    private boolean isSubmitted;
    

    
    public ReviewEntity(String name, String review, boolean isSubmitted) {
        this.name = name;
        this.review = review;
        this.isSubmitted = isSubmitted;
    }
    


    protected ReviewEntity(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public boolean getIsSubmitted() {
        return isSubmitted;
    }

    public void setIsSubmitted(boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }
    
}*/
