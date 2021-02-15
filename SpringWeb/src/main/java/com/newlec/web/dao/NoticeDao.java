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
	
	List<NoticeView> getViewList(int size, String field, String query, int offset);
	int getCount(String field, String query);
	
	Notice get(int id);
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
	Notice getPrev(int id);
	Notice getNext(int id);	

	int updatePubAll(int[] pubs, int[] closes);
	int delAll(int[] ids);

	
}
