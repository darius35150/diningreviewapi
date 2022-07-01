package com.example.diningReviewApi.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DINING_REVIEW")
@NoArgsConstructor
public class DiningReview {

    @Id
    @Getter
    @Setter
    private Long restaurantId;

    @Column(name = "SUBMITTED_USER")
    @Getter
    @Setter
    private String submittedUser;

    @Column(name = "OPTIONAL_PEANUT_SCORE")
    @Getter
    @Setter
    private Integer optionalPeanutScore;

    @Column(name = "OPTIONAL_EGG_SCORE")
    @Getter
    @Setter
    private Integer optionalEggScore;

    @Column(name = "OPTIONAL_DAIRY_SCORE")
    @Getter
    @Setter
    private Integer optionalDairyScore;

    @Column(name = "OPTIONAL_COMMENTARY")
    @Getter
    @Setter
    private Integer optionalCommentary;
}
