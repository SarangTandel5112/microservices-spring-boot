package com.lcwd.hotel.hotelservice.services;

import java.util.List;

import com.lcwd.hotel.hotelservice.entities.Hotel;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);

}
