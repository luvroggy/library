package com.academy.library.dao;

import java.util.List;

import com.academy.library.dto.Booking;

public interface BookingDaoIf {
	
	public abstract List<Booking> getAllBooking();
	
	public abstract Booking get(Booking booking);
	
	public abstract int insert(Booking booking);
	
	public abstract int update(Booking booking);
	
	public abstract int delete(Booking booking);

}
