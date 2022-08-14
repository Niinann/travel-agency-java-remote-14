package com.sda.travelagency.entity;

public enum MealType {
    BREAKFASTS("Breakfast"),
    LUNCH("Delicious lunch"),
    DINNER("Big choice of meats"),
    SNACKS("Variety of snacks"),
    DRINKS(" Drrinks!"),
    HB("Breakf.pluss Dinner"),
    ALL_INCLUSIVE("ALL!");

    private String mealDescription;

    MealType(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealDescription() {
        return mealDescription;
    }
}
