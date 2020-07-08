package com.hotel.booking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.booking.entity.OrderDetails;

@Repository
public interface OrderDetailsRepository  extends CrudRepository<OrderDetails, Long> {

}
