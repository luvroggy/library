package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Inspection;
import com.academy.library.dto.Request;

public interface InspectionServiceIf {
	public abstract List<Inspection> getAllInspection();
	public abstract Inspection get(Inspection inspection);
	public abstract int insert(Inspection inspection);
	public abstract int update(Inspection inspection);
	public abstract int delete(Inspection inspection);
	public abstract List<Inspection> getUser(String userId);
	public abstract List<Inspection> getJoin();
}
