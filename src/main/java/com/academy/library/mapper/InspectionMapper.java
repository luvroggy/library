package com.academy.library.mapper;

import java.util.List;

import com.academy.library.dto.Inspection;

public interface InspectionMapper {
	public List<Inspection> inspectionSelect();
	public List<Inspection> inspectionSelectJoin();
	public Inspection inspectionSelectOne(Inspection inspection);
	public List<Inspection> requestUserId(String userId);
	public int inspectionInsert(Inspection inspection);
	public int inspectionUpdate(Inspection inspection);
	public int inspectionDelete(Inspection inspection);
}
