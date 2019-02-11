package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Rental;

public interface RentalServiceIf {
	
	public abstract List<Rental> getAllRental();
	
	public abstract List<Rental> getRentalByUser(String userId);
	
	public abstract int rentalTwice(Rental rental);
	
	public abstract int reatalReturn(Rental rental);
	
	public abstract int insert(Rental rental);
	
	public abstract Rental get(Rental rental);
	
	public abstract int update(Rental rental);
	
	public abstract int delete(Rental rental);
}
