package com.lcwd.hotel.hotelservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.hotelservice.entities.Hotel;
import com.lcwd.hotel.hotelservice.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.hotelservice.repositories.HotelRepository;
import com.lcwd.hotel.hotelservice.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return this.hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return this.hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return this.hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
    }

}
