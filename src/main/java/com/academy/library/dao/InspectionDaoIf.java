package com.academy.library.dao;

import java.util.List;

import com.academy.library.dto.Inspection;
import com.academy.library.dto.Request;

public interface InspectionDaoIf {
	public abstract List<Inspection> getAllInspection();
	public abstract List<Inspection> getSelectJoin();
	public abstract Inspection get(Inspection inspection);
	public abstract int insert(Inspection inspection);
	public abstract List<Inspection> getUser(String userId);
	public abstract int update(Inspection inspection);
	public abstract int delete(Inspection inspection);
}
