package de.htwberlin.gaestebuch.service;

import de.htwberlin.gaestebuch.persistence.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ReviewService {
    
    @Autowired
    private final ReviewRepository reviewRepository;


    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }
    
    
    
    public void saveName(String nameToSave){
        reviewRepository.saveName(nameToSave);
    }

    public void saveReview(String reviewToSave) {
        reviewRepository.saveReview(reviewToSave);
    }
    
    
    
    /*public List<Review> findAll(){
        List<ReviewEntity> reviews = reviewRepository.findAll();
        return reviews.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }*/
    
    public Optional<String> findName(String searchName){
        List<String> names = reviewRepository.getNames();
        return names.stream()
                .filter(name -> name.equals(searchName))
                .findFirst();
    }

    public Optional<String> findReviews(String searchReview) {
        List<String> reviews = reviewRepository.getReviews();
        return reviews.stream()
                .filter(review -> review.equals(searchReview))
                .findFirst();
    }

    public String isSubmitted(String name, String review) {
        if (name == null || name.isEmpty() || review == null || review.isEmpty()) {
            return "Please write your name and review";
        }

        String searchReview = name + ": " + review;
        return reviewRepository.getReviews().stream()
                .filter(existingReview -> existingReview.equals(searchReview))
                .findFirst()
                .map(x -> "Submitted")
                .orElse("Not Submitted");
    }
    

   /* public List<Review> findAllIsSubmittedTrue() {
        List<ReviewRepository> reviews = reviewRepository.findAllByIsSubmittedTrue();
        return reviews.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }*/

   /* public Review findById(Long id) {
        var reviewEntity = reviewRepository.findById(id);
        return reviewEntity.map(this::transformEntity).orElse(null);
    }*/

    /*public Review createReview(AddNameRequest request){
        var review = new ReviewRepository(request.getName(), request.getReview(), request.getIsSubmitted());
        reviewEntity = reviewRepository.save(reviewEntity);
        return transformEntity(reviewEntity);
    }*/

   /* public Review update(Long id, AddNameRequest request) {
        var reviewEntityOptional = reviewRepository.findById(id);
        if (reviewEntityOptional.isEmpty()) {
            return null;
        }
        var reviewEntity = reviewEntityOptional.get();
        reviewEntity.setName(request.getName());
        reviewEntity.setReview(request.getName());
        reviewRepository.save(reviewEntity);

        return transformEntity(reviewEntity);

    }*/

    /*public Review updateIsSubmitted(Long id, AddNameRequest request) {
        var reviewEntityOptional = reviewRepository.findById(id);
        if (reviewEntityOptional.isEmpty()) {
            return null;
        }
        var reviewEntity = reviewEntityOptional.get();
        reviewEntity.setIsSubmitted(request.getIsSubmitted());
        reviewRepository.save(reviewEntity);

        return transformEntity(reviewEntity);
    }*/

  /*  public boolean deleteById(Long id) {
        if (!reviewRepository.existsById(id)) {
            return false;
        }

        reviewRepository.deleteById(id);
        return true;
    }
    

    private Review transformEntity(ReviewRepository reviewRepository) {
        return new Review(
                reviewRepository.getNames(),
                reviewRepository.getReviews(),
                reviewRepository.getSubmit());
    }*/
}
