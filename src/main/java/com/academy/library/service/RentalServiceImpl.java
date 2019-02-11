package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.RentalDaoIf;
import com.academy.library.dto.Rental;

@Service(value="rentalService")
public class RentalServiceImpl implements RentalServiceIf {

	@Resource(name="rentalDao")
	private RentalDaoIf dao;
	
	@Override
	public List<Rental> getAllRental() {
		return dao.getAllRental();
	}

	@Override
	public int insert(Rental rental) {
		int successCnt = 0;
		
		successCnt = dao.insert(rental);
		
		return successCnt;
	}

	@Override
	public Rental get(Rental rental) {
		return dao.get(rental);
	}

	@Override
	public int update(Rental rental) {
		int successCnt = 0;
		
		if (get(rental) != null) {
			successCnt = dao.update(rental);
		}
		return successCnt;
	}

	@Override
	public int delete(Rental rental) {
		int successCnt = 0;
		if (get(rental) != null) {
			successCnt = dao.delete(rental);
		}
		return successCnt;
	}

	@Override
	public List<Rental> getRentalByUser(String userId) {
		return dao.getRentalbyUser(userId);
	}

	@Override
	public int rentalTwice(Rental rental) {
		int successCnt = 0;
		if (get(rental) != null) {
			successCnt = dao.rentalTwice(rental);
		}
		return successCnt;
	}

	@Override
	public int reatalReturn(Rental rental) {
		int successCnt = 0;
		if (get(rental) != null) {
			successCnt = dao.rentalReturn(rental);
		}
		return successCnt;
	}

}
