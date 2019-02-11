package com.academy.library.mapper;

import java.util.List;
import com.academy.library.dto.Booking;

public interface BookingMapper {
	
	public List<Booking> bookingSelect();

	public Booking bookingSelectOne(Booking booking);
	
	public int bookingInsert(Booking booking);
	
	public int bookingDelete(Booking booking);
	
	public int bookingUpdate(Booking booking);

}
