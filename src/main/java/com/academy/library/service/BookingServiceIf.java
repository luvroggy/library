package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Booking;

public interface BookingServiceIf {


	public abstract int insert(Booking booking);
	

	public abstract int update(Booking booking);
	

	public abstract int delete(Booking booking);
	
	
	public abstract Booking get(Booking booking);
	

	public abstract List<Booking> getAllBooking();
	
}
