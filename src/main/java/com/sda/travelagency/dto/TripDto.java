package com.sda.travelagency.dto;

import com.sda.travelagency.entity.Destination;
import com.sda.travelagency.entity.HotelFacilities;
import com.sda.travelagency.entity.Price;
import com.sda.travelagency.entity.SecurityRules;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record TripDto(
        LocalDate tripStartDate,
        LocalDate tripEndDate,
        Destination destination,

        //inside dto field can have even different type
        //because dto is only for data transfer
        String cost,

        String currency,

        Price tripPrice, // TODO: should we use dto???
        TransportType typeOfTransport,
        SecurityRulesDto SecurityRules,
        PaymentType paymentType,
        MealType mealType,
        HotelFacilitiesDto hotelFacilities, // TODO: use dto
        List<String> photos
) {
}