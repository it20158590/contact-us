package demo.Controller;

import demo.Service.reviewService;
import demo.model.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("/review")
public class reviewController {

    @Autowired
    reviewService reviewService;

    @PostMapping("/review")
    public void add(@RequestBody review review) {
        reviewService.adddetails(review);
    }

}
