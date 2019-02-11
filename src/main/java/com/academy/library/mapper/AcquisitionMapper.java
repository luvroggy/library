package com.academy.library.mapper;

import java.util.List;

import com.academy.library.dto.Acquisition;

public interface AcquisitionMapper {
	public List<Acquisition> acquisitionSelect();
	
	public Acquisition acquisitionSelectOne(Acquisition acquisition);
	
	public int acquisitionInsert(Acquisition acquisition);
	
	public int acquisitionUpdate(Acquisition acquisition);
	
	public int acquisitionDelete(Acquisition acquisition);
	
	public List<Acquisition> acquisitionSelectJoin();
	
	public int acquisitionSearchId(String id);
}
