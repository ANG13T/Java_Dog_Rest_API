package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService{

    @Autowired DogRepository dogRepository;

    public List<Dog> retrieveDogs() {
        return (List<Dog>)dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>)dogRepository.findAllBreed();
    }

    public List<String> retrieveDogNames() {
        return (List<String>)dogRepository.findAllName();
    }


    public String retrieveDogBreedById(Long id) {
        return (String)dogRepository.findBreedById(id);
    }
}
