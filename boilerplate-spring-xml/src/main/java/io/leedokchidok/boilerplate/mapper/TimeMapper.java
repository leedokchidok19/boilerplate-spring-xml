package io.leedokchidok.boilerplate.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeMapper {

	//Oracle
//	@Select("SELECT sysdate FROM dual")
//	public String getTime();

	//MySQL
	@Select("SELECT NOW()")
	public String getTime();

}
