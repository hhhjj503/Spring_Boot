package com.newlec.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlec.web.dao.NoticeDao;
import com.newlec.web.entity.Notice;
import com.newlec.web.entity.NoticeView;

@Service
public class NoticeServiceImp implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<NoticeView> getList(int page, String field, String query) {
		
		int size = 10;
		int offset = 0+(page-1)*size;
		List<NoticeView> list = noticeDao.getList(size, field, query, offset);
		return list;
	}

	@Override
	public Notice get(int id) {
		Notice notice = noticeDao.get(id);
		return notice;
	}

}
