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
	public List<NoticeView> getViewList() {
		getViewList(1, "title", "");
		return null;
	}

	@Override
	public List<NoticeView> getViewList(String field, String query) {
		getViewList(1, field, query);
		return null;
	}
	
	@Override
	public List<NoticeView> getViewList(int page, String field, String query) {
		
		int size = 10;
		int offset = 0+(page-1)*size;
		List<NoticeView> list = noticeDao.getViewList(size, field, query, offset);
		return list;
	}
	
	@Override
	public Notice get(int id) {
		Notice notice = noticeDao.get(id);
		return notice;
	}


	@Override
	public int getCount() {
		return getCount("title","");
		
	}

	@Override
	public int getCount(String field, String query) {
		return noticeDao.getCount(field,query);
		
	}

	@Override
	public int updatePubAll(int[] pubs, int[] closes) {
		return noticeDao.updatePubAll(pubs,closes);
	}

	@Override
	public int delAll(int[] ids) {
		// TODO Auto-generated method stub
		return noticeDao.delAll(ids);
	}

	@Override
	public Notice getPrev(int id) {
		return noticeDao.getPrev(id);
		 
	}

	@Override
	public Notice getNext(int id) {
		return noticeDao.getNext(id);
	}

	@Override
	public int updateNotice(Notice notice) {
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		return noticeDao.insert(notice);
	}


	

}
