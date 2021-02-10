package com.newlec.web.entity;

import java.util.Date;

public class Notice {
	
	private int id;
	private String title;
	private String writer_ID;
	private String content;
	private Date regDate;
	private int hit;
	private String files;
	private boolean pub;
	
	public Notice() {}

	public Notice(int id, String title, String writer_ID, String content, Date regDate, int hit, String files,
			boolean pub) {
		this.id = id;
		this.title = title;
		this.writer_ID = writer_ID;
		this.content = content;
		this.regDate = regDate;
		this.hit = hit;
		this.files = files;
		this.pub = pub;
	}
	
	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", writer_ID=" + writer_ID + ", content=" + content
				+ ", regDate=" + regDate + ", hit=" + hit + ", files=" + files + ", pub=" + pub + "]";
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter_ID() {
		return writer_ID;
	}

	public String getContent() {
		return content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public int getHit() {
		return hit;
	}

	public String getFiles() {
		return files;
	}

	public boolean isPub() {
		return pub;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setWriter_ID(String writer_ID) {
		this.writer_ID = writer_ID;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public void setFiles(String files) {
		this.files = files;
	}
	public void setPub(boolean pub) {
		this.pub = pub;
	}
	
}
