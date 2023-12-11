package com.example.erwin.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.erwin.entity.Food;

@Repository
public interface IngredientRepository extends CrudRepository <Food, Long> {
    Food findById(long id);
    Food findByName(String name);

}