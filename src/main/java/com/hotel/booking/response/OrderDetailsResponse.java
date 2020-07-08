package com.hotel.booking.response;


import com.hotel.booking.entity.OrderDetails;

import lombok.Data;

@Data
public class OrderDetailsResponse extends Response{
	OrderDetails orderDetails;
}
