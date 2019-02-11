package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Booking;
import com.academy.library.mapper.BookingMapper;

@Repository(value="bookingDao")
public class BookingDaoImpl implements BookingDaoIf {
	
	@Autowired
	private SqlSessionFactory factory;
	
	public BookingDaoImpl() {}
	
	@Override
	public List<Booking> getAllBooking() {
		SqlSession session = factory.openSession();
		BookingMapper mapper = session.getMapper(BookingMapper.class);
		List<Booking> allBooking = null;
		try {
			allBooking = mapper.bookingSelect();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return allBooking;
	}

	@Override
	public Booking get(Booking booking) {
		SqlSession session = factory.openSession();
		BookingMapper mapper = session.getMapper(BookingMapper.class);
		Booking onebook = null;
		
		try {
			onebook = mapper.bookingSelectOne(booking);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return onebook;
	}

	@Override
	public int insert(Booking booking) {
		SqlSession session = factory.openSession(true);
		BookingMapper mapper = session.getMapper(BookingMapper.class);
		int count = 0;
		try {
			count = mapper.bookingInsert(booking);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int update(Booking booking) {
		SqlSession session = factory.openSession(true);
		BookingMapper mapper = session.getMapper(BookingMapper.class);
		int count = 0;
		try {
			count = mapper.bookingUpdate(booking);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return count;
	}

	@Override
	public int delete(Booking booking) {
		SqlSession session = factory.openSession(true);
		BookingMapper mapper = session.getMapper(BookingMapper.class);
		int count = 0;
		try {
			count = mapper.bookingDelete(booking);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

}
