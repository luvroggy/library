package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Rental;
import com.academy.library.mapper.RentalMapper;

@Repository(value="rentalDao")
public class RentalDaoImpl implements RentalDaoIf {

	@Autowired
	private SqlSessionFactory factory;
	
	public RentalDaoImpl() {
		super();
	}
	
	@Override
	public List<Rental> getAllRental() {
		SqlSession session = factory.openSession();
		RentalMapper mapper = session.getMapper(RentalMapper.class);
		List<Rental> allRental = null;
		try {
			allRental = mapper.rentalSelect();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return allRental;
}

	@Override
	public int insert(Rental rental) {
		SqlSession session = factory.openSession(true);
		RentalMapper mapper = session.getMapper(RentalMapper.class);
		int count = 0;
		try {
			count = mapper.rentalInsert(rental);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public Rental get(Rental rental) {
		SqlSession session = factory.openSession();
		RentalMapper mapper = session.getMapper(RentalMapper.class);
		Rental oneRe = null;
		
		try {
			oneRe = mapper.rentalSelectOne(rental);
		} finally {
			if(session != null)
				session.close();
		}
		
		return oneRe;
	}

	@Override
	public int update(Rental rental) {
		SqlSession session = factory.openSession(true);
		RentalMapper mapper = session.getMapper(RentalMapper.class);
		int count = 0;
		try {
			count = mapper.rentalUpdate(rental);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int delete(Rental rental) {
		SqlSession session = factory.openSession(true);
		RentalMapper mapper = session.getMapper(RentalMapper.class);
		int count = 0;
		try {
			count = mapper.rentalDelete(rental);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public List<Rental> getRentalbyUser(String userId) {
		SqlSession session = factory.openSession();
		RentalMapper mapper = session.getMapper(RentalMapper.class);
		List<Rental> allRental = null;
		try {
			allRental = mapper.rentalSelectbyUser(userId);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return allRental;
	}

	@Override
	public int rentalTwice(Rental rental) {
		SqlSession session = factory.openSession(true);
		RentalMapper mapper = session.getMapper(RentalMapper.class);
		int count = 0;
		try {
			count = mapper.rentalTwice(rental);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int rentalReturn(Rental rental) {
		SqlSession session = factory.openSession(true);
		RentalMapper mapper = session.getMapper(RentalMapper.class);
		int count = 0;
		try {
			count = mapper.rentalReturn(rental);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

}
