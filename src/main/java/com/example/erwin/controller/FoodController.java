package com.example.erwin.controller;

import com.example.erwin.Repository.FoodRepository;
import com.example.erwin.entity.Food;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.erwin.service.*;


@CrossOrigin("*")
@RestController
@RequestMapping("")
public class FoodController {
    
    @Autowired
    private FoodService foodService;
    @Autowired
    private FoodRepository foodRepository;

    @GetMapping("/foods")
    public Iterable<Food> findAll() {
        return foodService.findAll();
    }

    @GetMapping("/food/{id}")
    public Food findOne(@PathVariable("id") long id) {
        return foodService.findOne(id);
    }

    @PostMapping("/foods")
    public Food save(@RequestBody Food food) {
        return foodService.save(food);
    }

    @PatchMapping("/food/{id}")
    public ResponseEntity<Food> findById(@PathVariable("id") long id, @RequestBody Food food) {
        Food getFood = foodRepository.findById(id);

        getFood.setName(food.getName());
        getFood.setTutorialLink(food.getTutorialLink());
        getFood.setIngredients(food.getIngredients());
        getFood.setArea(food.getArea());
        getFood.setDescriptions(food.getDescriptions());
        getFood.setBahan1(food.getBahan1());
        getFood.setBahan2(food.getBahan2());
        getFood.setBahan3(food.getBahan3());
        getFood.setAmount1(food.getAmount1());
        getFood.setAmount2(food.getAmount2());
        getFood.setAmount3(food.getAmount3());
        getFood.setUnit1(food.getUnit1());
        getFood.setUnit2(food.getUnit2());
        getFood.setUnit3(food.getUnit3());

        Food updateTodo = foodRepository.save(getFood);

        return ResponseEntity.ok().body(updateTodo);
    }

  @DeleteMapping("/food/{id}")
public ResponseEntity<String> removeOne(@PathVariable("id") long id) {
    Food removedFood = foodService.removeOne(id);

    if (removedFood != null) {
        return ResponseEntity.ok("Food with ID " + id + " has been successfully deleted.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food with ID " + id + " not found.");
    }
}


}

