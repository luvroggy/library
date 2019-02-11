package com.academy.library.mapper;

import java.util.List;

import com.academy.library.dto.Holdinginst;

public interface HoldinginstMapper {
	
	public List<Holdinginst> holdingSelect();

	public Holdinginst holdingSelectOne(Holdinginst holdinginst);
	
	public int holdinginstInsert(Holdinginst holdinginst);
	
	public int holdinginstDelete(Holdinginst holdinginst);
	
	public int holdinginstUpdate(Holdinginst holdinginst);

}
