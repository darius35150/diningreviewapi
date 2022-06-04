package com.example.diningReviewApi.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.*;

@Entity
@Table(name = "DINING")
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;

    @Column(name = "RESTAURANT_NAME")
    @Getter
    @Setter
    private String restaurantName;

    @Column(name = "REVIEW_DESCR")
    @Getter
    @Setter
    private String reviewDescr;

    @Column(name = "USER_NAME")
    @Getter
    @Setter
    private String userName;

    @Column(name = "PEANUT_ALLERGY")
    @Getter
    @Setter
    private Integer peanutAllergy;

    @Column(name = "EGG_ALLERGY")
    @Getter
    @Setter
    private Integer eggAllergy;

    @Column(name = "DAIRY_ALLERGY")
    @Getter
    @Setter
    private Integer dairyAllergy;

    @Column(name = "AVERAGE_SCORE")
    @Getter
    @Setter
    private Integer averageScore;

    @Column(name = "OVERALL_SCORE")
    @Getter
    @Setter
    private Integer overallScore;
}
