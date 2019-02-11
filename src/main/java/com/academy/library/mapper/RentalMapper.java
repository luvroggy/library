package com.academy.library.mapper;

import java.util.List;

import com.academy.library.dto.Rental;

public interface RentalMapper {

	public List<Rental> rentalSelect();
	
	public Rental rentalSelectOne(Rental rental);
	
	public int rentalInsert(Rental rental);
	
	public int rentalDelete(Rental rental);
	
	public int rentalUpdate(Rental rental);
	
	public int rentalTwice(Rental rental);
	
	public int rentalReturn(Rental rental);
	
	public List<Rental> rentalSelectbyUser(String userId);
}
