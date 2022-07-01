package com.example.diningReviewApi.controller;

import com.example.diningReviewApi.repository.DiningReviewRepository;
import com.example.diningReviewApi.repository.RestaurantRepository;
import com.example.diningReviewApi.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dining")
public class DiningReviewController {
    DiningReviewRepository diningReviewRepository;
    RestaurantRepository restaurantRepository;
    UserRepository userRepository;

    public DiningReviewController(DiningReviewRepository diningReviewRepository, RestaurantRepository restaurantRepository, UserRepository userRepository){

        this.diningReviewRepository = diningReviewRepository;
        this.restaurantRepository = restaurantRepository;
        this.userRepository = userRepository;

    }
}
