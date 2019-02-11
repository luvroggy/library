package com.academy.library.mapper;

import java.util.List;

import com.academy.library.dto.Code;

public interface CodeMapper {
	
	public List<Code> codeSelect();

	public Code codeSelectOne(String code);
	
	public List<Code> codeLike(String text);

}
