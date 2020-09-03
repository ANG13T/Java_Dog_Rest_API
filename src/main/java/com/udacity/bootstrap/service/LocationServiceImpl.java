package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{
    @Autowired
    LocationRepository locationRepository;

    public List<Dog> retrieveLocations() {
        return (List<Dog>) locationRepository.findAll();
    }

}
