package com.restaurent.management.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Getter
@Setter
@Document("FoodItem")
@ToString
public class FoodItem {
    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private String description;
    private String ingredients;
    private int price;

}
