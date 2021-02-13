package com.newlec.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newlec.web.entity.Notice;
import com.newlec.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
	
	List<NoticeView> getList(int size, String field, String query, int offset);
	
	Notice get(int id);
	
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
}
