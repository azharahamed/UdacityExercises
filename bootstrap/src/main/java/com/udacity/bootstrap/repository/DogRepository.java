package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DogRepository extends CrudRepository<Dog, Long> {
    @Query("SELECT d.id, d.breed from Dog d WHERE d.id=:id")
    String findBreedById(Long id);

    @Query("SELECT d.id, d.breed FROM Dog d")
    List<String> findAllBreed();

    @Query("SELECT d.id, d.name FROM Dog d")
    List<String> findAllName();
}
