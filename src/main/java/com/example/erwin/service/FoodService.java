package com.example.erwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erwin.Repository.FoodRepository;
import com.example.erwin.entity.Food;

@CrossOrigin("*")
@RestController
@RequestMapping("")
public class FoodService {
     @Autowired
    private FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Food save(Food food) {
        return foodRepository.save(food);
    }

    public Iterable<Food> findAll() {
        return foodRepository.findAll();
    }

    public Food findOne(long id) {
        return foodRepository.findById(id);
    }

    public Food removeOne(long id) {
        Food foodToRemove = foodRepository.findById(id);
    
        if (foodToRemove != null) {
            foodRepository.deleteById(id);
            return foodToRemove;
        }
    
        return null; 
    }
    
}
