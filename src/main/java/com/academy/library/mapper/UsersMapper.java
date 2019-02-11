package com.academy.library.mapper;
import java.util.List;

import com.academy.library.dto.Users;
public interface UsersMapper {
	
	public List<Users> usersSelect();
	
	public Users usersSelectOne(Users users);
	
	public int usersInsert(Users users);
	
	public int usersUpdate(Users users);
	
	public int usersDelete(Users users);
}
