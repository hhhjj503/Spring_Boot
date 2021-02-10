package com.newlec.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlec.web.entity.Notice;
import com.newlec.web.sdao.NoticeDao;

@Service
public class NoticeServiceImp implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<Notice> getList() {
		List<Notice> list = noticeDao.getList();
		return list;
	}

	@Override
	public Notice get(int id) {
		Notice notice = noticeDao.get(id);
		return notice;
	}

}
