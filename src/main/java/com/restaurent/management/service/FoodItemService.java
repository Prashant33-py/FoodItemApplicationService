package com.restaurent.management.service;

import com.restaurent.management.model.FoodItem;

import java.util.List;

public interface FoodItemService {
    public List<FoodItem> getAllFoodItems();

    public void addFoodItems(List<FoodItem> newFoodItems);
    public void addFoodItem(FoodItem newFoodItem);
    public void updateFoodItem(String foodItemId, FoodItem updateFoodItem);
    public void deleteFoodItem(String foodItemId);
}
