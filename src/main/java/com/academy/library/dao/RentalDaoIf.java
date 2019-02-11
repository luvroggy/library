package com.academy.library.dao;

import java.util.List;

import com.academy.library.dto.Rental;

public interface RentalDaoIf {

	public abstract List<Rental> getAllRental();
	
	public abstract List<Rental> getRentalbyUser(String userId);
	
	public abstract int rentalTwice(Rental rental);
	
	public abstract int rentalReturn(Rental rental);
	
	public abstract int insert(Rental rental);
	
	public abstract Rental get(Rental rental);
	
	public abstract int update(Rental rental);
	
	public abstract int delete(Rental rental);
}
