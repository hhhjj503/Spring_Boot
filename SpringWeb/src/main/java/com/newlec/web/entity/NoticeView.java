package com.newlec.web.entity;

import java.util.Date;

public class NoticeView extends Notice {

	private String memberName;
	
	public NoticeView() {}

	public NoticeView(int id, String title, String writer_ID, String content, Date regDate, int hit, String files,
			boolean pub, String memberName) {
		super(id, title, writer_ID, content, regDate, hit, files, pub);
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
		
}
