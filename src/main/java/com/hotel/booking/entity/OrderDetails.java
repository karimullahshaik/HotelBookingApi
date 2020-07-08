package com.hotel.booking.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;

@Data
@Entity
@Table(name = "ORDER_DETAILS")
public class OrderDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private double totalAmount;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_DETAILS_ID", nullable = false)
	@Cascade({ CascadeType.ALL })
	private CustomerDetails customerDetails;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HOTEL_DETAILS_ID", nullable = false)
	@Cascade({ CascadeType.ALL })
	private HotelDetails hotelDetails;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROOM_DETAILS_ID", nullable = false)
	@Cascade({ CascadeType.ALL })
	private RoomDetails roomDetails;

}
