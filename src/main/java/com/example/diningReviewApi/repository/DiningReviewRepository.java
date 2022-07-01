package com.example.diningReviewApi.repository;

import com.example.diningReviewApi.entities.DiningReview;
import org.springframework.data.repository.CrudRepository;

public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {
}
