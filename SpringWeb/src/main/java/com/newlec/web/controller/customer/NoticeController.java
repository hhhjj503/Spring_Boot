package com.newlec.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlec.web.entity.Notice;
import com.newlec.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Notice> list = service.getList();
		
		model.addAttribute("test","hello devTools");
		model.addAttribute("list",list);
		return "customer.notice.list";
	}
	  
	@GetMapping("detail") 
	public String detail() {
		return "customer.notice.detail";
	}
	
}
