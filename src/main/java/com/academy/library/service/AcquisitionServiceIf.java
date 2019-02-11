package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Acquisition;

public interface AcquisitionServiceIf {

	public abstract List<Acquisition> getJoinAcquisition();
	
	public abstract int insert(Acquisition acquisition);
	

	public abstract int update(Acquisition acquisition);
	

	public abstract int delete(Acquisition acquisition);
	
	public abstract int acqJoin(String id);
	
	
	public abstract Acquisition get(Acquisition acquisition);
	

	public abstract List<Acquisition> getAllAcquisition();
	
}
