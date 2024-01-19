package de.htwberlin.gaestebuch.web;


import de.htwberlin.gaestebuch.service.ReviewService;
import de.htwberlin.gaestebuch.web.api.AddReviewRequest;
import de.htwberlin.gaestebuch.web.api.SubmitRequest;
import de.htwberlin.gaestebuch.web.api.AddNameRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReviewRestController {
    private final ReviewService reviewService;

    public ReviewRestController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    
    @PostMapping(path = "/api/v1/name")
    public ResponseEntity<String> saveNumber(@RequestBody AddNameRequest request){
        System.out.println("test");
        reviewService.saveName(request.getName());
        return new ResponseEntity<>(request.getName(), HttpStatus.CREATED);
    }

    @PostMapping(path = "/api/v1/review")
    public ResponseEntity<String> saveReview(@RequestBody AddReviewRequest request) {
        reviewService.saveReview(request.getReview());
        return new ResponseEntity<>(request.getReview(), HttpStatus.CREATED);
    }
    

   /* @GetMapping(path = "/api/v1/reviews")
    public ResponseEntity<List<String>> getReviews(){
        List<String> reviews = reviewService.findReviews();
        return ResponseEntity.ok(reviews);
    }*/

    /*@GetMapping(path = "/api/v1/reviews/submitted")
    public ResponseEntity<List<SubmitRequest>> fetchSubmittedReviews() {
        return ResponseEntity.ok(reviewService.findAllIsSubmittedTrue());
    }
    
    @GetMapping(path = "/api/v1/reviews/{id}")
    public ResponseEntity<SubmitRequest> fetchReviewsById(@PathVariable Long id) {
        var review = reviewService.findById(id);
        return review != null ? ResponseEntity.ok(review) : ResponseEntity.notFound().build();
    }

    @PostMapping(path = "/api/v1/review")
    public ResponseEntity<String> createReview(@RequestBody AddReviewRequest request) {
        reviewService.saveReview(request.getReview());
        return new ResponseEntity<>(request.getReview(), HttpStatusCode.valueOf(201));
    }

    @PutMapping(path = "/api/v1/reviews/{id}")
    public ResponseEntity<SubmitRequest> updateReview(@PathVariable Long id, @RequestBody AddNameRequest request) {
        var review = reviewService.update(id, request);
        return review != null ? ResponseEntity.ok(review) : ResponseEntity.notFound().build();
    }

    @PutMapping(path = "/api/v1/reviews/submitted/{id}")
    public ResponseEntity<SubmitRequest> updateIsSubmitted(@PathVariable Long id, @RequestBody AddNameRequest request) {
        var review = reviewService.updateIsSubmitted(id, request);
        return review != null ? ResponseEntity.ok(review) : ResponseEntity.notFound().build();
    }


    @DeleteMapping(path = "/api/v1/reviews/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
        boolean successful = reviewService.deleteById(id);
        return successful ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
    
    /*@GetMapping("/api/v1/persons{name}")
    public ResponseEntity<Review> writeName(){
        return ResponseEntity.ok());
    }
*/
/*    public ResponseEntity<Void> createPerson(@RequestBody PersonManipulationRequest request) throws URISyntaxException {
        var person  = personService.create(request);
        URI uri = new URI("/api/v1/persons" + person.getId());
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(path = "/api/v1/persons/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody PersonManipulationRequest request) {
        var person = personService.update(id, request);
        return person != null? ResponseEntity.ok(person) : ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/api/v1/persons/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        boolean successful = personService.deleteById(id);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }*/
}
