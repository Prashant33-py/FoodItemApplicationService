package com.restaurent.management.exceptions;

public class FoodItemNotFoundException extends RuntimeException {

    public FoodItemNotFoundException(String foodItemID) {
        super(getErrorMessage(foodItemID));
    }

    private static String getErrorMessage(String foodItemID) {
        return String.format("Food item not found with ID %s",foodItemID);
    }


}
