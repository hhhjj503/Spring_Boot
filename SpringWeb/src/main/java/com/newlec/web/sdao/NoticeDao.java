package com.newlec.web.sdao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newlec.web.entity.Notice;
import com.newlec.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
	
	@Results({@Result(property = "memberName", column = "Member_Name")}) //여러개일때는 results 배열사용
	@Select("SELECT * FROM NOTICEVIEW  where ${field} like '%${query}%' order by ID DESC limit ${offset},${size};")
	List<NoticeView> getList(int size, String field, String query, int offset);
	
	
	Notice get(int id);

}
