package com.hotel.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.booking.entity.OrderDetails;
import com.hotel.booking.response.OrderDetailsResponse;
import com.hotel.booking.service.OrderService;

import io.swagger.annotations.ApiOperation;

@RestController
public class OrderDetailsController {
	
	@Autowired
	OrderService orderService;
	
	@ApiOperation(value = "This service Creates a Hotel Booking.", response = OrderDetailsResponse.class)
	@PostMapping(value = "/createOrder",consumes={MediaType.APPLICATION_JSON_VALUE}, produces = { MediaType.APPLICATION_JSON_VALUE })
	public OrderDetailsResponse createOrderDetails(@RequestBody OrderDetails orderDetails) {
		OrderDetailsResponse response = new OrderDetailsResponse();
		orderDetails = orderService.createOrder(orderDetails);
		response.setOrderDetails(orderDetails);
		return response;
	}
}
