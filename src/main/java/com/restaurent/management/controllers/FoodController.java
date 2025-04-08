package com.restaurent.management.controllers;

import com.restaurent.management.model.FoodItem;
import com.restaurent.management.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping("/get-all-food-items")
    private ResponseEntity<List<FoodItem>> getAllFoodItems(){
        return ResponseEntity.status(HttpStatus.OK).body(foodItemService.getAllFoodItems());
    }

    @PostMapping("/add-food-item")
    private HttpStatus addFoodItem(@RequestBody FoodItem foodItem){
        foodItemService.addFoodItem(foodItem);
        return HttpStatus.CREATED;
    }

    @PutMapping("/update-food-item/{id}")
    private HttpStatus updateFoodItem(@PathVariable("id") String foodItemId, @RequestBody FoodItem updateFoodItem){
        foodItemService.updateFoodItem(foodItemId, updateFoodItem);
        return HttpStatus.OK;
    }

    @DeleteMapping("/delete-food-item/{id}")
    private HttpStatus deleteFoodItem(@PathVariable("id") String foodItemId){
        foodItemService.deleteFoodItem(foodItemId);
        return HttpStatus.OK;
    }
}
