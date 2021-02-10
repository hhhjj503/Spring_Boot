package com.newlec.web.sdao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newlec.web.entity.Notice;

@Mapper
public interface NoticeDao {
	
	@Select("select * from notice")
	List<Notice> getList();
	
	Notice get(int id);

}
