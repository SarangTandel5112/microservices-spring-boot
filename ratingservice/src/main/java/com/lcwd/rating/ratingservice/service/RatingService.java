package com.lcwd.rating.ratingservice.service;

import java.util.List;

import com.lcwd.rating.ratingservice.entities.Rating;

public interface RatingService {

    Rating addRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);

}
