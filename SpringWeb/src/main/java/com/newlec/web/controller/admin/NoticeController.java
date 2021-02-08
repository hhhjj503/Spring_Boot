package com.newlec.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("test","hello devTools");
		return "admin.board.notice.list";
	}
	   
	@GetMapping("detail")
	public String detail() {
		return "admin.board.notice.detail";
	}
	  
	@GetMapping("reg")
	public String reg() {
		return "admin.board.notice.reg";
	}
}
