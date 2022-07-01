package com.example.diningReviewApi.repository;

import com.example.diningReviewApi.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
}
