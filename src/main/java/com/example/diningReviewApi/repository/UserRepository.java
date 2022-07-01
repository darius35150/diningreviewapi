package com.example.diningReviewApi.repository;

import com.example.diningReviewApi.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
