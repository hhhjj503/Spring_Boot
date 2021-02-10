package com.newlec.web.service;

import java.util.List;

import com.newlec.web.entity.Notice;

public interface NoticeService {

	List<Notice> getList();
	
	Notice get(int id);
	

}
