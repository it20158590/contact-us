package demo.Service;

import demo.model.review;
import demo.Repository.reviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class reviewService {
    @Autowired
    private reviewRepository reviewRepository;

    public void adddetails(review review) {
        reviewRepository.save(review);
    }


}
