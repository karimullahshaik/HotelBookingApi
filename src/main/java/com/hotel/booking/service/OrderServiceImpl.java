package com.hotel.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.booking.entity.OrderDetails;
import com.hotel.booking.repository.OrderDetailsRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDetailsRepository orderDetailsRepository;

	@Override
	public OrderDetails createOrder(OrderDetails orderDetails) {
		return orderDetailsRepository.save(orderDetails);
	}

}
