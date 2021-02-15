package com.newlec.web.service;

import java.util.List;

import com.newlec.web.entity.Notice;
import com.newlec.web.entity.NoticeView;

public interface NoticeService {

	List<NoticeView> getViewList();
	
	List<NoticeView> getViewList(String field, String query);
	
	List<NoticeView> getViewList(int page, String field, String query);

	Notice get(int id);

	int getCount();

	int getCount(String field, String query);

	// 일괄공개요청
	int updatePubAll(int[] pubs, int[] closes);

	// 일괄삭제요청
	int delAll(int[] ids);

	// 자세한 페이지
	Notice getPrev(int id);

	Notice getNext(int id);

	// 수정페이지를 요청할때
	int updateNotice(Notice notice);

	int delete(int id);

	int insert(Notice notice);

}
