package com.sda.travelagency.entity;

public enum MealType {
    BREAKFASTS("Breakfast"),
    LUNCH("Delicious lunch"),
    DINNER(".."),
    SNACKS("Variety of snacks"),
    DRINKS(" FDFFDFD"),
    HB("GGG"),
    ALL_INCLUSIVE("HHHH");

    private String mealDescription;

    MealType(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealDescription() {
        return mealDescription;
    }
}
