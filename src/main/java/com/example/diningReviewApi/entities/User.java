package com.example.diningReviewApi.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name = "USER")
@NoArgsConstructor
public class User {

    @Id
    @Getter
    @Setter
    private Long userId;

    @Column(name = "CITY")
    @Getter
    @Setter
    private String city;

    @Column(name = "STATE")
    @Getter
    @Setter
    private String state;

    @Column(name = "ZIP_CODE")
    @Getter
    @Setter
    private Long zipCode;

    @Column(name = "PEANUT_INTEREST")
    @Getter
    @Setter
    private Boolean peanutInterest;

    @Column(name = "EGG_INTEREST")
    @Getter
    @Setter
    private Boolean eggInterest;

    @Column(name = "DAIRY_INTEREST")
    @Getter
    @Setter
    private Boolean dairyInterest;
}
