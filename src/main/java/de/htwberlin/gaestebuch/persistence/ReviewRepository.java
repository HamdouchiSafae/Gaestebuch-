package de.htwberlin.gaestebuch.persistence;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ReviewRepository {
    
    
    public List<String> names = new ArrayList<>();
    public List<String> reviews = new ArrayList<>();
    public Double submit;
    
    
    public List<String> getNames(){
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }
    
    public Double getSubmit() {
        return submit;
    }

    //Methode: 
    
    public void saveName(String nameToSave){
        names.add(nameToSave);
    }
    
    public void saveReview(String reviewToSave){
        reviews.add(reviewToSave);
    }
    
    
}
