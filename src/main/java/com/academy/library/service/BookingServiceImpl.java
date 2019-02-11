package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.BookingDaoIf;
import com.academy.library.dto.Booking;

@Service(value="bookingService")
public class BookingServiceImpl implements BookingServiceIf {

	@Resource(name="bookingDao")
	private BookingDaoIf dao;
	

	public BookingServiceImpl() {	}

	@Override
	public int insert(Booking booking) {
		int successCnt = 0;
		// 이미 있는지 검사
		if (get(booking) == null) {
			successCnt = dao.insert(booking);
		}
		return successCnt;
	
	}

	@Override
	public int update(Booking booking) {
		int successCnt = 0;
		// 수정할 제품이 존재하는 경우만
		if (get(booking) != null) {
			successCnt = dao.update(booking);
		}
		return successCnt;
	}

	@Override
	public int delete(Booking booking) {
		int successCnt = 0;
		// 삭제할 제품이 존재하는 경우만
		if (get(booking) != null) {	
			successCnt = dao.delete(booking);
		}
		return successCnt;
	}

	@Override
	public Booking get(Booking booking) {
		return dao.get(booking);
	}

	@Override
	public List<Booking> getAllBooking() {
		return dao.getAllBooking();
	}

}
