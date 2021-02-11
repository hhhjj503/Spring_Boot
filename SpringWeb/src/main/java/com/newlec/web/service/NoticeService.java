package com.newlec.web.service;

import java.util.List;

import com.newlec.web.entity.Notice;
import com.newlec.web.entity.NoticeView;

public interface NoticeService {

	List<NoticeView> getList(int page, String field, String query);
	
	Notice get(int id);
	

}
