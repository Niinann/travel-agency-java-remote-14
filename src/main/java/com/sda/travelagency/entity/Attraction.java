package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Attraction {
    String description;

    //limit age??
    AgeRestrictions ageRestrictions;

    List<String> photos;



}
