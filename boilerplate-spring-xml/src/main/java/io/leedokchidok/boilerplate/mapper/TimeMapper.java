package io.leedokchidok.boilerplate.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	//Oracle
//	@Select("SELECT sysdate FROM dual")
//	public String getTime();

	//MySQL
	@Select("SELECT NOW()")
	public String getTime();

}
